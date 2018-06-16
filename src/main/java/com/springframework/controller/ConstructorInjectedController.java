package com.springframework.controller;

import com.springframework.service.GreetingService;
import com.springframework.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }

    public String sayHello() {
        return "ConstructorInjectedController " + getGreetingService().sayGreetings();
    }
}
