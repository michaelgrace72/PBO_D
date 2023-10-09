public class Q11Fraction {
    private int e1;  // Numerator1
    private int d1;  // Denominator1
    private int e2;  // Numerator2
    private int d2;  // Denominator2

    public Q11Fraction(int e1, int d1, int e2, int d2) {
        this.e1 = e1;
        this.d1 = d1;
        this.e2 = e2;
        this.d2 = d2;
    }
    //get sum
    public Q11Fraction add() {
        int sumNumerator = e1 * d2 + e2 * d1;
        int sumDenominator = d1 * d2;
        return new Q11Fraction(sumNumerator, sumDenominator, 1, 1);
    }
    //get product
    public Q11Fraction multiply() {
        int productNumerator = e1 * e2;
        int productDenominator = d1 * d2;
        return new Q11Fraction(productNumerator, productDenominator, 1, 1);
    }
    //return the new e1 and d1 as the answer
    public String toString() {
        return e1 + "/" + d1;
    }


    public static void main(String[] args) {
        // Test the Q11Fraction class for the specified fractions
        Q11Fraction fraction1 = new Q11Fraction(1, 2, 1, 3);
        Q11Fraction fraction2 = new Q11Fraction(1, 3, 3, 4);

        Q11Fraction sumFraction = fraction1.add();
        Q11Fraction productFraction = fraction1.multiply();

        System.out.println("Sum: " + sumFraction.toString());
        System.out.println("Product: " + productFraction.toString());
    }
}
