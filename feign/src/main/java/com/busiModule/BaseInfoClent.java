package com.busiModule;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * TODO
 *
 * @author: yuepan
 * @date: 2018/10/12
 */
@FeignClient("spring-boot-node")
public interface BaseInfoClent {
     /** 
      * @Description: feign测试 feign客户端
      * @Param: 
      * @return: 
      * @author: yuepan
      * -------------------------------------------
      * @Date: 2018/10/12
      * -----------------------------------------
      */ 
    @RequestMapping(method = RequestMethod.GET, value = "/node/baseInfo/query")
    public String query(@RequestParam("a") String a);
}
