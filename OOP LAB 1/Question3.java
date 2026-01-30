import java.util.Scanner;
class Calculator{

    public float add(float n1,float n2){
       return n1+n2;
    }
    public float subtract(float n1,float n2){
        return n1-n2;
    }
    public float divide(float n1,float n2){
        if(n2==0){
            System.out.println("Division not possible");
            return 0;
        }
        else{
            return n1/n2;
        }
    }
    public float multiply(float n1,float n2){
      return n1*n2;
    }
}
public class Question3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Calculator operation=new Calculator();
        System.out.print("Enter the first number:");
        float number1=sc.nextFloat();
        System.out.print("Enter the another number:");
        float number2=sc.nextFloat();
        System.out.println("Addition Result:"+operation.add(number1,number2));
        System.out.println("Subtraction Result:"+operation.subtract(number1,number2));
        System.out.println("Division Result:"+operation.divide(number1,number2));
        System.out.println("Multiplication Result:"+operation.multiply(number1,number2));
        
    }
}