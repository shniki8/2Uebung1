package again.p3;

public class Main {
    public static void main(String[] args) {
        System.out.println(createShape('c',1,0).getArea()); //PI!!!!
        System.out.println(createShape('r',2,8).getArea());
    }
    //Schöpferische Aktivitäten
    public static Shape createShape( char type, double a, double b){
        if (type == 'c'){
            return new Circle(a);
        } else if (type == 'r') {
            return new Rectangle(a,b);
        }
        System.out.println("Viel Spaß mit null :) ");
        return null;
    }
}
