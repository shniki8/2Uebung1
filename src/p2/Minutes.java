package p2;

public class Minutes implements TimeUnit{
    int number;
    public Minutes(int number){
        this.number = number;
    }
    @Override
    public int getSeconds(){
        return number*60;
    }
}
