package com.lushuaiyu.springcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 * @author lushuaiyu
 * @return
 */
@RestController
@RefreshScope
public class HelloController {

    @Value("${springcloud.hello}")
    private String hello;

    //@Resource
    //private Environment hello;

    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }
}
