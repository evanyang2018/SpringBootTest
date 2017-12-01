package com.example.demo.profiletest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProfileConfig.class);

        DemoBean demoBean = null;
//        demoBean = context.getBean(DemoBean.class);
//        System.out.println("第1次使用>>>>" + demoBean.getContext());

        //将活动的profile设置为 prod
        context.getEnvironment().setActiveProfiles("prod");
        //注册Bean配置类，不然会报bean未定义
        context.register(ProfileConfig.class);
        //刷新容器
        context.refresh();


        demoBean = context.getBean(DemoBean.class);
        System.out.println("第2次使用>>>>" + demoBean.getContext());

        context.close();
    }
}
