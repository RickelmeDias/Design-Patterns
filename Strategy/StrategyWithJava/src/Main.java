import entity.Budget;
import entity.TaxCalculator;
import enums.TaxTypeEnum;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"));
        TaxCalculator taxCalculator = new TaxCalculator();

        System.out.println(taxCalculator.calculate(budget, TaxTypeEnum.ICMS));
        System.out.println(taxCalculator.calculate(budget, TaxTypeEnum.ISS));
    }
}