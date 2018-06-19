package com.springframework.service;


import com.springframework.repository.GreetingRepository;

public class PrimaryGermanGreetingsService implements GreetingService {
    private final GreetingRepository greetingRepository;

    public PrimaryGermanGreetingsService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreetings() {
        return greetingRepository.getGermanGreeting();
    }
}
