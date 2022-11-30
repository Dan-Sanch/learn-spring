package com.baeldung.ls.config;

import com.baeldung.ls.BeanA;
import com.baeldung.ls.MyBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public BeanA beanA() {
        return new BeanA();
    }

    // Notice in the example here, we defined the bean method as static.
    //This is because we want such post processor beans to get initialized early in the container lifecycle.
    @Bean
    public static MyBeanPostProcessor beanPostProcessor() {
        return new MyBeanPostProcessor();
    }
}
