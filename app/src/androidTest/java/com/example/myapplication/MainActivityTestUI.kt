package com.example.myapplication

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTestUI {

    @get: Rule
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun mainActivity_compareText() {
        Espresso.onView(ViewMatchers.withId(R.id.editText1))
            .perform(ViewActions.typeText("Prueba"))

        Espresso.onView(ViewMatchers.withId(R.id.editText2))
            .perform(ViewActions.typeText("Prueba"))

        // Verificar si el texto ingresado coincide con el esperado
        Espresso.onView(ViewMatchers.withId(R.id.editText1))
            .check(ViewAssertions.matches(ViewMatchers.withText("Prueba")))

        Espresso.onView(ViewMatchers.withId(R.id.editText2))
            .check(ViewAssertions.matches(ViewMatchers.withText("Prueba")))


        Espresso.onView(
            ViewMatchers.withId(R.id.buttonCompare)
        ).perform(
            ViewActions.click()
        )
    }
}
