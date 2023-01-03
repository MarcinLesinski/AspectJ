package com.example.demo.logging

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut
import org.springframework.stereotype.Component

@Aspect
@Component
class LoggingAspect {

    @Pointcut("execution(*  com.example.demo.logging.LoggingService.*())")
    @Suppress("unused")
    fun allServiceMethodsPointcut(){}

    @Before("allServiceMethodsPointcut()")
    @Suppress("unused")
    fun before(point: JoinPoint){
        println("--- going to execute: ${point.signature.name} ---")
    }

    @After("allServiceMethodsPointcut()")
    @Suppress("unused")
    fun after(point: JoinPoint){
        println("--- just executed: ${point.signature.name} ---")
    }
}
