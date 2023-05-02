package entity;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal price;

    public Budget (BigDecimal price) {
        this.price = price;
    }
    public BigDecimal getPrice() {
        return this.price;
    }
}
