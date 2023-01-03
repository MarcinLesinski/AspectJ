package com.example.demo.logging

import org.springframework.stereotype.Service

@Service
open class LoggingService {

    fun getData(): String{
        return firstPartOfData() + " " + secondPartOfData()
    }

    private fun firstPartOfData(): String {
        return "One hundred and seventy three"
    }

    private fun secondPartOfData(): Int = 173
}
