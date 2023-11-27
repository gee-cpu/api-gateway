package com.gonchaba.apigateway.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/mapservicefallback")
    public String mapsFallBack(){
        return "Maps service is down. Please be patient with us.";
    }
    @GetMapping("/crimeservicefallback")
    public String crimesFallBack(){
        return "Crime service is down. Please be patient with us.";
    }
}
