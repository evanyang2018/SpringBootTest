package com.example.demo.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Evan Yang
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService ds1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService ds2 = context.getBean(DemoSingletonService.class);

        DemoPrototypeService dp1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService dp2 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService dp3 = (DemoPrototypeService)context.getBean("demoPrototypeService");

        System.out.println("ds2 == ds2====" + ds1.equals(ds2));
        System.out.println("dp1 == dp2====" + dp1.equals(dp2));
        System.out.println(dp3);

        context.close();
    }
}
