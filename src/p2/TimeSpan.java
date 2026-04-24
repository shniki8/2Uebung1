package p2;

public class TimeSpan implements TimeUnit{
    Seconds seconds;
    Minutes minutes;
    Hours hours;

    public TimeSpan(int hours, int minutes, int seconds){
    this.seconds = new Seconds(seconds);
    this.minutes = new Minutes(minutes);
    this.hours = new Hours(hours); // HORA


    }

    @Override
    public int getSeconds() {
        return seconds.getSeconds() + minutes.getSeconds() + hours.getSeconds();
    }
}
