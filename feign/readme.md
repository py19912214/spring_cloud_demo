一定要在客户端的配置文件中添加 否则会爆异常：
com.netflix.client.ClientException: Load balancer does not have available server for client: spring-boot-node

ribbon:
  eureka:
    enabled: true
    
客户端的启动类添加：
//测试feign
@EnableFeignClients
//测试ribbon
@EnableDiscoveryClient