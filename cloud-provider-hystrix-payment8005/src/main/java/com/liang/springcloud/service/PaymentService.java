package com.liang.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {

    public String paymentInfo_OK(Integer id) {

        return "线程池：  " + Thread.currentThread().getName()
                + "    paymentInfo_OK, id:  " + id + "\t" + "O(∩_∩)O哈哈~";
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")
    })
    public String paymentInfo_TimeOut(Integer id) {

        int num = 10 / 0;
        return "线程池：  " + Thread.currentThread().getName()
                + "    paymentInfo_TimeOut, id:  " + id;
    }

    public String paymentInfo_TimeOutHandler(Integer id) {

        return "线程池：  " + Thread.currentThread().getName()
                + "    paymentInfo_TimeOutHandler, id:  " + id + "\t" + "o(╥﹏╥)o";
    }
}
