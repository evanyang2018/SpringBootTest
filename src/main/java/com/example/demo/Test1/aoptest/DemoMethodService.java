package com.example.demo.Test1.aoptest;

import org.springframework.stereotype.Service;

@Service
public class DemoMethodService {
    public void add(){
        System.out.println("this is 普通 ADD 方法");
    }
}
