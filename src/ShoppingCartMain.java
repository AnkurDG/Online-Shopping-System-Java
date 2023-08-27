import java.util.ArrayList;
import java.util.*;

class ShoppingCart{
    //attributes
    private ArrayList<Product> products = new ArrayList<>();

    //constructor
    public ShoppingCart(){}

    //add product to cart
    public void addProduct(Product product){
        products.add(product);
    }

    //remove a product from cart
    public void removeProduct(Product product){
        products.remove(product);
    }

    // gives the size of the shopping cart
    public int returnSize(){
        return products.size();
    }

    // this for Set Precision upto 4 decimals
//    Formatter fm=new Formatter();
    public double totalCost(){
        double total=0;

       for(Product it: products){
           total+=it.getPrice();
       }

//       fm.format("%.4f",total);

       return total;
    }


}


public class ShoppingCartMain {

    public static void main(String[] args){
        Product p1 = new Product("Ankur","Solapur",20.9,1);
        Product p2 = new Product("Atharv", "Solapur",100.9,1);

        ShoppingCart s = new ShoppingCart();
        s.addProduct(p1);
        s.addProduct(p2);

        System.out.println(s.returnSize());

//        s.removeProduct(p1);

        System.out.println(s.returnSize());


        System.out.println(s.totalCost());





    }
}
