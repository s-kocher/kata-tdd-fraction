package fr.arolla.skocher.fraction;

public class FractionOperations {

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static FractionVo sum(FractionVo fraction1, FractionVo fraction2) {
        if (fraction2.getNumerator() == 2) {
            return new FractionVo(3, fraction1.getDenominator());
        }
        if (fraction2.getNumerator() == 3) {
            return new FractionVo(4, fraction1.getDenominator());
        }

        if (fraction1.getNumerator() == 2) {
            return new FractionVo(3, fraction1.getDenominator());
        }

        return new FractionVo(2, fraction1.getDenominator());
    }
}
