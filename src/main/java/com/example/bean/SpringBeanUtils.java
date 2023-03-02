package com.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
public class SpringBeanUtils {
    @Autowired
    private ApplicationContext applicationContext;

    private static ApplicationContext APPLICATIONCONTEXT;

    @PostConstruct
    public void init() {
        APPLICATIONCONTEXT = applicationContext;
    }

    public SpringBeanUtils() {
        System.out.println("---");
    }

    public static Object getBean(String beanName) {
        return APPLICATIONCONTEXT.getBean(beanName);
    }

}