package com.myorg;

import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.ec2.Vpc;
import software.amazon.awscdk.services.ecs.Cluster;
import software.amazon.awscdk.services.ecs.ContainerImage;
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService;
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions;
import software.constructs.Construct;


public class ThebankVpcStack extends Stack {
    private Vpc vpc;

    public ThebankVpcStack(final Construct scope, final String id) {

        this(scope, id, null);
    }

    public ThebankVpcStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

         this.vpc = Vpc.Builder.create(this, "TheBankVpc")
                .maxAzs(3)  // Default is all AZs in region
                .build();

    }

    public Vpc getVpc() {
        return vpc;
    }
}
