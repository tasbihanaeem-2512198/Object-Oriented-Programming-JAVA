import java.util.Scanner;
class Rectangle{
    float length;
    float width;
    public float calculateArea(){
        float area=length*width;
        return area;
    }
}
public class Question4{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Rectangle a1=new Rectangle();
    System.out.print("Enter the length of a rectangle:");
    a1.length=sc.nextFloat();
    System.out.print("Enter the width of a rectangle:");
    a1.width=sc.nextFloat();
    System.out.println("The area of a rectangle is "+a1.calculateArea());
    }
}