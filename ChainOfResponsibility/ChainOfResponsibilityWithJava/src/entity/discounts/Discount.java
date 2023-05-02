package entity.discounts;

import entity.Budget;

import java.math.BigDecimal;

public abstract class Discount {
    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    public BigDecimal calculate(Budget budget) {
        if (mustCalculate(budget)) {
            return calculateImplementation(budget);
        }
        return next.calculate(budget);
    }

    protected abstract BigDecimal calculateImplementation(Budget budget);
    protected abstract boolean mustCalculate(Budget budget);
}
