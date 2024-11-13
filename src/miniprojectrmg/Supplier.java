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
public class Supplier {
    private String id;
    private String name;
    private String contactInfo;
    List<Fabric>suppliedFabrics=new ArrayList<>();
    
    public Supplier(String id,String name,String contactInfo){
        this.id=id;
        this.name=name;
        this.contactInfo=contactInfo;
        
    }
    
    public void addFabric(Fabric fabric){
        suppliedFabrics.add(fabric);
        
    }
    public List<Fabric> getSuppliedFabrics(){
        return suppliedFabrics;
    }
}
