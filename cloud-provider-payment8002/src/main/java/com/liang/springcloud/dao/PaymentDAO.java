package com.liang.springcloud.dao;

import com.liang.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDAO {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
