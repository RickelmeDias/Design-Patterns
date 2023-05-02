import entity.Budget;
import entity.DiscountCalculator;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"), 6);
        Budget budget2 = new Budget(new BigDecimal("450"), 1);
        DiscountCalculator discountCalculator = new DiscountCalculator();

        System.out.println(discountCalculator.calculate(budget));
        System.out.println(discountCalculator.calculate(budget2));
    }
}