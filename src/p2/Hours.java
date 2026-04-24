package p2;

public class Hours implements TimeUnit {
    int number;
    public Hours(int number){
        this.number=number;
    }
    @Override
    public int getSeconds(){
        return number*60*60;
    }
}
