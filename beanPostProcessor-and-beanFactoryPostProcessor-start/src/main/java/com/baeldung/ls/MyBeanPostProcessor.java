package com.baeldung.ls;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;


// NOTE: post-processor methods run for each and every bean

public class MyBeanPostProcessor implements BeanPostProcessor, Ordered {

    private static final Logger LOG = LoggerFactory.getLogger(MyBeanPostProcessor.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        LOG.info("MyBeanPostProcessor: Before initialising the bean: {}", beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        LOG.info("MyBeanPostProcessor: After initialising the bean: {}", beanName);
        return bean;
    }

    @Override
    public int getOrder() {
        // The lower order value gets executed first
        return 1;
    }
}

