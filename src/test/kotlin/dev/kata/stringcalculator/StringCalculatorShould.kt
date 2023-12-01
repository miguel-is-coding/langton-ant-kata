package dev.kata.stringcalculator

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.`when`

internal class StringCalculatorShould {
    @Test
    fun `throw not implemented`() {
        val dependency = mock(StringCalculatorDependency::class.java)
        `when`(dependency.doSomething()).thenThrow(NotImplementedError("Time to do some TDD..."))

        assertThatExceptionOfType(NotImplementedError::class.java)
            .isThrownBy {
                StringCalculator(dependency).execute()
            }.withMessage("Time to do some TDD...")
    }
}
