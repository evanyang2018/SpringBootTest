package com.example.demo.Test2.annotation;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public void outputResult(){
        System.out.println("从组合注解配置照样获取bean");
    }
}
