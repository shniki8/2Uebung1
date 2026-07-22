package again.p4;

public class Book implements Discountable{
    double price;
    public Book(double price){
        this.price = price;
    }
    @Override
    public double getPrice() {
        return price;
    }
    // kurz überlegt die default Methode mit Inhalt return Discountable.super.getDiscountPrice(); zu überschreiben aber kann die ja einfach weglassen.
}
