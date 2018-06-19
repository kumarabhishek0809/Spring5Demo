package com.springframework.repository;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements  GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "getEnglishGreeting";
    }

    @Override
    public String getSpanishGreeting() {
        return "getSpanishGreeting";
    }

    @Override
    public String getGermanGreeting() {
        return "getGermanGreeting";
    }
}
