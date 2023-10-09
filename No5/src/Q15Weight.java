public class Q15Weight {
    private double pounds;

    // Constructo
    public Q15Weight(double pounds) {
        this.pounds = pounds;
    }

    //get weight in pounds
    public double getPounds() {
        return pounds;
    }

    //get weight into kilograms
    public double getKilograms() {
        return pounds * 0.45359237;
    }
}