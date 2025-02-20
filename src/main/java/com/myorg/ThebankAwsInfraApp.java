package com.myorg;

import software.amazon.awscdk.App;
import software.amazon.awscdk.Environment;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.ec2.Vpc;

import java.util.Arrays;

public class ThebankAwsInfraApp {


    public static void main(final String[] args) {
        App app = new App();

        //sequencia de criação
        ThebankVpcStack vpcStack = new ThebankVpcStack(app, "Vpc");
        ThebankClusterStack clusterStack = new ThebankClusterStack(app, "Cluster", vpcStack.getVpc());
        clusterStack.addDependency(vpcStack);

        ThebankServiceStack thebankServiceStack = new ThebankServiceStack(app, "Service", clusterStack.getCluster() );
        thebankServiceStack.addDependency(clusterStack);

        app.synth();
    }



}

