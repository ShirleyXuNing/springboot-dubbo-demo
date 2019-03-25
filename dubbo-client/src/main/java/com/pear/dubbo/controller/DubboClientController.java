package com.pear.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pear.dubbo.demo.api.DubboProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class DubboClientController {

    @Reference(version = "1.0.0")
    private DubboProvider provider;

    @RequestMapping("hello")
    public String hello(String name){
        return provider.sayHello(name);
    }

}
