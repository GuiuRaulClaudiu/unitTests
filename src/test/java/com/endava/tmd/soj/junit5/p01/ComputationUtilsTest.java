package com.endava.tmd.soj.junit5.p01;

// Provocari:
// 1. Adaugati adnotarea neecesara pentru a rula prima metoda ca si un test unitar
// 2. Rulati prima metoda ca si un test unitar
// 3. Decomentati asertiile din primul test, si efectuati importurile necesare. Rulati testul din nou.
// 4. Adaugati o linie care sa determine testul sa fie "failed". La sfarsit commentati acea linie
// 5. Completati celelalte metode astfel incat sa reprezinte scenarii de testare

import org.junit.jupiter.api.Test;

import static com.endava.tmd.soj.junit5.p01.ComputationUtils.sum;
import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputationUtilsTest {
    @Test
    void zeroShouldNotChangeZero() {
//         JUnit Assertion
         assertEquals(0, sum(0, 0));
//         assertEquals(0, sum(1,2));
//         AssertJ Assertion
//         assertThat(sum(0, 0)).isZero();
    }
    @Test
    void zeroShouldNotChangePositive() {

        assertEquals( 3, sum(0,3));

    }
    @Test
    void zeroShouldNotChangeNegative() {

        assertEquals(-3, sum(0, -3));

    }
    @Test
    void twoPositiveNumbersShouldHaveAbsoluteValuesAddedAndPositiveResult() {

        assertEquals(5,sum(2,3));

    }
    @Test
    void twoNegativeNumbersShouldHaveAbsoluteValuesAddedAndNegativeResult() {

        assertEquals(-5,sum(-2,-3));

    }
    @Test
    void oneSmallNegativeAndOneBigPositiveNumberShouldHaveAbsoluteValuesSubtractedAndPositiveResult() {

        assertEquals(4,sum(-1,5));

    }
    @Test
    void oneBigNegativeAndOneSmallPositiveNumberShouldHaveAbsoluteValuesSubtractedAndNegativeResult() {

        assertEquals(-3,sum(-5,2));

    }
}
