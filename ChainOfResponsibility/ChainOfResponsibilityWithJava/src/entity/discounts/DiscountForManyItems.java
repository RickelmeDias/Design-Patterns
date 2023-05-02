package entity.discounts;

import entity.Budget;

import java.math.BigDecimal;

public class DiscountForManyItems extends Discount {
    public DiscountForManyItems(Discount next) {
        super(next);
    }

    public BigDecimal calculate(Budget budget) {
        if (budget.getItemsAmount()>5) {
            return budget.getPrice().multiply(new BigDecimal("0.1"));
        }
        return next.calculate(budget);
    }
}
