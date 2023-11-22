package com.itheima.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.ParameterizedType;

/**
 * ClassName: TimeAspect
 * Package: com.itheima.aop
 * Description:
 * @Author: Hjr
 * @Create 2023/11/16 19:26
 * @Version 1.0
 */
@Slf4j
@Component
@Aspect//aop类
public class TimeAspect {
    @Pointcut("execution(* com.itheima.service.*.*(..))")
    private void pt(){}

    @Around("pt()")//切入点表达式
    public Object recordTime(ProceedingJoinPoint joinPoint) throws Throwable {
        //1.记录开始时间
        long beginTime = System.currentTimeMillis();
        //2.调用原始方法运行
        Object result = joinPoint.proceed();
        //3.记录结束时间
        long endTime = System.currentTimeMillis();
        log.info(joinPoint.getSignature()+"方法执行时间为{}ms",endTime-beginTime);

        return result;

    }

}
