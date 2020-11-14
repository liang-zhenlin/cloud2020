package com.liang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liangzhenlin
 * @Desc
 * @date 2020/11/13 10:51 AM
 */
@SpringBootApplication
@EnableEurekaClient
public class Gateway9527 {

    public static void main(String[] args) {

        SpringApplication.run(Gateway9527.class, args);
    }
}
