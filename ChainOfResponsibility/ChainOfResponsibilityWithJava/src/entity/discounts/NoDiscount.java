package entity.discounts;

import entity.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount {
    public NoDiscount() {
        super(null);
    }

    public BigDecimal calculate(Budget budget) {
        return BigDecimal.ZERO;
    }
}
