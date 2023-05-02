package entity.taxes;

import entity.Budget;

import java.math.BigDecimal;

public interface TaxType {
    public BigDecimal calculate(Budget budget);
}
