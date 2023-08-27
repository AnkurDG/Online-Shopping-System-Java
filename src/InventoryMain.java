import java.util.HashMap;
import java.util.Map;

class Inventory{
    private Map<Product,Integer> products = new HashMap<Product,Integer>();

    //Constructor
    public Inventory(){}

    // Add product to the inventory
    public void addProduct(Product product,int stock){

        products.put(product,stock);
    }

    // Update the Stock in the Inventory
    public void updateStock(Product product,int stock){
        products.replace(product,stock);
    }

    //Check if Stock is empty
    public boolean inStock(Product product){

        int value = products.get(product);

        if(value>0){
            return true;
        }

        return false;
    }

    // Update the Stock in the Inventory
    public void reStock(Product product,int quantity){
        int value = products.get(product);

        value+=quantity;

        products.replace(product,value);
    }

}


public class InventoryMain {

    public static void main(String[] args){
        Inventory i = new Inventory();

        Product p1 = new Product("Ankur","Solapur",20.9,1);

        i.addProduct(p1,1);
        i.addProduct(p1,2);

//        System.out.println(i.inStock(p1));
//        i.inStock(p1);
    }
}
