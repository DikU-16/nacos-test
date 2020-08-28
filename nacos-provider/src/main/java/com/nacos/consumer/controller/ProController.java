package com.nacos.consumer.controller;

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
public class ProController {

    @Value("${common.name}")
    private String configName;

    @GetMapping("/provider")
    public String getConfigName() {
        return configName;
    }
}
