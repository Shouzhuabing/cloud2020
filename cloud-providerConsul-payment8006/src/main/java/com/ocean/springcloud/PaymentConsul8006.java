package com.ocean.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Lee
 * @date 2020/7/27 21:27
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsul8006 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentConsul8006.class,args);
    }
}
