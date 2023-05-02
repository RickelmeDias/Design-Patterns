package entity.discounts;

import entity.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount {
    public NoDiscount() {
        super(null);
    }

    @Override
    public BigDecimal calculateImplementation(Budget budget) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean mustCalculate(Budget budget) {
        return true;
    }
}
