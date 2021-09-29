package com.itheima.microservice.service2;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// ���� Dubbo ע�������Լ��ⲿ�����ã��� scanBasePackages ����ɨ��ָ�� Java ���������б�ע @Service �ķ���ӿ�ʵ���౩¶Ϊ Spring Bean���漴������ Dubbo ����
// https://nacos.io/zh-cn/docs/use-nacos-with-dubbo.html
@EnableDubbo(scanBasePackages = "com.itheima.microservice.service2.service")
@SpringBootApplication
public class Service2Bootstrap {
    public static void main(String[] args) {
        SpringApplication.run(Service2Bootstrap.class,args);
    }
}
