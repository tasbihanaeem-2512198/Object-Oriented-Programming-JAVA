class StudentDetail{
    int age;
    int rollNumber;
    String name;

    public void displayStudentDetails(){
         System.out.println("Student name:"+name);
         System.out.println("Student age:"+age);
         System.out.print("Student rollnumber:"+rollNumber);
    }
}
public class Question2{
    public static void main(String[] args){
        StudentDetail s1=new StudentDetail();
        s1.age=21;
        s1.name="Aisha";
        s1.rollNumber=2512198;
        s1.displayStudentDetails();
    }
}