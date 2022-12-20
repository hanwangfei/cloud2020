package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackServiceImpl implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----------paymentFallbackServiceImpl--paymentInfo_OK (*/ω＼*)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----------paymentFallbackServiceImpl--paymentInfo_TimeOut (*/ω＼*)";
    }
}
