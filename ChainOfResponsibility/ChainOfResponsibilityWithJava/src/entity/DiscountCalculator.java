package entity;

import java.math.BigDecimal;

public class DiscountCalculator {
    public BigDecimal calculate(Budget budget) {
        if (budget.getPrice().compareTo(new BigDecimal("500")) > 0) {
            return budget.getPrice().multiply(new BigDecimal("0.1"));
        }
        if (budget.getItemsAmount()>5) {
            return budget.getPrice().multiply(new BigDecimal("0.1"));
        }

        // Many if for each (if) 
        return BigDecimal.ZERO;
    }
}
