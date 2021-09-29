package com.itheima.microservice.service1;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// ���� Dubbo ע�������Լ��ⲿ�����ã��� scanBasePackages ����ɨ��ָ�� Java ���������б�ע @Service �ķ���ӿ�ʵ���౩¶Ϊ Spring Bean���漴������ Dubbo ����
// https://nacos.io/zh-cn/docs/use-nacos-with-dubbo.html
@EnableDubbo(scanBasePackages = "com.itheima.microservice.service1.service")
@SpringBootApplication
public class Service1Bootstrap {
    public static void main(String[] args) {
        SpringApplication.run(Service1Bootstrap.class,args);
    }

}
