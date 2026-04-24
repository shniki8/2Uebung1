package p4;

public class Electronic implements Discountable{
    double price;
    public Electronic(double price){
        this.price = price;

    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public double getDiscountPrice(){
        return price - (price*(DEFAULT_DISCOUNT*2));
    }
}
