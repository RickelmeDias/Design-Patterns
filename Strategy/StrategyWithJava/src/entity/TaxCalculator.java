package entity;

import entity.taxes.TaxType;

import java.math.BigDecimal;

public class TaxCalculator {

    public BigDecimal calculate(Budget budget, TaxType tax) {
        return tax.calculate(budget);
    }

}
