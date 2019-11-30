package com.techprimers.kubernetes.springcloudkubernetesconfigexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerComponent {

    @Autowired
    WelcomeConfiguration config;


    @Scheduled(fixedDelay = 3000)
    public void schedule() {
        System.out.println(config.getMessage());
    }
}
