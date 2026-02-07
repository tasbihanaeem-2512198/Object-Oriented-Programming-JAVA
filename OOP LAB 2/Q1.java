class DigitalClock{
    private int hours;
    private int minutes;

    DigitalClock(){
     hours=7;
     minutes=30;
     System.out.println("Digital clock initialized "+hours+":"+minutes);
    }
    public void displayTime(){
        System.out.println("Current Time:"+hours+":"+minutes);
    }
    protected void finalize() throws Throwable{
        System.out.println("Clock is destroyed.");
    }
}
public class Q1{
    public static void main(String[] args){
        DigitalClock clock=new DigitalClock();
        clock.displayTime();
        clock=null;
        System.gc();
        
    }
}