package com.apress.prospring4.ch4.elk;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

import javax.annotation.PostConstruct;

/**
 * Created by kremak on 23.11.2015.
 */
@Configuration
public class ElkMessageSourceDemoConfig {

    private ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();

    @PostConstruct
    private void init() {
        messageSource.setBasename("labels");
    }

    @Bean
    public MessageSource messageSource() {
        return messageSource;
    }

    @Bean
    public MessageProvider messageProvider() {
        MessageProvider messageProvider = new MessageProviderImpl(messageSource);
        return messageProvider;
    }
}
