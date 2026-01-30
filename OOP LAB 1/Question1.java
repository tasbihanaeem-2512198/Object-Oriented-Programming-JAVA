class Car{
    int year;
    String brand;
    String model;

    public void displayCarDetails(){
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("Year:"+year);
    }
}



public class Question1{
    public static void main(String[] args){
      Car c1=new Car();
      c1.year=2026;
      c1.model="A4";
      c1.brand="Audi";
      c1.displayCarDetails();
    }
}
