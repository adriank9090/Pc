/*
package com.example.PC.Aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
@Slf4j

public class SendEmailAspect {

    @After("execution(com.example.PC.PcController..*(..))")
    public void sending (ProceedingJoinPoint joinPoint) throws Throwable {
        joinPoint.proceed();

    }
}*/

