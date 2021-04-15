package com.ocean.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Lee
 * @date 2020/9/19 16:30
 */
@Component
@FeignClient(value = "cloud-provider-hystrix-payment", fallback = PaymentFallbackService.class)
public interface PaymentHystrixService {
    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/timeOut/{id}")
    public String paymentInfo_Timeout(@PathVariable("id") Integer id);

}
