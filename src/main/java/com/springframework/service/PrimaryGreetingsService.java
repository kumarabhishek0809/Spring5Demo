package com.springframework.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en","default"})
public class PrimaryGreetingsService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Primary Bean english";
    }
}
