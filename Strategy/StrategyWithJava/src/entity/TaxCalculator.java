package entity;

import enums.TaxTypeEnum;

import java.math.BigDecimal;

public class TaxCalculator {

    public BigDecimal calculate(Budget budget, TaxTypeEnum tax) {
        switch (tax) {
            case IR:
                return budget.getPrice().multiply(new BigDecimal("0.27"));
            case ICMS:
                return budget.getPrice().multiply(new BigDecimal("0.18"));
            case ISS:
                return budget.getPrice().multiply(new BigDecimal("0.05"));
            case IPTU:
                return budget.getPrice().multiply(new BigDecimal("0.15"));
            /*

            Without the Pattern Strategy, the class will repeat it
            n times, creating a big if/else (switch/case) for a unique class.

            case ...:
                ...
            case ...:
                ...

            In this sample case, it is just a unique return, but it could have a big implementation for each case and it probably will turn this class uncontrollable.
             */
            default:
                return BigDecimal.ZERO;
        }
    }

}
