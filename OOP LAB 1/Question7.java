import java.util.Scanner;
class ATM{
     String account_holder_name;
     int account_number;
     float balance=0.0f;
    public void checkBalance(){
          System.out.println("Current balance "+balance );
    }
    public void depositMoney(){
        Scanner s1=new Scanner(System.in);
        float deposit_money;
        System.out.println("Enter the amount of money you want to deposit:");
        deposit_money=s1.nextFloat();
        if(deposit_money<0){
            System.out.println("Deposit amount should be positive.");
        }
        else{
        balance+=deposit_money;
        System.out.println(deposit_money+" amount of money has successfully deposited in your account.");}
    }
    public void withdrawMoney(){

        float withdraw_money;
        Scanner s1=new Scanner(System.in);
        if(balance<=0){
            System.out.println("There is insufficient balance,you can't withdraw money.");
        }
        else{
        System.out.println("Enter the amount of money you want to withdraw:");
        withdraw_money=s1.nextFloat();
        if(withdraw_money<0){
            System.out.println("Amount should be positive.");
        }
        else{
        balance-=withdraw_money;
        System.out.println(withdraw_money+" amount of money has successfully withdraw from your account." );
        }
        }
    }

    public void displayMenu(){
        Scanner s1=new Scanner(System.in);
        int choice;
        System.out.println("Press 1 for check balance.");
        System.out.println("Press 2 for deposit money.");
        System.out.println("Press 3 for withdraw money.");
        System.out.println("Press 0 for terminate.");
        while(true){
            System.out.println("Enter your choice:");
            choice=s1.nextInt();
            switch(choice){
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 0:
                    System.out.println("Program terminated...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }  
        }
    }
}

public class Question7{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        ATM a1=new ATM();
        System.out.println("Enter your name:");
        a1.account_holder_name=s1.nextLine();
        System.out.println("Enter your account number:");
        a1.account_number=s1.nextInt();
        a1.balance=5000.0f;
        a1.displayMenu();
    }
}