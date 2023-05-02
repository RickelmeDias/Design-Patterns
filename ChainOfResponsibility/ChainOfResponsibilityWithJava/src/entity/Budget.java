package entity;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal price;
    private int itemsAmount;

    public Budget (BigDecimal price, int itemsAmount) {
        this.price = price;
        this.itemsAmount=itemsAmount;
    }

    public BigDecimal getPrice() {
        return this.price;
    }
    public int getItemsAmount() {
        return this.itemsAmount;
    }
}
