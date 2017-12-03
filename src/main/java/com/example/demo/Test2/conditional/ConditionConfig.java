package com.example.demo.Test2.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {
    @Bean
    @Conditional(WindowsConditional.class)
    public WindowsListService windowsListService(){
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxConditional.class)
    public LinuxListService linuxListService(){
        return new LinuxListService();
    }
}
