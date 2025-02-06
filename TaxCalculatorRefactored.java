public class TaxCalculatorRefactored {

    private static final double FIRST_BRACKET_LIMIT = 10000;
    private static final double SECOND_BRACKET_LIMIT = 20000;
    private static final double FIRST_BRACKET_RATE = 0.1;
    private static final double SECOND_BRACKET_RATE = 0.2;
    private static final double THIRD_BRACKET_RATE = 0.3;

   
    public double calculateTax(double income) {
        if (income <= FIRST_BRACKET_LIMIT) {
            return income * FIRST_BRACKET_RATE;
        } else if (income <= SECOND_BRACKET_LIMIT) {
            return FIRST_BRACKET_LIMIT * FIRST_BRACKET_RATE + (income - FIRST_BRACKET_LIMIT) * SECOND_BRACKET_RATE;
        } else {
            return FIRST_BRACKET_LIMIT * FIRST_BRACKET_RATE + 
                   (SECOND_BRACKET_LIMIT - FIRST_BRACKET_LIMIT) * SECOND_BRACKET_RATE + 
                   (income - SECOND_BRACKET_LIMIT) * THIRD_BRACKET_RATE;
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
