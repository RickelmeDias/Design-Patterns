package entity.discounts;

import entity.Budget;

import java.math.BigDecimal;

public class DiscountForManyItems extends Discount {
    public DiscountForManyItems(Discount next) {
        super(next);
    }

    @Override
    protected BigDecimal calculateImplementation(Budget budget) {
        return budget.getPrice().multiply(new BigDecimal("0.1"));
    }

    @Override
    protected boolean mustCalculate(Budget budget) {
        return budget.getItemsAmount()>5;
    }
}
