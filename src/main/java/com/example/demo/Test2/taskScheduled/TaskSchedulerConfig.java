package com.example.demo.Test2.taskScheduled;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.example.demo.Test2.taskScheduled")
@EnableScheduling  //开启计划任务支持
@EnableAsync
public class TaskSchedulerConfig {

}
