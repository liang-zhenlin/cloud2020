package com.liang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liangzhenlin
 * @Desc
 * @date 2020/11/15 11:49 AM
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProvider9001 {

    public static void main(String[] args) {
        SpringApplication.run(NacosProvider9001.class, args);
    }
}
