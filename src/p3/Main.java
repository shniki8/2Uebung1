package p3;

public class Main {
    public static void main(String[] args) {
        Shape s = createShape('c',69,727); //playing god
        System.out.println(s.getArea());
        s = createShape('r', 69, 727);
        System.out.println(s.getArea());

    }

    public static Shape createShape(char type, double a, double b){
    if (type == 'c'){
        return new Circle(a);
    } else if (type == 'r') {
        return new Rectangle(a,b);
    }
    else //user error, not my problem ¯\_(ツ)_/¯
        System.out.println("Wenn c oder r zu schwer ist, wirst du bestimmt viel Spaß mit diesem null-Object haben!");
        return null;
    }
}
