package com.lushuaiyu.servicefeign.controller;

import com.lushuaiyu.servicefeign.db.pojo.User;
import com.lushuaiyu.servicefeign.service.ServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lushuaiyu
 */
@RestController
public class IndexController {
    /**
     * 注入服务"service-hi"的Feign客户端ServiceHi
     */
    @Resource
    private ServiceHi serviceHi;

    /**
     * 调用Feign客户端提供的服务，自带负载均衡
     *
     * @param name
     * @return
     */
    @GetMapping("/hello/{name}")
    public String sayHi(@PathVariable String name) {
        //调用Feign客户端ScheduleServiceHi的接口
        return serviceHi.sayHiFromServiceHi(name);
    }



}
