package com.liang.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangzhenlin
 * @Desc
 * @date 2020/11/15 12:09 PM
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/nacos/{id}")
    public String Payment(@PathVariable("id") Long id) {

        return "nacos registry, serverPort: " + serverPort + "\t id " + id;
    }

}
