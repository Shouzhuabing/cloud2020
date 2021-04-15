package com.ocean.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Lee
 * @date 2020/7/26 16:11
 */
@Slf4j
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/zk")
    public String paymentZk() {
        return "Springcloud with zookeeper:" + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
