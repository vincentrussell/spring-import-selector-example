package com.github.vincentrussell;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyImportedConfiguration implements ImportedConfiguration {

    public MyImportedConfiguration() {
        System.out.println(this.getClass());
    }

    @Bean
    public HelloService helloService() {
        return new HelloService() {
            @Override public String getGreeting() {
                return "hello";
            }
        };
    }

}
