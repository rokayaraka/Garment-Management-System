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
public class Customer {
    private String customerId;
    private String name;
    private String email;
    private String phone;
    List<Order>orders=new ArrayList<>();
    public Customer(String customerId,String name,String email,String phone){
        this.customerId=customerId;
        this.name=name;
        this.email=email;
        this.phone=phone;
    }
    public void placeOrder(Order order){
        orders.add(order);
        
    }
    List<Order>viewOrders(){
        return orders;
    }
    
}
