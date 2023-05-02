package entity.discounts;

import entity.Budget;

import java.math.BigDecimal;

public class DiscountForHighPrice extends Discount {
    public DiscountForHighPrice(Discount next) {
        super(next);
    }

    @Override
    protected BigDecimal calculateImplementation(Budget budget) {
        return budget.getPrice().multiply(new BigDecimal("0.1"));
    }

    @Override
    protected boolean mustCalculate(Budget budget) {
        return budget.getPrice().compareTo(new BigDecimal("500")) > 0;
    }
}
