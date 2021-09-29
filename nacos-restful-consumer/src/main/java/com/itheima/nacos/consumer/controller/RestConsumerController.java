package com.itheima.nacos.consumer.controller;
import com.itheima.microservice.service1.api.Service1Api;
import com.itheima.microservice.service2.api.Service2Api;
import org.apache.catalina.valves.LoadBalancerDrainingValve;
import org.apache.dubbo.config.annotation.Reference;
import org.bouncycastle.util.encoders.UrlBase64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URL;

@RestController
public class RestConsumerController {

    @Value("${provider.address}")
    private String provider;

    @GetMapping("/service")
    public String service(){
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("http://" + provider + "/service", String.class);
        return "consumer invoke | " + result;
    }

    private String serviceId = "nacos-restful-provider";

    @Autowired
    LoadBalancerClient loadBalancerClient;


    @Reference
    Service1Api service1Api;

    @Reference
    Service2Api service2Api;


    @GetMapping("/service1")
    public String service1(){
        RestTemplate restTemplate = new RestTemplate();
        ServiceInstance serviceInstance = loadBalancerClient.choose(serviceId);
        URI url = serviceInstance.getUri();

        String result = restTemplate.getForObject(url
                + "/service", String.class);
        return "consumer invoke | " + result;
    }

    @GetMapping("/service2")
    public String service2(){
        // 远程调用service2
        String result = service2Api.dubboService2();
        return "consumer dubbo invoke | " + result;
    }


    @GetMapping("/service3")
    public String service3(){
        // 远程调用service2
        String result = service1Api.dubboService1();
        return "consumer dubbo invoke | " + result;
    }

}
