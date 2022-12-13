package JAVA8.products;

import java.time.LocalDate;

public class ChildrenFood extends Products {
    int discount = 0;

    public ChildrenFood(String name, int price, LocalDate localDate, String description, String madeIn, int discount) {
        super(name, price, localDate, description, madeIn);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
