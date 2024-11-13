
package miniprojectrmg;


public class Fabric {
    private String id;
    public String type;
    public String color;
    public double pricePerMeter;
    public Fabric(String id, String type, String color, double pricePerMeter){
        this.id=id;
        this.type=type;
        this.color=color;
        this.pricePerMeter=pricePerMeter;
        
    }
    public double calculateCost(double meters){
        return pricePerMeter*meters;
    }
    
}
