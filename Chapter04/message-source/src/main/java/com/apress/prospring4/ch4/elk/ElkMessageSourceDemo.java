package com.apress.prospring4.ch4.elk;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

/**
 * Created by kremak on 23.11.2015.
 */
public class ElkMessageSourceDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.apress.prospring4.ch4.elk");

        MessageProvider msgProvider = ctx.getBean(MessageProvider.class);

        Locale english = Locale.ENGLISH;
        Locale czech = new Locale("cs", "CZ");

        System.out.println(ctx.getMessage("msg", null, english));
        System.out.println(ctx.getMessage("msg", null, czech));

        System.out.println(ctx.getMessage("nameMsg", new Object[]{"Chris",
                "Schaefer"}, english));

        System.out.println("================================================================");

        System.out.println(msgProvider.getMessage("msg", english));
        System.out.println(msgProvider.getMessage("msg", czech));

        System.out.println(msgProvider.getMessage("nameMsg", english, new Object[]{"Chris", "Schaefer"}));


    }
}
