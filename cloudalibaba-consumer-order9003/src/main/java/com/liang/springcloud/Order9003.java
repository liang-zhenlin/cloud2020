package com.liang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liangzhenlin
 * @Desc
 * @date 2020/11/15 1:58 PM
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Order9003 {

    public static void main(String[] args) {
        SpringApplication.run(Order9003.class, args);
    }
}