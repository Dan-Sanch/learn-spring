package com.baeldung.ls.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // BeanA has a dependency on the PostConstruct annotation
    @Bean
    public BeanA beanA() {
        return new BeanA();
    }

    // BeanB has no dependencies on external components
    @Bean(initMethod = "initialize")
    public BeanB beanB() {
        return new BeanB();
    }
}
