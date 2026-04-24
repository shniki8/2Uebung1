package p2;

public class Main
{
    public static void main(String[] args) {
        TimeUnit tu = new Hours(727);
        TimeUnit tu2 = new Seconds(69);
        TimeUnit tu3 = new Minutes(67);
        System.out.println(tu.getSeconds() + " geq 4000: " + atLeast4000Seconds(tu));
        System.out.println(tu.getSeconds() + " geq 4000: " + atLeast4000Seconds(tu));
        System.out.println(tu.getSeconds() + " geq 4000: " + atLeast4000Seconds(tu));
    }
    public static boolean atLeast4000Seconds(TimeUnit t) {
        if(t.getSeconds() >= 4000) return true;
        return false;
    }
}
