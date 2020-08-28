package com.nacos.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author duanxu
 * @create 2020/8/28
 */
@FeignClient(name = "nacos-provider")
public interface ConClient{
    @GetMapping("/provider")
    String getConfigName();
}
