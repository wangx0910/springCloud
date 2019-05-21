package com.didispace.web;

import com.didispace.service.ComputeClient;
import com.didispace.service.ComputeService;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.niws.loadbalancer.DiscoveryEnabledServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ConcurrentHashMap;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    ComputeClient computeClient;

    @RequestMapping(value = "/add")
    public String add(@RequestParam String name) {

//        return computeClient.add(name);
        return restTemplate.getForObject("http://compute-service/add?b="+name, String.class);
    }



}