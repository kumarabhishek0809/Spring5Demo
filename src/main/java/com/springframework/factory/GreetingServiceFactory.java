package com.springframework.factory;

import com.springframework.repository.GreetingRepository;
import com.springframework.service.GreetingService;
import com.springframework.service.PrimaryGermanGreetingsService;
import com.springframework.service.PrimaryGreetingsService;
import com.springframework.service.PrimarySpanishGreetingsService;

public class GreetingServiceFactory {
    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "en":
                return new PrimaryGreetingsService(greetingRepository);
            case "de":
                return new PrimaryGermanGreetingsService(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingsService(greetingRepository);
            default:
                return new PrimaryGreetingsService(greetingRepository);
        }
    }
}
