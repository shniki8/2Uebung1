package again.p4;

public class Main {
    public static void main(String[] args) {
        Book b = new Book(12);
        Electronic e = new Electronic(250);
        System.out.println("o: " + b.getPrice() + " d: " + b.getDiscountPrice()); //ILLEGAL, Bücher sind in Deutschland preisgebunden!
        System.out.println("o: " + e.getPrice() + " d: " + e.getDiscountPrice());
    }
}
