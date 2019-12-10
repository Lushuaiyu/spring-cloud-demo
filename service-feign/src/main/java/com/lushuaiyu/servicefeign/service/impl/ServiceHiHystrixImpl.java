package com.lushuaiyu.servicefeign.service.impl;

import com.lushuaiyu.servicefeign.service.ServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author lushuaiyu
 */
@Component
public class ServiceHiHystrixImpl implements ServiceHi {
    @Override
    public String sayHiFromServiceHi(String name) {
        return "hello" + name + ", this message send failed";
    }
}
