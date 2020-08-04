package com.itcast.moticer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Myconfigration {
    ///金大爷

    public static void main(String[] args) {
        System.out.println("11111111111");
    }
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
