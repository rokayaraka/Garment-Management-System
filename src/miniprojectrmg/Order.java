/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojectrmg;
import java.util.*;
/**
 *
 * @author ROKAYA SULTANA RAKA
 */
public class Order {
    private String orderId;
    private Date orderDate;
    private List<Garment>garments=new ArrayList<>();
    private double totalAmount;
    
    public Order(String orderId, Date orderDate, double totalAmount){
        this.orderId=orderId;
        this.orderDate=orderDate;
        this.totalAmount=totalAmount;
        
    }
    public void addGarment(Garment garment){
        garments.add(garment);
        
    }
    public double calculateTotalAmount(){
        for(Garment garment:garments)
        {
            totalAmount= totalAmount+garment.stockQuantity;
        }
        return totalAmount;
    }
    public void printOrderDetails(){
        System.out.println(orderId);
        System.out.println(orderDate);
        System.out.println(totalAmount);
        for(Garment garment:garments){
            System.out.println(garment.name+"\n"+ garment.size+"\n"+totalAmount);
            
            
            
        }
    }
}
