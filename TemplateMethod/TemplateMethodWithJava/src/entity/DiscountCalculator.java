package entity;

import entity.discounts.Discount;
import entity.discounts.DiscountForHighPrice;
import entity.discounts.DiscountForManyItems;
import entity.discounts.NoDiscount;

import java.math.BigDecimal;

public class DiscountCalculator {
    public BigDecimal calculate(Budget budget) {
        Discount discount = new DiscountForManyItems(
                                new DiscountForHighPrice(
                                            new NoDiscount()));
        return discount.calculate(budget);
    }
}
