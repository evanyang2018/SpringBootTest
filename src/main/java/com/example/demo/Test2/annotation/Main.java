package com.example.demo.Test2.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        AnnotationDemoService demoService = context.getBean(AnnotationDemoService.class);
        demoService.outputResult();
        context.close();
    }
}
