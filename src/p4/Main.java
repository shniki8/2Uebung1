package p4;

public class Main {
    public static void main(String[] args) {
        Discountable d = new Book(12.69);
        System.out.println(d.getDiscountPrice()); //Buecher duerfen in Deutschland im Rahmen der Buchpreisbindung nur in bestimmten Ausnahmefällen reduziert werden!
        d = new Book(50);
        System.out.println(d.getDiscountPrice());
        d = new Electronic(100);
        System.out.println(d.getDiscountPrice());
        //:D

    }
}
