package com.liang.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@Slf4j
@EnableEurekaClient
@EnableCircuitBreaker
public class PaymentHystrix8005 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrix8005.class, args);
    }
}
