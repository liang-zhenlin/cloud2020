package com.liang.springcloud.service.impl;

import com.liang.springcloud.service.IMessageService;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author liangzhenlin
 * @Desc
 * @date 2020/11/14 8:05 PM
 */
@EnableBinding(Source.class)
public class MessageProviderServiceImpl implements IMessageService {

    @Resource
    private MessageChannel output;

    @Override
    public String send() {

        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("********* serial: " + serial);
        return null;
    }
}
