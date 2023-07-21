package com.example.zad5;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class WelcomeMessageLogger implements CommandLineRunner {

    private String text;
    private Boolean shouldLog;

    public WelcomeMessageLogger(
            @Value("${pl.sdacademy.welcome.text.value}") String text,
            @Value("${pl.sdacademy.welcome.text.enable}") Boolean shouldLog) {
        this.text = text;
        this.shouldLog = shouldLog;
    }

    @Override
    public void run(String... args) throws Exception {
        if(Boolean.TRUE.equals(shouldLog)){
            log.info(text);
        }
    }
}