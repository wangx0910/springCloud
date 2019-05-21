package com.didispace.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ComputeClientHystrix implements ComputeClient {

    @Override
    public String add(@RequestParam String b) {
        return "-9999";
    }

}