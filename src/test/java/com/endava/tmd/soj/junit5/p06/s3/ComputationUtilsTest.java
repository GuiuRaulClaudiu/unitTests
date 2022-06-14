package com.endava.tmd.soj.junit5.p06.s3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.endava.tmd.soj.junit5.p06.s3.ComputationUtils.sum;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

// Provocare: Rescrieti cele doua teste parametrizate din sectiunea 1 astfel incat sa existe
// cate o metoda care sa furnizeze valorile parametrilor. Dar, nu se vor mai folosi valorile
// explicite pentru valoarea minima si maxima acceptata de Java pentru tipul de date intreg,
// ci se vor folosi Integer.MIN_VALUE, respectiv Integer.MAX_VALUE
// Se va utiliza adnotarea @MethodSource.
class ComputationUtilsTest {
    public static Stream<Arguments> MAX_VALUE() {
        return Stream.of(
                Arguments.of(Integer.MAX_VALUE,3),
                Arguments.of(Integer.MAX_VALUE,4),
                Arguments.of(Integer.MAX_VALUE,5),
                Arguments.of(Integer.MAX_VALUE,6)
                );
    }

    public static Stream<Arguments> NORMAL_VALUE() {
        return Stream.of(
                Arguments.of(5,3,8),
                Arguments.of(-3,4,1),
                Arguments.of(1,5,6),
                Arguments.of(0,6,6)
        );
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @MethodSource("NORMAL_VALUE")
    void calculateSum(int input1,int input2, int expected){

        assertEquals(expected, com.endava.tmd.soj.junit5.p06.s1.ComputationUtils.sum(input1,input2));

    }

    @ParameterizedTest(name = "{0} + {1} = Overflow")
    @MethodSource("MAX_VALUE")
    void ParameterizedExceptionWhenSumIsLowerThanIntegerMinValue(int input1, int input2){

        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> com.endava.tmd.soj.junit5.p06.s1.ComputationUtils.sum(input1, input2));
        assertEquals("Overflow while computing the sum", exception.getMessage());

    }
}
