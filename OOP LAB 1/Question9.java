import java.util.Scanner;
class Patient{
   String name;
   int age;
   String disease;
   int room_number;
   public void patient_Detail(){
        Scanner s1=new Scanner(System.in);
            System.out.println("Enter the patient name:");
            name=s1.nextLine();
            System.out.println("Enter the patient age:");
            age=s1.nextInt();
            System.out.println("Enter the disease:");
            s1.nextLine();
            disease=s1.nextLine();
            System.out.println("Enter the patient room number:");
            room_number=s1.nextInt();
   }
   public void updateDetails(){
       Scanner s1=new Scanner(System.in);

       System.out.println("Do you want to update name: (yes/no)" );
       String ans=s1.nextLine();
       if(ans.equalsIgnoreCase("yes")){
        System.out.println("Enter new name:");
        name=s1.nextLine();
       }

       System.out.println("Do you want to update age: (yes/no)");
       ans=s1.nextLine();
       if(ans.equalsIgnoreCase("yes")){
        System.out.println("Enter new age:");
        age=s1.nextInt();
        s1.nextLine();
       }

       System.out.println("Do you want to update diease: (yes/no)");
       ans=s1.nextLine();
       if(ans.equalsIgnoreCase("yes")){
        System.out.println("Enter new disease:");
        disease=s1.nextLine();
       }

       System.out.println("Do you want to update patient room number: (yes/no)");
       ans=s1.nextLine();
       if(ans.equalsIgnoreCase("yes")){
        System.out.println("Enter new room number:");
        room_number=s1.nextInt();
       }
   }
   public void displayDetails(){
     System.out.println("Patient name:"+name);
     System.out.println("Patient age:"+age);
     System.out.println("Patient room number:"+room_number);
     System.out.println("Patient disease:"+disease);
   }





}
public class Question9{
    public static void main(String[] args){
    Patient p1=new Patient();
    p1.patient_Detail();
    p1.updateDetails();
    p1.displayDetails();
    }

}