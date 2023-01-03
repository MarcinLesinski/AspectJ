package com.example.demo.behaviour

import org.springframework.stereotype.Service

@Service
open class BehaviourService {

    fun getData(): String{
        return data()
    }

    private fun data(): String {
        return "Default Data"
    }
}
