package com.busiModule.baseInfo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/baseInfo")
public class BaseInfoController {
    @Value("${server.port}")
    private String serverPort;
    @GetMapping(value = "/query")
    public String add(String a) {
        System.out.println(a);
        return String.format("pan:%s",serverPort);
    }
}
