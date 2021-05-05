package fr.arolla.skocher.fraction;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FractionOperationsTest {

    @Test
    public void should_two_same_fractions_be_equal() {
        FractionVo fraction1 = new FractionVo(1, 3);
        FractionVo fraction2 = new FractionVo(1, 3);

        assertEquals(fraction1, fraction2);
    }

    @Test
    public void should_two_different_fractions_be_not_equal() {
        FractionVo fraction1 = new FractionVo(1, 3);
        FractionVo fraction2 = new FractionVo(1, 4);

        assertNotEquals(fraction1, fraction2);
    }

    @Test
    public void should_sum_2_fractions_with_same_denominator_have_same_denominator_and_as_numerator_the_sum_of_the_numerators() {
        FractionVo fraction1 = new FractionVo(1, 3);
        FractionVo fraction2 = new FractionVo(1, 3);

        FractionVo result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new FractionVo(2, 3), result);
    }

}
