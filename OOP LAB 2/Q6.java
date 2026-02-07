class Movie{
       private String movieName;
        private int availableSeats;
        private double ticketPrice;

        Movie(String movieName,int availableSeats,double ticketPrice){
            this.movieName=movieName;
            this.availableSeats=availableSeats;
            this.ticketPrice=ticketPrice;
        }
        public void bookTickets(int seats){

             int booktickets=5;
             this.availableSeats=this.availableSeats-booktickets;
             System.out.println("Avenger is now available for booking!");
             System.out.println("5 tickets book for Avenger| Remaining seats:"+this.availableSeats);

        }

        public void displayMovieInfo(){
            System.out.println("Movie:"+this.movieName);
            System.out.println("Available Seats:"+this.availableSeats);
            System.out.println("Ticket Price:"+this.ticketPrice+"$");
        }
        protected void finalize() throws Throwable{
            System.out.println("Movie booking closed:"+this.movieName);
        }
}

public class Q6{
    public static void main(String[] args){
        Movie m1=new Movie("Avenger",50,10);
        m1.bookTickets(50);
        m1.displayMovieInfo();
        m1=null;
        System.gc();
    }
}