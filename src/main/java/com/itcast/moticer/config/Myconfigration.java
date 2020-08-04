package com.itcast.moticer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Myconfigration {
    public static void main(String[] args) {
        System.out.println("dev数据");
        System.out.println("1111111master分支1111");
    }
    ///金大爷

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
