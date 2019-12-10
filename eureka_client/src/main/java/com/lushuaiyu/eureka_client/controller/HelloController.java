package com.lushuaiyu.eureka_client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lushuaiyu
 */
@RestController
public class HelloController {
    /**
     * 载入DiscoveryClient实例
     */
    @Autowired
    private DiscoveryClient client;

    //@RequestMapping(value = "/index", method = RequestMethod.GET)
    //public String index() {
    //    /**
    //     * 根据eureka的发现功能，获取中心注册的服务实例列表
    //     */
    //    List<ServiceInstance> instances = client.getInstances("hello-service");
    //    for (int i = 0; i < instances.size(); i++) {
    //        System.err.println("hello,host:" + instances.get(i).getUri() + ",service_id:" + instances.get(i).getServiceId());
    //    }
    //    return "Hello World";
    //}


    @GetMapping(value = "/index")
    public String index() {
        return "indexmiaomiaomiao";
    }

}
