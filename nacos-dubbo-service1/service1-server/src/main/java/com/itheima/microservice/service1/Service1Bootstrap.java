package com.itheima.microservice.service1;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// 激活 Dubbo 注解驱动以及外部化配置，其 scanBasePackages 属性扫描指定 Java 包，将所有标注 @Service 的服务接口实现类暴露为 Spring Bean，随即被导出 Dubbo 服务。
// https://nacos.io/zh-cn/docs/use-nacos-with-dubbo.html
@EnableDubbo(scanBasePackages = "com.itheima.microservice.service1.service")
@SpringBootApplication
public class Service1Bootstrap {
    public static void main(String[] args) {
        SpringApplication.run(Service1Bootstrap.class,args);
    }

}
