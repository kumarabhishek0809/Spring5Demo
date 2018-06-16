package com.springframework.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class PrimarySpanishGreetingsService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Primary Bean Spansih";
    }
}
