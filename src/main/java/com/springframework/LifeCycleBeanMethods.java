package com.springframework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleBeanMethods implements
        InitializingBean, BeanNameAware, DisposableBean, BeanFactoryAware, ApplicationContextAware {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("LifeCycleBeanMethods setBeanFactory");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("LifeCycleBeanMethods setBeanName");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("LifeCycleBeanMethods destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("LifeCycleBeanMethods afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("LifeCycleBeanMethods setApplicationContext");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("PreDestroy");
    }

    public void beforeInit() {
        System.out.println("beforeInit");
    }

    public void afterInit() {
        System.out.println("afterInit");
    }
}
