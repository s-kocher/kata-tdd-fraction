package fr.arolla.skocher.fraction;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FractionOperationsTest {

    /** Test Fraction VO equals **/
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

    /** Test same denominator sum **/

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

    @Test
    public void should_sum_2_5_plus_1_5_be_3_5() {
        FractionVo fraction1 = new FractionVo(2, 5);
        FractionVo fraction2 = new FractionVo(1, 5);

        FractionVo result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new FractionVo(3, 5), result);
    }

    @Test
    public void should_sum_2_5_plus_2_5_be_4_5() {
        FractionVo fraction1 = new FractionVo(2, 5);
        FractionVo fraction2 = new FractionVo(2, 5);

        FractionVo result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new FractionVo(4, 5), result);
    }

    @Test
    public void should_sum_2_7_plus_3_7_be_5_7() {
        FractionVo fraction1 = new FractionVo(2, 7);
        FractionVo fraction2 = new FractionVo(3, 7);

        FractionVo result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new FractionVo(5, 7), result);
    }

    /** Test different denominator sum **/
    @Test
    public void should_sum_1_5_plus_1_6_be_11_30() {
        FractionVo fraction1 = new FractionVo(1, 5);
        FractionVo fraction2 = new FractionVo(1, 6);

        FractionVo result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new FractionVo(11, 30), result);
    }

    @Test
    public void should_sum_1_5_plus_1_7_be_12_35() {
        FractionVo fraction1 = new FractionVo(1, 5);
        FractionVo fraction2 = new FractionVo(1, 7);

        FractionVo result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new FractionVo(12, 35), result);
    }

    @Test
    public void should_sum_1_5_plus_1_9_be_14_45() {
        FractionVo fraction1 = new FractionVo(1, 5);
        FractionVo fraction2 = new FractionVo(1, 9);

        FractionVo result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new FractionVo(14, 45), result);
    }

    @Test
    public void should_sum_1_5_plus_2_11_be_21_55() {
        FractionVo fraction1 = new FractionVo(1, 5);
        FractionVo fraction2 = new FractionVo(2, 11);

        FractionVo result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new FractionVo(21, 55), result);
    }

    @Test
    public void should_sum_1_6_plus_2_11_be_23_66() {
        FractionVo fraction1 = new FractionVo(1, 6);
        FractionVo fraction2 = new FractionVo(2, 11);

        FractionVo result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new FractionVo(23, 66), result);
    }

    @Test
    public void should_sum_1_6_plus_3_11_be_29_66() {
        FractionVo fraction1 = new FractionVo(1, 6);
        FractionVo fraction2 = new FractionVo(3, 11);

        FractionVo result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new FractionVo(29, 66), result);
    }

}
