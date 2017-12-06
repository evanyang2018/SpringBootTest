package com.example.demo.Test2.taskScheduled;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

//    @Async
//    @Scheduled(fixedRate = 2000)
//    public void reportCurrentTime(){
//        try {
//            Thread.sleep(2500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("每隔2s执行一次：" + sdf.format(new Date()));
//    }
//
//    @Scheduled(cron = "10 26 21 ? * *")
//    public void fixTimeExecution(){
//        System.out.println("在指定时间执行 " + sdf.format(new Date()) );
//    }

}
