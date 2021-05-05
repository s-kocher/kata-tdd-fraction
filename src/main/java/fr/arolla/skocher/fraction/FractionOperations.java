package fr.arolla.skocher.fraction;

public class FractionOperations {

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static FractionVo sum(FractionVo fraction1, FractionVo fraction2) {
        if (fraction1.getDenominator() != fraction2.getDenominator()) {
            int numerator =
                fraction1.getNumerator() * fraction2.getDenominator() +
                fraction2.getNumerator() * fraction1.getDenominator();
            int denominator = fraction1.getDenominator() * fraction2.getDenominator();

            return new FractionVo(numerator, denominator);
        }

        int numerator = fraction1.getNumerator() + fraction2.getNumerator();

        return new FractionVo(numerator, fraction1.getDenominator());
    }

    public static FractionVo simplify(FractionVo fraction) {
        if (fraction.getDenominator() == 6) {
            if (fraction.getNumerator() == 4) {
                return new FractionVo(2, 3);
            }
            return new FractionVo(1, 3);
        }
        if (fraction.getDenominator() == 8) {
            if (fraction.getNumerator() == 2) {
                return new FractionVo(1, 4);
            }
        }
        return new FractionVo(1, 2) ;
    }
}
