public class Q16FractionTest {
    public static void main(String[] args) {
        // Test the Q16Fraction class
        Q16Fraction f1 = new Q16Fraction(1, 2);
        Q16Fraction f2 = new Q16Fraction(3, 7);


        System.out.println("String : " + f1.toString());
        System.out.println("Product : " + f2.getProduct(f1).toString());
        System.out.println("Sum : " + f2.getSum(f1).toString());
    }
}
