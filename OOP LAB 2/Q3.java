class Temperature{
    double celsius;
    double fahrenheit;
    double kelvin;
   Temperature(double c){
    celsius=c;
    System.out.println("Temperature object created with "+celsius);
   }
  public void toFahrenheit(){
     fahrenheit=(celsius*9/5)+32;
  }
  public void toKelvin(){
    kelvin=celsius+273.15;
  }
 public void displayTemperature(){
   System.out.println("Temperature in Celsius:"+celsius);
   System.out.println("Temperature in Farenheit:"+fahrenheit);
   System.out.println("Temperature in Kelvin:"+kelvin);
 }
 protected void finalize() throws Throwable{
     System.out.println("Temperature object destroyed.");
 }

}
public class Q3{
    public static void main(String[] args){
     double temperature_in_celsius=25;
     Temperature t1=new Temperature(temperature_in_celsius);
     t1.toFahrenheit();
     t1.toKelvin();
     t1.displayTemperature();
     t1=null;
     System.gc();

}
}
