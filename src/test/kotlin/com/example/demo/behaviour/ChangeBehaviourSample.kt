package com.example.demo.behaviour

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ChangeBehaviourSample{

    @Test
    fun justRun() {
        val data = BehaviourService().getData()
        assertThat(data).isEqualTo("Aspect Data")
    }
}

