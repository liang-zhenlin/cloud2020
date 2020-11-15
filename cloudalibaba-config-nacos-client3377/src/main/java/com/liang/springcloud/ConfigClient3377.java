package com.liang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liangzhenlin
 * @Desc
 * @date 2020/11/15 2:43 PM
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClient3377 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient3377.class, args);
    }
}
