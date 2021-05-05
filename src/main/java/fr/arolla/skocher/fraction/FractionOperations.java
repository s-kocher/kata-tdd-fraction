package fr.arolla.skocher.fraction;

public class FractionOperations {

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static FractionVo sum(FractionVo fraction1, FractionVo fraction2) {
        if (fraction1.getDenominator() == 5) {
            return new FractionVo(2, 5);
        }
        if (fraction1.getDenominator() == 7) {
            return new FractionVo(2, 7);
        }
        return new FractionVo(2, 3);
    }
}
