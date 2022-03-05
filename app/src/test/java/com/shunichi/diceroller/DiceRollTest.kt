package com.shunichi.diceroller

import org.junit.Assert.assertTrue
import org.junit.Test

class DiceRollTest {
    @Test
    fun generates_number() {
        val dice = Dice(6)
        val result = dice.roll()

        assertTrue("The value of rollResult was not between 1 and 6", result in 1..6)
    }
}