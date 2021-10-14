# nacos-discovery
## 参考教程，B站黑马程序员
https://www.bilibili.com/video/BV17v411V79c
大概前12P内容，配置全部本地化，nacos仅作为服务注册及发现中心，未使用配置功能
部分代码与教程不一致，具体原因不明

## 本地环境
jdk 1.7
nacos 2.0.2
idea 2020.1
maven 3.6.3

## 配置问题mark
application.yml无法加载
bootstrap的配置文件加载顺序早于application配置文件
