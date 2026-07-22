package again.p2;

public class Main
{
    public static void main(String[] args) {
        //No test case :)
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
    switch(c){
        case 's':
            return (unit.getSeconds()>=amount);

        case 'm':
            return (unit.getSeconds() >= amount*60);

        case 'h':
            return (unit.getSeconds() >= amount*60*60);
    }
        System.out.println("Character invalid.");
        return false;
    }
}
