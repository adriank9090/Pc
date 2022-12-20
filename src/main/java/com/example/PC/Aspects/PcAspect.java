package com.example.PC.Aspects;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Aspect
@Component
@EnableAspectJAutoProxy
@Slf4j
public class PcAspect {
    @Around("execution(* com.example.PC.PcController..*(..))")
    public Object beforeControlMethod (ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.nanoTime();
        Object proceed = joinPoint.proceed();
        log.info(" :: TEST TEST TEST ::");
        log.info("  ::  Time :: " + (System.nanoTime() - start));
        return proceed;
    }

}
