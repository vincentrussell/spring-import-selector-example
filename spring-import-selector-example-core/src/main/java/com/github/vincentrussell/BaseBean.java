package com.github.vincentrussell;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseBean {

    @Autowired
    private HelloService helloService;

    public String getGreeting() {
        return helloService.getGreeting();
    }
}
