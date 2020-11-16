package com.liang.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangzhenlin
 * @Desc
 * @date 2020/11/15 11:00 PM
 */
@RestController
public class FlowLimitController {

    @GetMapping(value = "/testA")
    public String testA() {
        return "-------- testA";
    }

    @GetMapping(value = "/testB")
    public String testB() {
        return "-------- testB";
    }
}
