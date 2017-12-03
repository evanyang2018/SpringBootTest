package com.example.demo.Test1.aoptest;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {

    @Action(name="注解式拦截的add操作")
    public void add(){
        System.out.println("this is 注解拦截式 ADD 方法");
    }
}
