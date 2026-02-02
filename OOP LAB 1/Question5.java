import java.util.Scanner;
class Book{
String title;
String author;
int ISBN;
boolean isAvailable;
int quantity=0;

public void addDetails(){
  Scanner s1=new Scanner(System.in);
  System.out.println("Enter the book title:");
  title=s1.nextLine();
  System.out.println("Enter the name of book author:");
  author=s1.nextLine();
  System.out.println("Enter the book ISBN number:");
  ISBN=s1.nextInt();
  s1.nextLine();
  isAvailable=true;
  quantity+=1;
  System.out.println("Book added sucessfully.");
}
public void displayBookDetails(){
    System.out.println("Book title:"+title);
    System.out.println("Book author:"+author);
    System.out.println("Book ISBN:"+ISBN);
    if(isAvailable==true){
        System.out.println("Book is available.");
    }
    else{
        System.out.println("Book is issued to a student.");
    }
}
public void updateAvailibility(){
      Scanner s1=new Scanner(System.in);
      System.out.println("Do you want to issue the book or return the book? (return/issue)");
      String choice=s1.nextLine();
      if(choice.equalsIgnoreCase("issue")){
        if(isAvailable && quantity>0){
            quantity-=1;
            if(quantity==0){
                isAvailable=false;
            }
            System.out.println("Book has been issued successfully.");
        }
        else{
            System.out.println("Book is not available for issuing.");
        }
      }
      else if(choice.equalsIgnoreCase("return")){
        quantity+=1;
        isAvailable=true;
        System.out.println("Book has been successfully returned.");
      }
      else{
        System.out.println("Invalid choice");
      }

}

public void searchBook(){
    int isbn;
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter the ISBN of the book that you want to search:");
    isbn=s1.nextInt();
    if(isbn==ISBN){
        displayBookDetails();
    }
    else{
        System.out.println("Book not found");
    }

}
}
public class Question5{
    public static void main(String[] args){
      Book b1=new Book();
      b1.addDetails();
      b1.displayBookDetails();
      b1.updateAvailibility();
      b1.searchBook();
    } 
}