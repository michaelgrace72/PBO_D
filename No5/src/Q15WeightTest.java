public class Q15WeightTest {
    public static void main(String[] args) {
        // Test the Q15Weight class
        Q15Weight weight = new Q15Weight(10.0);  // Weight in pounds

        System.out.println("Weight in pounds: " + weight.getPounds());
        System.out.println("Weight in kilograms: " + weight.getKilograms());
    }
}