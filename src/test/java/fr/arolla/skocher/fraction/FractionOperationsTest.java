package fr.arolla.skocher.fraction;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class FractionOperationsTest {

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

    /** Test same denominator sum **/

    @Test
    public void should_sum_1_3_plus_1_3_be_2_3() {
        Fraction fraction1 = new Fraction(1, 3);
        Fraction fraction2 = new Fraction(1, 3);

        Fraction result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new Fraction(2, 3), result);
    }

    @Test
    public void should_sum_1_5_plus_1_5_be_2_5() {
        Fraction fraction1 = new Fraction(1, 5);
        Fraction fraction2 = new Fraction(1, 5);

        Fraction result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new Fraction(2, 5), result);
    }

    @Test
    public void should_sum_1_7_plus_1_7_be_2_7() {
        Fraction fraction1 = new Fraction(1, 7);
        Fraction fraction2 = new Fraction(1, 7);

        Fraction result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new Fraction(2, 7), result);
    }

    @Test
    public void should_sum_1_5_plus_2_5_be_3_5() {
        Fraction fraction1 = new Fraction(1, 5);
        Fraction fraction2 = new Fraction(2, 5);

        Fraction result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new Fraction(3, 5), result);
    }

    @Test
    public void should_sum_1_5_plus_3_5_be_4_5() {
        Fraction fraction1 = new Fraction(1, 5);
        Fraction fraction2 = new Fraction(3, 5);

        Fraction result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new Fraction(4, 5), result);
    }

    @Test
    public void should_sum_2_5_plus_1_5_be_3_5() {
        Fraction fraction1 = new Fraction(2, 5);
        Fraction fraction2 = new Fraction(1, 5);

        Fraction result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new Fraction(3, 5), result);
    }

    @Test
    public void should_sum_2_5_plus_2_5_be_4_5() {
        Fraction fraction1 = new Fraction(2, 5);
        Fraction fraction2 = new Fraction(2, 5);

        Fraction result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new Fraction(4, 5), result);
    }

    @Test
    public void should_sum_2_7_plus_3_7_be_5_7() {
        Fraction fraction1 = new Fraction(2, 7);
        Fraction fraction2 = new Fraction(3, 7);

        Fraction result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new Fraction(5, 7), result);
    }

    /** Test different denominator sum **/
    @Test
    public void should_sum_1_5_plus_1_6_be_11_30() {
        Fraction fraction1 = new Fraction(1, 5);
        Fraction fraction2 = new Fraction(1, 6);

        Fraction result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new Fraction(11, 30), result);
    }

    @Test
    public void should_sum_1_5_plus_1_7_be_12_35() {
        Fraction fraction1 = new Fraction(1, 5);
        Fraction fraction2 = new Fraction(1, 7);

        Fraction result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new Fraction(12, 35), result);
    }

    @Test
    public void should_sum_1_5_plus_1_9_be_14_45() {
        Fraction fraction1 = new Fraction(1, 5);
        Fraction fraction2 = new Fraction(1, 9);

        Fraction result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new Fraction(14, 45), result);
    }

    @Test
    public void should_sum_1_5_plus_2_11_be_21_55() {
        Fraction fraction1 = new Fraction(1, 5);
        Fraction fraction2 = new Fraction(2, 11);

        Fraction result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new Fraction(21, 55), result);
    }

    @Test
    public void should_sum_1_6_plus_2_11_be_23_66() {
        Fraction fraction1 = new Fraction(1, 6);
        Fraction fraction2 = new Fraction(2, 11);

        Fraction result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new Fraction(23, 66), result);
    }

    @Test
    public void should_sum_1_6_plus_3_11_be_29_66() {
        Fraction fraction1 = new Fraction(1, 6);
        Fraction fraction2 = new Fraction(3, 11);

        Fraction result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new Fraction(29, 66), result);
    }

    /** Fraction simplification **/

    @Test
    public void should_simplify_2_4_by_1_2() {
        Fraction fraction1 = new Fraction(2, 4);

        Fraction result = FractionOperations.simplify(fraction1);

        assertEquals(new Fraction(1, 2), result);
    }

    @Test
    public void should_simplify_2_6_by_1_3() {
        Fraction fraction1 = new Fraction(2, 6);

        Fraction result = FractionOperations.simplify(fraction1);

        assertEquals(new Fraction(1, 3), result);
    }

    @Test
    public void should_simplify_4_6_by_2_3() {
        Fraction fraction1 = new Fraction(4, 6);

        Fraction result = FractionOperations.simplify(fraction1);

        assertEquals(new Fraction(2, 3), result);
    }

    @Test
    public void should_simplify_2_8_by_1_4() {
        Fraction fraction1 = new Fraction(2, 8);

        Fraction result = FractionOperations.simplify(fraction1);

        assertEquals(new Fraction(1, 4), result);
    }

    @Test
    public void should_simplify_6_8_by_3_4() {
        Fraction fraction1 = new Fraction(2, 8);

        Fraction result = FractionOperations.simplify(fraction1);

        assertEquals(new Fraction(1, 4), result);
    }

    /** Fraction sum + simplification **/
    @Test
    public void should_sum_1_3_plus_1_6_be_1_2() {
        Fraction fraction1 = new Fraction(1, 3);
        Fraction fraction2 = new Fraction(1, 6);

        Fraction result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new Fraction(1, 2), result);
    }

    /** Fraction sum + simplification **/
    @Test
    public void should_sum_1_3_plus_2_6_be_1_3() {
        Fraction fraction1 = new Fraction(1, 3);
        Fraction fraction2 = new Fraction(2, 6);

        Fraction result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new Fraction(2, 3), result);
    }

    /** Fraction sum + simplification **/
    @Test
    public void should_sum_1_6_plus_2_6_be_1_2() {
        Fraction fraction1 = new Fraction(1, 6);
        Fraction fraction2 = new Fraction(2, 6);

        Fraction result = FractionOperations.sum(fraction1, fraction2);

        assertEquals(new Fraction(1, 2), result);
    }

}
