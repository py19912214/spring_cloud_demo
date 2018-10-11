package com.node;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "com")
@EnableSwagger2
@EnableEurekaClient
public class Node2Application
{
    public static void main( String[] args )
    {
        SpringApplication.run(Node2Application.class, args);
    }
}
