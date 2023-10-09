public class Q16Fraction {
    private int numerator;
    private int denominator;

    // Constructor
    public Q16Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // sum of fractions
    public Q16Fraction getSum(Q16Fraction other) {
        int sumNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int sumDenominator = this.denominator * other.denominator;
        return new Q16Fraction(sumNumerator, sumDenominator);
    }

    //product of fractions
    public Q16Fraction getProduct(Q16Fraction other) {
        int productNumerator = this.numerator * other.numerator;
        int productDenominator = this.denominator * other.denominator;
        return new Q16Fraction(productNumerator, productDenominator);
    }

    // Return the fraction into string
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}