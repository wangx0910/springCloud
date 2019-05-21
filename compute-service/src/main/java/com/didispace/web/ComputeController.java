package com.didispace.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

@RestController
public class ComputeController {

    private final Logger logger = Logger.getLogger(getClass());

    @Value("${server.port}")
    String port;
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/add" )
    public String add(@RequestParam String b) {
       return "hello"+b+"调用成功，服务接口为："+port;
    }

}