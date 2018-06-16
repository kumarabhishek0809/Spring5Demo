package com.springframework;

import com.springframework.controller.ConstructorInjectedController;
import com.springframework.controller.MyController;
import com.springframework.controller.PropertyInjectedController;
import com.springframework.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring5DemoApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(Spring5DemoApplication.class, args);
        MyController myController = (MyController) applicationContext.getBean("myController");
        System.out.println(myController.hello());
        System.out.println(((ConstructorInjectedController) applicationContext.getBean("constructorInjectedController")).sayHello());
        System.out.println(((PropertyInjectedController) applicationContext.getBean("propertyInjectedController")).sayHello());
        System.out.println(((SetterInjectedController) applicationContext.getBean("setterInjectedController")).sayHello());

        applicationContext.getBean("myController");
        myController.hello();


    }
}
