class Student{
    private String name;
    private int rollNumber;
    private double marks;

    Student(){
        name="Tasbiha";
        rollNumber=2512198;
        marks=88.9;
    }
    public void displayStudentInfo(){
        System.out.println("Student name:"+name);
        System.out.println("Student rollnumber:"+rollNumber);
        System.out.println("Student marks:"+marks);
    }
    protected void finalize() throws Throwable{
        System.out.println("Student object is destroyed");
    }
  
    
}
public class Q2{
    public static void main(String[] args){
        Student s1=new Student();
        s1.displayStudentInfo();
        s1=null;
        System.gc();



    }
}