package com.itheima.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 *
 */

@Slf4j
@Component
@Aspect //标识当前类是一个 （aop切面类）
public class TimeAspect {

//    @Around(" execution(* com.itheima.service.*.*(..)) ") // 切入点表达式，执行Service业务层的每一个方法时，都会执行这个AOP类
    @Around(" execution(* com.itheima.service.impl.DeptServiceImpl.*(..)) ")
    public Object recordTime(ProceedingJoinPoint joinPoint) throws Throwable { //定义方法，封装通用逻辑 ， 在形参中定义 切点参数
        //1.记录开始时间
        long begin = System.currentTimeMillis();

        //2.调用 proceed 原始方法，运行,并返回
        Object result = joinPoint.proceed();

        //3.记录结束时间，计算出 哪一个方法执行耗时
        long end = System.currentTimeMillis();
        log.info(joinPoint.getSignature() + "方法执行耗时：{}ms",end-begin);

        return result;
    }


}
