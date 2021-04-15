package com.ocean.springcloud.service.impl;

import com.ocean.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.ocean.springcloud.dao.PaymentDao;
import com.ocean.springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @author Lee
 * @date 2020/4/30 0:12
 */
@Slf4j
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
