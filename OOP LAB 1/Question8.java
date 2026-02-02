
class Product{
String productName;
int stock;
float discount;
double price;
public void displayProduct(){
    System.out.println("Product Name:"+productName);
    System.out.println("Price:"+price);
    System.out.println("Stock:"+stock);
    System.out.println("Discount:"+discount+"%");

}
public void applyDiscount(){
          double discountAmount=price*discount/100;
          price=price-discountAmount;
          System.out.println("Price after discount "+price);



}
public void updateStock(int quantitysold){
    if(quantitysold<=stock){
    stock=stock-quantitysold;
    System.out.println("Stock updated,remaining stock "+stock);
    }
    else{
        System.out.println("Not enough stock available!");
    }




}
}
public class Question8{
    public static void main(String[] args){
    Product p1=new Product();
    p1.productName="Head and Shoulder shampoo";
    p1.price=1000;
    p1.discount=10;
    p1.stock=10;

   p1.displayProduct();
   p1.applyDiscount();
   p1.updateStock(2);


    }
}