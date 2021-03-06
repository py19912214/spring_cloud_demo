package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * TODO
 *
 * @author: yuepan
 * @date: 2018/10/12
 */
@SpringBootApplication(scanBasePackages = "com")
@EnableEurekaClient
public class HystrixApplication {
    public static void main(String[] args) {
        //启动类
        SpringApplication.run(HystrixApplication.class, args);
        System.out.println("启动完成");
    }
}
