package cn.itcast.service.impl;

import cn.itcast.service.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public void sayHello(){
        System.out.println("I am HelloWorldService");
    }
}
