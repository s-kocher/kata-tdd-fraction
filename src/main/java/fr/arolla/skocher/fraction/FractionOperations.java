package fr.arolla.skocher.fraction;

public class FractionOperations {

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static FractionVo sum(FractionVo fraction1, FractionVo fraction2) {
        if (fraction1.getDenominator() != fraction2.getDenominator()) {
            int numerator = fraction1.getDenominator() + fraction2.getDenominator();
            int denominator = fraction1.getDenominator() * fraction2.getDenominator();

            return new FractionVo(numerator, denominator);
        }

        int numerator = fraction1.getNumerator() + fraction2.getNumerator();

        return new FractionVo(numerator, fraction1.getDenominator());
    }
}
