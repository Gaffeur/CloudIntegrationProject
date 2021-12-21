package test;

public class MyPizza {

    String name;
    double price;
    int promotion;
    String size;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPromotion() {
        return promotion;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPromotion(int promotion) {
        this.promotion = promotion;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "My Pizza [name=" + name + ", price=" + price + ", promotion=" + promotion + ", size=" + size + "]";
    }
}
