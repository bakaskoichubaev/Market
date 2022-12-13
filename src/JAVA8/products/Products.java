package JAVA8.products;

import java.time.LocalDate;

public abstract class  Products {
    private String name;
    private int price;
    private LocalDate localDate;
    private String description;
    private String MadeIn;

    public Products(String name, int price, LocalDate localDate, String description, String madeIn) {
        this.name = name;
        this.price = price;
        this.localDate = localDate;
        this.description = description;
        MadeIn = madeIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMadeIn() {
        return MadeIn;
    }

    public void setMadeIn(String madeIn) {
        MadeIn = madeIn;
    }

    @Override
    public String toString() {
        return "\nPRODUCTS NAME : "+name+
                "\nPRICE : "+price+
                "\nLOCALDATE : "+localDate+
                "\nDESCRIPTION : "+description+
                "\nМADE IN : "+MadeIn;
    }
}
