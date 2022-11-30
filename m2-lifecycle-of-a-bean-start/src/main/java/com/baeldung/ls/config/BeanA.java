package com.baeldung.ls.config;

import javax.annotation.PostConstruct;

// This class has a dependency on the PostConstruct annotation
public class BeanA {
    @PostConstruct
    public void post() {
        boolean stopHere = true;
    }
}
