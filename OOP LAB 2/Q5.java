class SmartEnergyDevice{
  String deviceName;
  String deviceType;
  double powerRating;
  double hoursUsed;

  SmartEnergyDevice(String devicename,String devicetype,double powerrating,double hoursused){
   deviceName=devicename;
   deviceType=devicetype;
   powerRating=powerrating;
   hoursUsed=hoursused;
   System.out.println(deviceName+"("+deviceType+") is now active!");
  }
  public void useDevice(double hours){
    if(hours>0){
    hoursUsed+=hours;
    }
    
  }
  public double calculateEnergyConsumption(){
   double energyConsumption=(powerRating*hoursUsed/1000);
   return energyConsumption;
  }
  public void displayEnergyUsage(){
   System.out.println("Device:"+deviceName+"|Type:"+deviceType+"| Power:"+powerRating+"W | Hours Used:"+hoursUsed+ "| Energy Consumed:"+calculateEnergyConsumption()+"kWh");
  }
  protected void finalize() throws Throwable{
    System.out.println(deviceName+"("+deviceType+")"+"is removed from tracking.");
  }
}

public class Q5{
    public static void main(String[] args){
      SmartEnergyDevice SmartAC=new SmartEnergyDevice("Smart Heater","Heater",2000,5);
      SmartEnergyDevice SmartHeater=new SmartEnergyDevice("Smart Ac","Air conditioner",1500,8);
      SmartAC.useDevice(3);
      SmartAC.calculateEnergyConsumption();
      SmartAC.displayEnergyUsage();
      SmartHeater.useDevice(2);
      SmartHeater.calculateEnergyConsumption();
      SmartHeater.displayEnergyUsage();
      SmartAC=null;
      SmartHeater=null;
      System.gc();
    }
}