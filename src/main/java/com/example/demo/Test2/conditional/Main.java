package com.example.demo.Test2.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);

        ListService listService = context.getBean(ListService.class);
        System.out.println("系统：" + context.getEnvironment().getProperty("os.name") + ";命令：" + listService.showListCmd());
        context.close();
    }
}
