package com.itheima.nacos.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAutoConfiguration
@EnableDiscoveryClient
@SpringBootApplication
public class SpringRestProviderBootstrap {
    public static void main(String[] args) {

        SpringApplication.run(SpringRestProviderBootstrap.class,args);
    }
}
