package com.springframework.service;

import com.springframework.repository.GreetingRepository;

/*@Service
@Primary
@Profile("es")*/
public class PrimarySpanishGreetingsService implements GreetingService {
    private final GreetingRepository greetingRepository;

    public PrimarySpanishGreetingsService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreetings() {
        return greetingRepository.getSpanishGreeting();
    }
}
