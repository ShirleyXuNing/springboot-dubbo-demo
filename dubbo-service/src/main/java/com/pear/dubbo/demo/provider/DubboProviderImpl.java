package com.pear.dubbo.demo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.pear.dubbo.demo.api.DubboProvider;
import org.springframework.stereotype.Component;

@Service(version="1.0.0")
@Component
public class DubboProviderImpl implements DubboProvider {
    @Override
    public String sayHello(String name) {
        return "hello," + name;
    }
}
