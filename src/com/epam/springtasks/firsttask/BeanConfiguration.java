package com.epam.springtasks.firsttask;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ImportResource("classpath:/firsttask/config.xml")
public class BeanConfiguration {

    @Bean(initMethod = "init")
    public First firstBean() {
        return new First();
    }

    @Bean
    public Second secondBean() {
        return new Second();
    }
}
