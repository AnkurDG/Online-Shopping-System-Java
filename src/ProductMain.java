
import java.util.Objects;

class Product{
    private String name;
    private String description;
    private double price;
    private int stockLevel;

    // Constructor
    public Product(String name,String description,double price,int stockLevel){

        this.name = name;
        this.description = description;
        this.price = price;
        this.stockLevel = stockLevel;

    }

    // Getters
    final public String getName(){
        return name;
    }
    final public String getDescription(){
        return description;
    }
     public double getPrice(){
        return price;
    }
     public int getStockLevel(){
        return stockLevel;
    }

    //Setters


    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }


    // Comparing two products
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Product otherProduct = (Product) obj;
        return name.equals(otherProduct.name) &&
                description.equals(otherProduct.description) &&
                Double.compare(price, otherProduct.price) == 0 &&
                stockLevel == otherProduct.stockLevel;
    }

    // this function hashes the attributes into to single hash code to use in hashMap Data Structure as key
    public int hashCode() {
        return Objects.hash(name, description, price, stockLevel);
    }


}





public class ProductMain{
    public static void main(String[] args){

//        Product p1 = new Product("Ankur","Solapur",20.9,1);
//        Product p2 = new Product("Atharv", "Solapur",20.9,1);

//        System.out.println(p1.hashCode());
//        System.out.println(p2.hashCode());
//        //-1774504381

    }
}
