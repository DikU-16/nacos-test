package com.nacos.consumer.controller;

import com.nacos.consumer.client.ConClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author duanxu
 * @create 2020/8/28
 */
@RestController
@RefreshScope
public class ConController {

    @Value("${common.name}")
    private String configName;

    @Autowired
    private ConClient conClient;

    @GetMapping("/all")
    public String getAllConfigName(){
        return "provider configname : "+conClient.getConfigName()+
                                "----------->"+"consumer configname : "+ configName;
    }
}
