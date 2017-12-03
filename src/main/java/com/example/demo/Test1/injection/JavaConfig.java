package com.example.demo.Test1.injection;

import org.springframework.context.annotation.Bean;

public class JavaConfig {
    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    //方法1
//    @Bean
//    public UseFunctionService useFunctionService(){
//        UseFunctionService useFunctionService = new UseFunctionService();
//        useFunctionService.setFunctionService(functionService());
//        return useFunctionService;
//    }
    //方法2
    //使用已经在spring 容器中存在的bean 作为参数
    @Bean
    public UseFunctionService useFunctionService(FunctionService functionService){
        UseFunctionService useFunctionService = new UseFunctionService();
        //使用已经在spring 容器中存在的bean
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }


}
