package com.example.microservices.limitservice;

import com.example.microservices.limitservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {

    @Autowired
    private Configuration configuration ;

    @GetMapping("/limits")
    public LimitConfiguration retriveLimitsConfigurations(){


        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum() );

    }








}
