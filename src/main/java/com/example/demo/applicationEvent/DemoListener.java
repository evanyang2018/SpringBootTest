package com.example.demo.applicationEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    //实现ApplicationListener方法
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg= demoEvent.getMsg();
        System.out.println("我收到了Demobean的信息:"+msg);
    }
}
