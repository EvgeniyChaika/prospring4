package cz.elk.aopexample;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by kremak on 4.12.2015.
 */
@Configuration
@ComponentScan("cz.elk.aopexample")
@EnableAspectJAutoProxy
public class AppConfig {
}
