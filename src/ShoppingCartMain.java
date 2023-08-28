import java.util.ArrayList;
import java.util.*;
import java.util.TreeSet;

class ShoppingCart {
    //attributes
    private HashMap<UUID, Product> products = new HashMap<>();
    //constructor
    public ShoppingCart(){}

    //add product to cart
    public void addProduct(Product product){
        products.put(product.getProductID(),product);
    }

    //remove a product from cart
    public void removeProduct(Product product){
        products.remove(product.getProductID());
    }

    // gives the size of the shopping cart
    public int returnSize(){
        return products.size();
    }

    public double totalCost(){
        double total=0;

        for (Map.Entry<UUID, Product> entry : products.entrySet()) {
            UUID productId = entry.getKey();
            Product product = entry.getValue();
            total+= product.getPrice();

        }
       return total;
    }



}
