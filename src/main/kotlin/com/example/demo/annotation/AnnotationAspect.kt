package com.example.demo.annotation

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut
import org.aspectj.lang.reflect.MethodSignature
import org.springframework.stereotype.Component

@Aspect
@Component
class AnnotationAspect {

    @Suppress("unused")
    @Pointcut("execution(@LogIt * *(..))")
    fun annotationPointcut(){}

    @Before("annotationPointcut()")
    @Suppress("unused")
    fun before(point: JoinPoint){
        val method = (point.signature as MethodSignature).method
        val message = method.getAnnotation(LogIt::class.java).message
        println(message)
    }
}
