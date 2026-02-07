class Car{
private String carName;
private double fuelCapacity;
private double fuelConsumptionRate;
private double distanceDriven;

Car(String carName,double fuelCapacity,double fuelConsumptionRate,double distanceDriven){
    this.carName=carName;
    this.fuelCapacity=fuelCapacity;
    this.fuelConsumptionRate=fuelConsumptionRate;
    this.distanceDriven=distanceDriven;
    System.out.println("Car Suzuki WagonR is ready to drive!");
}

public void drive(double distance){
     System.out.println("Drove:"+this.distanceDriven+"km");
     this.fuelCapacity=this.fuelCapacity-this.fuelConsumptionRate;
     System.out.println("Remaining fuel:"+this.fuelCapacity);
    
}

public void refuel(double liters){
    System.out.println("Refuel:"+liters);
    this.fuelCapacity+=liters;
    System.out.println("Current fuel level:"+this.fuelCapacity);

}
public void displayCarStatus(){
     System.out.println("Car:"+this.carName);
     System.out.println("Distance Driven:"+this.distanceDriven+"km");
     System.out.println("Fuel Remaining:"+this.fuelCapacity);
}

 protected void finalize() throws Throwable{
    System.out.println("Car Suzuki WagonR is removed from tracking!");
 }
}
public class Q4{
    public static void main(String[] args){
     Car c1=new Car("WagonR",35,10,200);
     c1.drive(200);
     c1.refuel(10);
     c1.displayCarStatus();
     c1=null;
     System.gc();


    }
}