package cz.elk.aopexample;

import org.springframework.stereotype.Component;

@Component
public class PrinterImpl implements Printer {

    @Override
    public synchronized void println(String str) {
        System.out.println(str);
    }
}
