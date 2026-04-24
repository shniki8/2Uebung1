package p2;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        TimeUnit tu = new Hours(727); //when you see it
        TimeUnit tu2 = new Seconds(69); //nice
        TimeUnit tu3 = new Minutes(67);
        System.out.println(tu.getSeconds() + " geq 4000: " + atLeast4000Seconds(tu)); //greaterequals
        System.out.println(tu2.getSeconds() + " geq 4000: " + atLeast4000Seconds(tu2));
        System.out.println(tu3.getSeconds() + " geq 4000: " + atLeast4000Seconds(tu3));
        TimeSpan ts = new TimeSpan(5, 10, 20);
        System.out.println(ts.getSeconds());
        System.out.println(atLeast(256,'m', ts));
    }
    public static boolean atLeast4000Seconds(TimeUnit t) {
        if(t.getSeconds() >= 4000) return true;
        return false;
    }
    public static boolean atLeast(TimeUnit t, int limit){
    if (t.getSeconds() >= limit){
        return true;
    }
    else return false;
    }
    public static boolean atLeast(int amount, char c, TimeUnit unit){
    switch(c){ //noch nie zuvor freiwillig switch verwendet
        case 's':
            return (unit.getSeconds()>=amount); //fancy schreibweise c:

        case 'm':
            return (unit.getSeconds() >= amount*60); //so rum damit es beim teilen okay wird

        case 'h':
            return (unit.getSeconds() >= amount*60*60);
    }
        System.out.println("Char not recognized, returned false, idiot. C: ");
        return false;
    }
}
