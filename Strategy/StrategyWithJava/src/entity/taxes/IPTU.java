package entity.taxes;

import entity.Budget;

import java.math.BigDecimal;

public class IPTU implements TaxType {
    public BigDecimal calculate(Budget budget) {
        return budget.getPrice().multiply(new BigDecimal("0.15"));
    }
}
