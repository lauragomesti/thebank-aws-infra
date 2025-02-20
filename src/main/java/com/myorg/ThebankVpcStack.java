package com.myorg;

import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.ec2.Vpc;
import software.amazon.awscdk.services.ecs.Cluster;
import software.amazon.awscdk.services.ecs.ContainerImage;
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService;
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions;
import software.constructs.Construct;
// import software.amazon.awscdk.Duration;
// import software.amazon.awscdk.services.sqs.Queue;

public class ThebankVpcStack extends Stack {
    public ThebankVpcStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public ThebankVpcStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        Vpc vpc = Vpc.Builder.create(this, "TheBankVpc")
                .maxAzs(3)  // Default is all AZs in region
                .build();

      /*  Cluster cluster = Cluster.Builder.create(this, "MyCluster")
                .vpc(vpc).build();

        // Create a load-balanced Fargate service and make it public
        ApplicationLoadBalancedFargateService.Builder.create(this, "MyFargateService")
                .cluster(cluster)           // Required
                .cpu(512)                   // Default is 256
                .desiredCount(6)            // Default is 1
                .taskImageOptions(
                        ApplicationLoadBalancedTaskImageOptions.builder()
                                .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
                                .build())
                .memoryLimitMiB(2048)       // Default is 512
                .publicLoadBalancer(true)   // Default is false
                .build();*/
    }
}
