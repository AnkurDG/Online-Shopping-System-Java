import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

class Inventory{
    private HashMap<UUID, Integer> products = new HashMap<>();

    //Constructor
    public Inventory(){}

    // Add product to the inventory
    public void addProduct(Product product,int stock){

        products.put(product.getProductID(),stock);
    }

    // Update the Stock in the Inventory
    public void updateStock(Product product,int stock){
        products.replace(product.getProductID(),stock);
    }

    //Check if Stock is empty
    public boolean inStock(Product product){

        int value = products.get(product.getProductID());

        if(value>0){
            return true;
        }

        return false;
    }

    // Update the Stock in the Inventory
    public void reStock(Product product,int quantity){
        int value = products.get(product.getProductID());

        value+=quantity;

        products.replace(product.getProductID(),value);
    }

}
