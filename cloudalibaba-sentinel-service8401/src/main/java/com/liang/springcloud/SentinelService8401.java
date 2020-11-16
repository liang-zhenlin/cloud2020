package com.liang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liangzhenlin
 * @Desc
 * @date 2020/11/15 10:59 PM
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelService8401 {

    public static void main(String[] args) {
        SpringApplication.run(SentinelService8401.class, args);
    }
}
