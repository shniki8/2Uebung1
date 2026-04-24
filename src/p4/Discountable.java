package p4;

public interface Discountable {
    double DEFAULT_DISCOUNT = 0.1;
    double getPrice();
    default double getDiscountPrice(){
        return getPrice()-(getPrice()*DEFAULT_DISCOUNT);
    }
}
