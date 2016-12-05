package cz.elk.aopexample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.IntStream;

/**
 * Created by kremak on 4.12.2015.
 */
public class Launcher {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        WiseMan wiseMan = ctx.getBean(WiseMan.class);
        Printer printer = ctx.getBean(Printer.class);

        IntStream
                .range(0, 10)
//                .peek(i -> printer.print(i + ":"))
                .peek(i -> wiseMan.thinkUpSomethingClever())
                .forEach(i -> wiseMan.saySomethingClever());

    }
}
