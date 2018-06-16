package com.springframework.controller;

import com.springframework.service.GreetingService;
import com.springframework.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    GreetingService greetingService;

    public GreetingService getGreetingService() {
        return greetingService;
    }

    public String sayHello() {
        return "PropertyInjectedController " +getGreetingService().sayGreetings();
    }
}
