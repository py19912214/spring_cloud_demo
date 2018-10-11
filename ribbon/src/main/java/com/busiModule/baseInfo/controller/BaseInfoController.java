package com.busiModule.baseInfo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/baseInfo")
public class BaseInfoController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping(value = "/query")
    public String add(String a) {
        //RestTemplate 拥有负载均轰的能力。会去根据名字去服务器按照一定的算法获取一个在用的地址 然后访问
        return restTemplate.getForEntity("http://spring-boot-node/node/baseInfo/query?a="+a, String.class).getBody();
    }
}
