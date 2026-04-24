package p4;

public class Book implements Discountable{ //beloved media
    double price;
    public Book(double price){
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
