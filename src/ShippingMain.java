
class Shipping{
    private String shippingMethod;
    private double shippingCost;

    public Shipping(){
        shippingMethod="";
        shippingCost=0.0;
    }

    public Shipping(String shippingMethod,double shippingCost){
        this.shippingMethod = shippingMethod;
        this.shippingCost = shippingCost;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    // Getters and Setters
    double getShippingCost() { return shippingCost; }

    void setShippingMethod(String shippingMethod) { this.shippingMethod = shippingMethod; }

    void setShippingCost(double shippingCost) { this.shippingCost = shippingCost; }

}



public class ShippingMain {
}
