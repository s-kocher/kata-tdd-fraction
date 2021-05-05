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
    public void should_sum_1_3_plus_1_3_be_2_3() {
        FractionVo fraction1 = new FractionVo(1, 3);
        FractionVo fraction2 = new FractionVo(1, 3);

        FractionVo result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new FractionVo(2, 3), result);
    }

    @Test
    public void should_sum_1_5_plus_1_5_be_2_5() {
        FractionVo fraction1 = new FractionVo(1, 5);
        FractionVo fraction2 = new FractionVo(1, 5);

        FractionVo result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new FractionVo(2, 5), result);
    }

    @Test
    public void should_sum_1_7_plus_1_7_be_2_7() {
        FractionVo fraction1 = new FractionVo(1, 7);
        FractionVo fraction2 = new FractionVo(1, 7);

        FractionVo result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new FractionVo(2, 7), result);
    }

    @Test
    public void should_sum_1_5_plus_2_5_be_3_5() {
        FractionVo fraction1 = new FractionVo(1, 5);
        FractionVo fraction2 = new FractionVo(2, 5);

        FractionVo result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new FractionVo(3, 5), result);
    }

    @Test
    public void should_sum_1_5_plus_3_5_be_4_5() {
        FractionVo fraction1 = new FractionVo(1, 5);
        FractionVo fraction2 = new FractionVo(3, 5);

        FractionVo result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new FractionVo(4, 5), result);
    }

}
