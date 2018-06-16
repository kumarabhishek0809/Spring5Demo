package com.springframework.controller;

import com.springframework.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {
    private SetterInjectedController controller;

    @Before
    public void setUp() {
        this.controller = new SetterInjectedController();
        this.controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.Hello, controller.sayHello());
    }
}
