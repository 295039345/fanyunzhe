package com.example.demo.timedTask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

/**
 * @author FanYunzhe
 * @date 2018/11/27
 */
@Component
public class TimedTaskTest {

    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(cron = "0 */1 * * * *")
    public void timeTask_1min(){

        System.out.println("==========定时任务========== 每分钟执行一次：" + df.format(System.currentTimeMillis()));

    }

    @Scheduled(cron = "0 0 8,18 * * *")
    public void timeTask_10s_30s_50s(){

        System.out.println("==========定时任务========== 每天8点,18点 各执行一次：" + df.format(System.currentTimeMillis()));

    }

    @Scheduled(cron = "0 0 0 * * *")
    public void timeTask_0(){

        System.out.println("==========定时任务========== 每天0/24点执行一次：" + df.format(System.currentTimeMillis()));

    }

}
