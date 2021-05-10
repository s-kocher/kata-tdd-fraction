package fr.arolla.skocher.fraction;

public class FractionOperations {

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static Fraction sum(Fraction fraction1, Fraction fraction2) {
        int numerator =
            fraction1.getNumerator() * fraction2.getDenominator() +
            fraction2.getNumerator() * fraction1.getDenominator();
        int denominator = fraction1.getDenominator() * fraction2.getDenominator();

        Fraction result = new Fraction(numerator, denominator);

        return simplify(result);
    }

    public static Fraction simplify(Fraction fraction) {
        int gcd = gcd(fraction.getNumerator(), fraction.getDenominator());

        return new Fraction(
            fraction.getNumerator() / gcd,
            fraction.getDenominator() / gcd
        );
    }
}
