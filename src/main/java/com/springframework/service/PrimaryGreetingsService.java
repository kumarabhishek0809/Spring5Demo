package com.springframework.service;

import com.springframework.repository.GreetingRepository;

/*@Service
@Primary
@Profile({"en","default"})*/
public class PrimaryGreetingsService implements GreetingService {
    private final GreetingRepository greetingRepository;

    public PrimaryGreetingsService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreetings() {
        return greetingRepository.getEnglishGreeting();
    }
}
