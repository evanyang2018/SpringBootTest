package com.example.demo.Test2.taskExecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AsyncConfig.class);
        AsyncTaskService service = context.getBean(AsyncTaskService.class);
        for(int i = 0 ;i<10; i++){
            System.out.println("i="+i);
            service.executeAsyncTask(i);
            service.executeAsyncTaskPlus(i);
        }
        context.close();
    }
}
