package entity.discounts;

import entity.Budget;

import java.math.BigDecimal;

public class DiscountForHighPrice extends Discount {
    public DiscountForHighPrice(Discount next) {
        super(next);
    }

    public BigDecimal calculate(Budget budget) {
        if (budget.getPrice().compareTo(new BigDecimal("500")) > 0) {
            return budget.getPrice().multiply(new BigDecimal("0.1"));
        }
        return next.calculate(budget);
    }
}
