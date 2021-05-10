package fr.arolla.skocher.fraction;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FractionTest {

    /** Test Fraction VO equals **/
    @Test
    public void should_two_same_fractions_be_equal() {
        Fraction fraction1 = new Fraction(1, 3);
        Fraction fraction2 = new Fraction(1, 3);

        assertEquals(fraction1, fraction2);
    }

    @Test
    public void should_two_different_fractions_be_not_equal() {
        Fraction fraction1 = new Fraction(1, 3);
        Fraction fraction2 = new Fraction(1, 4);

        assertNotEquals(fraction1, fraction2);
    }


    static Stream<Arguments> fractionsSumInputsAndExpectedResult () {
        return Stream.of(
            Arguments.of(new Fraction(1, 3), new Fraction(1, 3), new Fraction(2, 3)),
            Arguments.of(new Fraction(1, 5), new Fraction(1, 5), new Fraction(2, 5)),
            Arguments.of(new Fraction(1, 7), new Fraction(1, 7), new Fraction(2, 7)),
            Arguments.of(new Fraction(1, 5), new Fraction(2, 5), new Fraction(3, 5)),
            Arguments.of(new Fraction(1, 5), new Fraction(3, 5), new Fraction(4, 5)),
            Arguments.of(new Fraction(2, 5), new Fraction(1, 5), new Fraction(3, 5)),
            Arguments.of(new Fraction(2, 5), new Fraction(2, 5), new Fraction(4, 5)),
            Arguments.of(new Fraction(2, 7), new Fraction(3, 7), new Fraction(5, 7)),
            Arguments.of(new Fraction(1, 5), new Fraction(1, 6), new Fraction(11, 30)),
            Arguments.of(new Fraction(1, 5), new Fraction(1, 7), new Fraction(12, 35)),
            Arguments.of(new Fraction(1, 5), new Fraction(1, 9), new Fraction(14, 45)),
            Arguments.of(new Fraction(1, 5), new Fraction(2, 11), new Fraction(21, 55)),
            Arguments.of(new Fraction(1, 6), new Fraction(2, 11), new Fraction(23, 66)),
            Arguments.of(new Fraction(1, 6), new Fraction(3, 11), new Fraction(29, 66))
        );
    }

    @ParameterizedTest(name = "{0} + {1} = {2} ")
    @MethodSource("fractionsSumInputsAndExpectedResult")
    public void should_sum_of_2_fractions_provide_expected_results(
        Fraction fraction1, Fraction fraction2, Fraction expectedFraction) {

        assertFractionSum(fraction1, fraction2, expectedFraction);
    }

    private void assertFractionSum(Fraction fraction1, Fraction fraction2, Fraction expectedFraction) {
        Fraction result = fraction1.add(fraction2);

        assertEquals(expectedFraction, result);
    }

    /** Fraction simplification **/
    static Stream<Arguments> fractionSimplificationInputAndExpected () {
        return Stream.of(
            Arguments.of(new Fraction(2, 4), new Fraction(1, 2)),
            Arguments.of(new Fraction(2, 6), new Fraction(1, 3)),
            Arguments.of(new Fraction(4, 6), new Fraction(2, 3)),
            Arguments.of(new Fraction(2, 8), new Fraction(1, 4)),
            Arguments.of(new Fraction(6, 8), new Fraction(3, 4))
         );
    }

    @ParameterizedTest(name = "{0} => {1} ")
    @MethodSource("fractionSimplificationInputAndExpected")
    public void should_simplify_fraction_provide_expected_result(Fraction fraction, Fraction expectedSimplifiedFraction) {
        Fraction result = fraction.simplify();

        assertEquals(expectedSimplifiedFraction, result);
    }

    /** Fraction sum + simplification **/
    static Stream<Arguments> fractionsSumInputsAndNeedToSimplifyExpectedResult () {
        return Stream.of(
                Arguments.of(new Fraction(1, 3), new Fraction(1, 6), new Fraction(1, 2)),
                Arguments.of(new Fraction(1, 3), new Fraction(2, 6), new Fraction(2, 3)),
                Arguments.of(new Fraction(1, 6), new Fraction(2, 6), new Fraction(1, 2))
        );
    }

    @ParameterizedTest(name = "{0} + {1} = {2} ")
    @MethodSource("fractionsSumInputsAndNeedToSimplifyExpectedResult")
    public void should_sum_of_2_fractions_provide_expected_simplified_results(
        Fraction fraction1, Fraction fraction2, Fraction expectedFraction) {

        assertFractionSum(fraction1, fraction2, expectedFraction);
    }


}
