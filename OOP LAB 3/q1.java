class MusicSession{
    String title;
    String artist;
    double duration;
    static int totalsongsplayed=0;
    MusicSession(String title,String artist,double duration){
        this.title=title;
        this.artist=artist;
        this.duration=duration;
    }
    public  void playsong(){
          System.out.println("Played:"+title+" by "+artist+" "+duration);
          totalsongsplayed++;
    }
    public static void displaytotalsongsplayed(){
       System.out.println("Total songs played:"+totalsongsplayed);
    }


}
public class q1{
    public static void main(String[] args){
     MusicSession song1=new MusicSession("Shape of you","Ed Shereen",2);
     MusicSession song2=new MusicSession("Tere bin","Asim Azhar",4);
     MusicSession song3=new MusicSession("Desert Rain","Mesi",5);
     song1.playsong();
     song2.playsong();
     song3.playsong();
     MusicSession.displaytotalsongsplayed();
    }
}
