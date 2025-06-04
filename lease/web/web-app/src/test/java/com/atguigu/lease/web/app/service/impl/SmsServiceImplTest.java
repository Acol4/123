package com.atguigu.lease.web.app.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SmsServiceImplTest {
    @Autowired
    private SmsServiceImpl smsServiceImpl;
    @Test
    void sendCode(){
        smsServiceImpl.sendSms("13851109692","4131");
    }
}