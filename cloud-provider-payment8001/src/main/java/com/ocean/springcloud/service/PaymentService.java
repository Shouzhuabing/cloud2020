package com.ocean.springcloud.service;

import com.ocean.springcloud.entities.Payment;

/**
 * @author Lee
 * @date 2020/4/30 0:11
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
