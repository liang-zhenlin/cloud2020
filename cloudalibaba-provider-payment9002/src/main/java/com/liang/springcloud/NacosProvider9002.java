package com.liang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liangzhenlin
 * @Desc
 * @date 2020/11/15 12:08 PM
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProvider9002 {

    public static void main(String[] args) {
        SpringApplication.run(NacosProvider9002.class, args);
    }
}