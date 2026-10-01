package com.example.copilotandroidvsa

import org.junit.Assert.assertEquals
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testCameraLensFacingConstants() {
        val LENS_FACING_FRONT = 0
        val LENS_FACING_BACK = 1
        assertEquals(0, LENS_FACING_FRONT)
        assertEquals(1, LENS_FACING_BACK)
    }
}
