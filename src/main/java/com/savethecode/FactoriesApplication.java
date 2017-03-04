package com.savethecode;

import com.savethecode.factories.located.factory.ServiceLocatedFactory;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FactoriesApplication {

    public static void main(String[] args) {
        SpringApplication.run(FactoriesApplication.class, args);
    }

    @Bean
    public ServiceLocatorFactoryBean serviceLocatorFactoryBeanForServiceLocatedFactory() {
        ServiceLocatorFactoryBean serviceLocatorFactoryBean = new ServiceLocatorFactoryBean();
        serviceLocatorFactoryBean.setServiceLocatorInterface(ServiceLocatedFactory.class);

        return serviceLocatorFactoryBean;
    }
}
