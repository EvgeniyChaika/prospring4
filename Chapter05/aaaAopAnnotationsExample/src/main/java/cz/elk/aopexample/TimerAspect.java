package cz.elk.aopexample;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.text.MessageFormat;

/**
 * Created by kremak on 4.12.2015.
 */
@Component
@Aspect
public class TimerAspect {


    @Around("@annotation(mtt)")
    public Object measure(ProceedingJoinPoint pjp, MeasureTheTime mtt) throws Throwable {

        final long before = System.currentTimeMillis();

        final Object retVal = pjp.proceed();

        final long after = System.currentTimeMillis();

        MethodSignature signature = (MethodSignature) pjp.getSignature();
        String typeName = signature.getDeclaringTypeName();
        String methodName = signature.getMethod().getName();
        final long period = after - before;

        System.out.println(MessageFormat.format("..... TIMER: method {0}.{1} took {2} ms.", typeName, methodName, period));

        return retVal;
    }

}






