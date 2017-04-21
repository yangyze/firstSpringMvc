package com.yyz.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//import javax.annotation.PreDestroy;

//import javax.annotation.PreDestroy;

/**
 * Created by yangyeze on 2017/4/20.
 */
@Aspect
@Component
public class MyLog {
    @Pointcut("execution( * com.yyz.service.StudentService.save(..))")
    public void pointOne() {

    }


    @Before("pointOne()")
    public void beforeMethod() {
        System.out.println("Mylog------run before");
    }

//    @PreDestroy
//    public void destory(){
//        System.out.println("desoooooo");
//    }
    @Around("pointOne()")
    public void arround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("arround before");
        joinPoint.proceed();
        System.out.println("arround after");
    }

}
