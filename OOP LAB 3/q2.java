import java.util.Scanner;
class EmployeeSalary{
    private String employeeName;
    private double salary;
    EmployeeSalary(String employeeName,double salary){
        this.employeeName=employeeName;
        this.salary=salary;
    }
    public void displayEmployeeinfo(){
    
        System.out.println("Employee Name:"+employeeName);
        System.out.println("Employee Salary:"+salary);

    }
}
public class q2{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    EmployeeSalary[] emp= new EmployeeSalary[3];
    for(int i=0;i<3;i++){
    System.out.println("Enter the details of Employee "+(i+1));
    System.out.println("Enter the Employee name:");
    String name=sc.nextLine();
    System.out.println("Enter the Employee salary:");
    double salary=sc.nextDouble();
    sc.nextLine();
     emp[i]=new EmployeeSalary(name,salary);
    }
    for(int i=0;i<3;i++){
         emp[i].displayEmployeeinfo();
    }
    }
}