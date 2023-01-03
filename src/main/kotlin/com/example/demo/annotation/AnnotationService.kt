package com.example.demo.annotation

import org.springframework.stereotype.Service

@Service
open class AnnotationService {

    @LogIt("run: service entry point")
    fun getData(): String{
        return data()
    }

    @LogIt("run: data source")
    private fun data(): String {
        return "Data"
    }
}
