package com.endava.tmd.soj.junit5.p05.s2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.endava.tmd.soj.junit5.p05.s2.ComputationUtils.sum;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

// Scopul acestei sectiuni este sa urmarim rescrierile de cod din partea de productie
// Deci pastram testele din sectiunea precedenta
@DisplayName("Tests for my sum method")
class ComputationUtilsTest {
    @Test
    @DisplayName("0 + 0 = 0")
    void zeroShouldNotChangeZero() {
//         JUnit Assertion
        assertEquals(0, sum(0, 0));
//         assertEquals(0, sum(1,2));
//         AssertJ Assertion
//         assertThat(sum(0, 0)).isZero();
    }
    @Test
    @DisplayName("0 + 3 = 3")
    void zeroShouldNotChangePositive() {

        assertEquals( 3, sum(0,3));

    }
    @Test
    @DisplayName("0 - 3 = -3")
    void zeroShouldNotChangeNegative() {

        assertEquals(-3, sum(0, -3));

    }
    @Test
    @DisplayName("2 + 3 = 5")
    void twoPositiveNumbersShouldHaveAbsoluteValuesAddedAndPositiveResult() {

        assertEquals(5,sum(2,3));

    }
    @Test
    @DisplayName("-2 -3 = -5")
    void twoNegativeNumbersShouldHaveAbsoluteValuesAddedAndNegativeResult() {

        assertEquals(-5,sum(-2,-3));

    }
    @Test
    @DisplayName("-1 + 5 = 4")
    void oneSmallNegativeAndOneBigPositiveNumberShouldHaveAbsoluteValuesSubtractedAndPositiveResult() {

        assertEquals(4,sum(-1,5));

    }
    @Test
    @DisplayName("-5 + 2 = -3")
    void oneBigNegativeAndOneSmallPositiveNumberShouldHaveAbsoluteValuesSubtractedAndNegativeResult() {

        assertEquals(-3,sum(-5,2));

    }
    @Test
    void zeroShouldNotChangeMaxInt() {

        assertEquals(Integer.MAX_VALUE, sum(0,Integer.MAX_VALUE));

    }
    @Test
    void maxIntAndANegativeNumber() {

        assertEquals(Integer.MAX_VALUE - 5, sum(Integer.MAX_VALUE,-5));

    }
    @Test
    void zeroShouldNotChangeMinInt() {

        assertEquals(Integer.MIN_VALUE, sum(0,Integer.MIN_VALUE));

    }
    @Test
    void minIntAndAPositiveNumber() {

        assertEquals(Integer.MIN_VALUE + 5, sum(5,Integer.MIN_VALUE));
    }
    @Test
    void minIntAndMaxInt() {

        assertEquals(-1,sum(Integer.MIN_VALUE,Integer.MAX_VALUE));

    }
    @Test
    @Disabled
    void whatToDoWhenSumExceedsMaxIntegerValue() {

        assertEquals(Integer.MAX_VALUE + 1L,sum(Integer.MAX_VALUE,1));

    }
    @DisplayName("2147483647 + 1 \u21D2 Overflow")
    @Test
    void exceptionWhenSumIsGreaterThanIntegerMaxValue() {
        // JUnit way of checking the exception class
        //assertThrows(ArithmeticException.class, () -> sum(2147483647, 1));

        // JUnit way of checking the exception class and its characteristics
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> sum(Integer.MAX_VALUE, 1));
        assertEquals("Overflow while computing the sum", exception.getMessage());

        // AssertJ
//        assertThatThrownBy(() -> sum(2147483647, 1))
//                .isInstanceOf(ArithmeticException.class)
//                .hasMessage("Overflow while computing the sum");
    }
    @DisplayName("-2147483648 + (-1) \u21D2 Overflow")
    @Test
    void exceptionWhenSumIsLowerThanIntegerMinValue() {

        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> sum(Integer.MIN_VALUE, -1));
        assertEquals("Overflow while computing the sum", exception.getMessage());

    }

}
