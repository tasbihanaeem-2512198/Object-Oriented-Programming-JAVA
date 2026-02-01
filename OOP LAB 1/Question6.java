import java.util.Scanner;
class Student{
    String name;
    int rollNumber;
    int[] marks = new int[5];
    int totalMarks;
    float percentage;
    char grade;

    public void inputDetails(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter student name:");
    name=sc.nextLine();
    System.out.println("Enter student roll number:");
    rollNumber=sc.nextInt();
    for(int i=0;i<marks.length;i++){
    System.out.println("Enter the student marks of subject:" +(i+1)+":");
    marks[i]=sc.nextInt();
    }
    }
    public void calculateGrade(){
        for(int i=0;i<marks.length;i++){
            totalMarks+=marks[i];
        }
        percentage=(totalMarks/500.0f)*100.0f;
        if(percentage>=90 && percentage<=100){
            grade='A';
        }
        else if(percentage>=80 && percentage<=89){
            grade='B';
        }
        else if(percentage>=70 && percentage<=79){
            grade='C';
        }
        else if(percentage>=60 && percentage<=69){
            grade='D';
        }
        else{
            grade='F';
        }

    }
    public void displayReportCard(){
     System.out.println("Student name:"+name);
     System.out.println("Student rollnumber:"+rollNumber);
     System.out.println("Student totalMarks:"+totalMarks);
     System.out.println("Student percentage:"+percentage);
     System.out.println("Student grade:"+grade);

    }
}
public class Question6{
    public static void main(String[] args){
    Student s1=new Student();
    s1.inputDetails();
    s1.calculateGrade();
    s1.displayReportCard();
    }
}