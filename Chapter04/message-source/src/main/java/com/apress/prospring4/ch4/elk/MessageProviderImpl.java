package com.apress.prospring4.ch4.elk;

import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Locale;

/**
 * Created by kremak on 23.11.2015.
 */
public class MessageProviderImpl implements MessageProvider {
    private ResourceBundleMessageSource messageSource;

    public MessageProviderImpl(ResourceBundleMessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    public String getMessage(String msg, Locale locale, Object... wildcards) {
        final String message = messageSource.getMessage(msg, wildcards, locale);
        return message;
    }
}
