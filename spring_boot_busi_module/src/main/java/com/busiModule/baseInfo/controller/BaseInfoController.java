package com.busiModule.baseInfo.controller;


import com.busiModule.BaseInfoClent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/baseInfo")
public class BaseInfoController {
    @Autowired
    private BaseInfoClent baseInfoClent;
    @Autowired
    RestTemplate restTemplate;
    @Value("${server.port}")
    private String serverPort;
    @GetMapping(value = "/query")
    public String query(String a) {
        System.out.println(a);
        return String.format("pan:%s",serverPort);
    }
    @GetMapping(value = "/feignTest")
    public String feignTest(String a) {
        return baseInfoClent.query(a);
    }
    @GetMapping(value = "/ribbonTest")
    public String ribbonTest(String a) {
        return restTemplate.getForEntity("http://spring-boot-node/node/baseInfo/query?a="+a, String.class).getBody();
    }
}
