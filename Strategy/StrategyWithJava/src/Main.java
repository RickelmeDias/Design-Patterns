import entity.Budget;
import entity.TaxCalculator;
import entity.taxes.ICMS;
import entity.taxes.ISS;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"));
        TaxCalculator taxCalculator = new TaxCalculator();

        System.out.println(taxCalculator.calculate(budget, new ICMS()));
        System.out.println(taxCalculator.calculate(budget, new ISS()));
    }
}