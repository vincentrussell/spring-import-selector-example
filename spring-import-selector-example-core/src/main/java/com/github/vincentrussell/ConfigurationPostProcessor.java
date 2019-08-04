package com.github.vincentrussell;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

public class ConfigurationPostProcessor implements BeanPostProcessor, Ordered {

    public static final String DEFAULT_FORMAT_KEY = "date";

    private int order = Ordered.HIGHEST_PRECEDENCE;

    private String formatKey;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws
        BeansException {
        return bean;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Configuration) {
         System.out.println(bean);
        }
        return bean;
    }

    @Override
    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getFormatKey() {
        return formatKey;
    }

    public void setFormatKey(String formatKey) {
        this.formatKey = formatKey;
    }
}
