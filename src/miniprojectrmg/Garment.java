
package miniprojectrmg;


public class Garment {
   String id;
   public String name;
   public String description;
   public String size;
   private double price;
   public int stockQuantity;
   
   public Garment(String id,String name, String description, String size,double price,int stockquantity){
       
       this.id=id;
       this.name=name;
       this.description=description;
       this.size=size;
       this.price=price;
       this.stockQuantity=stockquantity;
       
   }
   public void updateStock(int quantity){
       
       this.stockQuantity+=quantity;
       
   }
   public double calculateDiscountPrice(double discountPercentage){
       return price-(price*discountPercentage/100);
       
   }
   
}
