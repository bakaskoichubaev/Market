package JAVA8.classes;

public class Market {
    private String name;
    private String description;
    private int bank;
    private String phoneNumber;

    public Market(String name, String description, int bank, String phoneNumber) {
        this.name = name;
        this.description = description;
        this.bank = bank;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBank() {
        return bank;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return  "\nNAME : " + name +
                "\nDESCRIPTION : " + description +
                "\nBANK ACCOUNT : " + bank +
                "\nPHONE NUMBER : " + phoneNumber ;

    }
}
