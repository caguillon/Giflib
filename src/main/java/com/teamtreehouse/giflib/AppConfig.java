package com.teamtreehouse.giflib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class AppConfig {
    public static void main(String[] args) {
        // Runs our application -> creates a new application context
        SpringApplication.run(AppConfig.class, args);
    }
}
