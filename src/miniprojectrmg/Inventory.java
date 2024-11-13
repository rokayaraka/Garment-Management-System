
package miniprojectrmg;
import java.util.*;
/**
 *
 * @author ROKAYA SULTANA RAKA
 */
public class Inventory {
    List<Garment>garments=new ArrayList<>();
    public void addGarment(Garment garment){
        garments.add(garment);
    }
    
    public void removeGarment(String id){
        
    }
    Garment findGarment(String id){
        for(Garment garment:garments){
            if(garment.equals(id)){
                return garment;
            }
        }
        return null;
    }
}
