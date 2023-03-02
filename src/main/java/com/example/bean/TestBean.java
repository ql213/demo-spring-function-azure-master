package com.example.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TestBean {
    @PostConstruct
    public void init() {
        System.out.println("---------TestBean initing");
    }
    public void print() {
        System.out.println("--hello spring bean");
    }
}
