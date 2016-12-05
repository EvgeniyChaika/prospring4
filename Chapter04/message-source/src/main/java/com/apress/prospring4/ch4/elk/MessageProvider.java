package com.apress.prospring4.ch4.elk;

import java.util.Locale;

/**
 * Created by kremak on 23.11.2015.
 */
public interface MessageProvider {
    String getMessage(String msg, Locale locale, Object... wildcards);
}
