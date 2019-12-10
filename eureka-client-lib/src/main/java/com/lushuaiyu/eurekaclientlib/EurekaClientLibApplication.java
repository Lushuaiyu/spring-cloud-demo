package com.lushuaiyu.eurekaclientlib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientLibApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientLibApplication.class, args);
    }

}
