package p2;

public class Seconds implements TimeUnit{
    int number;
    public Seconds(int number){
        this.number = number;
    }
    @Override
    public int getSeconds(){
        return number;
    }
}
