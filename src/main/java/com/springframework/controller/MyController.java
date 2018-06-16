package com.springframework.controller;

import com.springframework.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    @Autowired
    private GreetingService greetingService;

    public String hello(){
        return greetingService.sayGreetings();
    }
}
