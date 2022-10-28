package app;

public class Product {
    public double getPrice;
    private double price;
    private int quantity;

    private String name;

    public void setName(String name) {
        this.name = name;

    }
    public String getName(){
        return this.name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Задекларируйте переменные, которые отражают
    // наименование, количество и цену товара.
    // Используйте самый строгий доступ к переменным.
    // Добавьте getters и setters.

}
