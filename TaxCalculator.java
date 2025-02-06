public class TaxCalculator {
    public double calculateTax(double income) {
        if (income <= 10000) {
            return income * 0.1;
        } else if (income <= 20000) {
            return 1000 + (income - 10000) * 0.2;
        } else {
            return 3000 + (income - 20000) * 0.3;
        }
    }

    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();
        double income = 25000;
        double tax = calculator.calculateTax(income);
        System.out.println("Income: " + income);
        System.out.println("Tax: " + tax);
    }
}
