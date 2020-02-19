package com.epam.springtasks.sixthtask;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class MyAspect {

    @Pointcut("execution(public * com.epam.springtasks.sixthtask.*.my*(..)) && args(string,..)")
    public void myPointCut(String string) {
    }

    @Around("myPointCut(string)")
    public String myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint, String string) throws Throwable {
        System.out.println("AroundMethod was Executed");
        return "withAroundMethod" + proceedingJoinPoint.proceed();
    }
}
