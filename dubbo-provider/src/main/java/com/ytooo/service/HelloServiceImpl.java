package com.ytooo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ytooo.api.HelloService;
import org.springframework.stereotype.Component;

@Component
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "222 " + name;
    }
}
