package com.ashish.springdemo.servicelocator.config;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceLocatorConfig {
    @Bean
    public FactoryBean serviceLocatorFactoryBean(){
        ServiceLocatorFactoryBean serviceLocatorFactoryBean = new ServiceLocatorFactoryBean();
        serviceLocatorFactoryBean.setServiceLocatorInterface(DataConverterFactory.class);
        return serviceLocatorFactoryBean;
    }
}
