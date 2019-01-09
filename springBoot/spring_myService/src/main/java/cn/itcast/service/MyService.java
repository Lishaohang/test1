package cn.itcast.service;

import cn.itcast.service.impl.HelloWorldServiceImpl;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfigureAfter(JmxAutoConfiguration.class)
@ConditionalOnBean(HelloWorldServiceImpl.class)
public class MyService {

    @Bean
    @ConditionalOnMissingBean
    public HelloWorldServiceImpl getHelloWorldService(){
        return new HelloWorldServiceImpl();
    }
}
