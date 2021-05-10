package fr.arolla.skocher.fraction;

import java.util.Objects;

public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction that = (Fraction) o;
        return numerator == that.numerator && denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction add(Fraction otherFraction) {
        int numeratorWithSameDenominator = numerator * otherFraction.getDenominator();
        int numeratorOtherWithSameDenominator = otherFraction.getNumerator() * denominator;

        int sameDenominator = denominator * otherFraction.getDenominator();

        int numeratorsSumWithSameDenominator = numeratorWithSameDenominator + numeratorOtherWithSameDenominator;

        Fraction result = new Fraction(numeratorsSumWithSameDenominator, sameDenominator);

        return result.simplify();
    }

    public Fraction simplify() {
        int gcd = gcd(numerator, denominator);

        return new Fraction(
            numerator / gcd,
            denominator / gcd
        );
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
