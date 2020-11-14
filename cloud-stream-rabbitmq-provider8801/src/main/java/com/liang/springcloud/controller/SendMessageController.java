package com.liang.springcloud.controller;

import com.liang.springcloud.service.IMessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author liangzhenlin
 * @Desc
 * @date 2020/11/14 8:26 PM
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageService messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        return messageProvider.send();
    }
}
