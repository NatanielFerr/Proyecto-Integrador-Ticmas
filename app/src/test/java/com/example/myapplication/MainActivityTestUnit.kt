package com.example.myapplication

import org.junit.Assert
import org.junit.Test

class MainActivityTestUnit {

    @Test
    fun testTextsAreEqual() {
        val text1 = "Prueba"
        val text2 = "Prueba"

        Assert.assertEquals(text1, text2)
    }

    @Test
    fun testTextsAreDifferent() {
        val text1 = "Prueba"
        val text2 = "prueba"

        Assert.assertNotEquals(text1, text2)
    }
}
