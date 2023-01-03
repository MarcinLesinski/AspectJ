package com.example.demo.behaviour

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut
import org.springframework.stereotype.Component

@Aspect
@Component
class BehaviourAspect {

    @Pointcut("execution(*  com.example.demo.behaviour.BehaviourService.data())")
    @Suppress("unused")
    fun dataSourcePointcut(){}

    @Around("dataSourcePointcut()")
    fun around(point: ProceedingJoinPoint): String{
        val res = point.proceed()
        return "Aspect Data"
    }
}
