package again.p4;

public class Electronic implements Discountable {
    double price = 0;
    public Electronic(double price){
        this.price = price;
    }
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getDiscountPrice() {
        return getPrice()*(1-0.2);
    }
}
