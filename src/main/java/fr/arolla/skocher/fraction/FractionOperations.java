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

            FractionVo result = new FractionVo(numerator, denominator);

            return simplify(result);
        }

        int numerator = fraction1.getNumerator() + fraction2.getNumerator();
        FractionVo result =  new FractionVo(numerator, fraction1.getDenominator());

        return simplify(result);
    }

    public static FractionVo simplify(FractionVo fraction) {
        int gcd = gcd(fraction.getNumerator(), fraction.getDenominator());

        return new FractionVo(
            fraction.getNumerator() / gcd,
            fraction.getDenominator() / gcd
        );
    }
}
