package com.liang.springcloud.controller;

import com.liang.springcloud.entities.CommonResult;
import com.liang.springcloud.entities.Payment;
import com.liang.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {

        int result = paymentService.create(payment);
        log.info("******** 插入结果：" + result);

        if(result > 0) {
            return new CommonResult(200, "SUCCESS" + ", serverPort: " + serverPort, result);
        }else {
            return new CommonResult(404, "FAIL", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {

        Payment payment = paymentService.getPaymentById(id);
        log.info("******** 查询结果：" + payment + "哈哈哈哈哈");

        if(payment != null) {
            return new CommonResult(200, "SUCCESS" + ", serverPort: " + serverPort, payment);
        }else {
            return new CommonResult(404, "FAIL", null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for(String element : services) {
            log.info("************ element: " + element);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId() + "\t" + instance.getHost() + "\t" +
                    instance.getPort() + "\t" + instance.getUri());
        }

        return this.discoveryClient;

    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLb() {

        return serverPort;
    }

}
