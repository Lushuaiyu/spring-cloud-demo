package com.lushuaiyu.servicefeign.service;

import com.lushuaiyu.servicefeign.service.impl.ServiceHiHystrixImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author lushuaiyu
 */
@FeignClient(value = "SERVICE-HI", fallback = ServiceHiHystrixImpl.class)
public interface ServiceHi {


    @GetMapping("/hi/{name}")
    String sayHiFromServiceHi(@PathVariable(value = "name") String name);
}
