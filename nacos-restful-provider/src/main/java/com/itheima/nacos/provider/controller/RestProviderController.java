package com.itheima.nacos.provider.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class RestProviderController {

    @GetMapping("/service")
    public String service(){
        System.out.println("provider service");
        return "provider invoke";
    }
}
