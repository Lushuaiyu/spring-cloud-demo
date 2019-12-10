package com.lushuaiyu.eureka_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lushuaiyu
 */
@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

    /**
     * 获取端口号
     */
    @Value("${server.port}")
    String port;

    /**
     * 定义一个简单接口
     *
     * @param name
     * @return
     */
    @GetMapping("/hi/{name}")
    public String home(@PathVariable String name) {
        return "hi " + name + ",I am from port :" + port;
    }

}
