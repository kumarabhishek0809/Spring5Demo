package com.springframework.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public static final String Hello = "Hello from Greeting Service";

    @Override
    public String sayGreetings() {
        return "Hello from Greeting Service";
    }
}
