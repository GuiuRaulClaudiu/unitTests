package com.endava.tmd.soj.junit5.p02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.endava.tmd.soj.junit5.p02.ComputationUtils.sum;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Provocare: Copiati metodele de test din tema anterioara, si adaugati adnotarile necesare astfel incat:
// 1. Sa fie afisat "Tests for my sum method" in loc de "ComputationUtilsTest"
// 2. La fiecare test sa fie afisata suma. De exemplu "zeroShouldNotChangeZero" ar trebui sa fie inlocuit cu "0 + 0 = 0"

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
}
