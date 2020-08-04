package com.itcast.moticer.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentServiceTest {
    @Autowired
    RestTemplate restTemplate;
    @BeforeEach
    void setUp() {
    }

    @Test
    void attu() {
        String html = restTemplate.getForObject("http://baidu.com",String.class);
        System.out.println("---2222222232423423432"+html);
    }
}