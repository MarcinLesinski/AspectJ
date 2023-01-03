package com.example.demo

import com.example.demo.annotation.AnnotationService
import com.example.demo.behaviour.BehaviourService
import com.example.demo.logging.LoggingService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
internal class Samples(
    private val loggingService: LoggingService,
    private val behaviourService: BehaviourService,
    private val annotationService: AnnotationService
) {
    @GetMapping("/log")
    fun loggingSample(): String = loggingService.getData()

    @GetMapping("/beh")
    fun behaviourSample(): String = behaviourService.getData()

    @GetMapping("/ann")
    fun annotationSample(): String = annotationService.getData()
}
