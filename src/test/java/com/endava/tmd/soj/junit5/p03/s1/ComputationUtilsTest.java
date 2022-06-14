package com.endava.tmd.soj.junit5.p03.s1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static com.endava.tmd.soj.junit5.p03.s1.ComputationUtils.sum;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Provocare: Copiati metodele de test din tema anterioara, si adaugati adnotarile necesare astfel incat
// sa fie rulate testele in ordine alfabetica. Modificati numele metodelor de test astfel incat metodele
// sa fie executate in ordinea in care sunt scrise
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
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