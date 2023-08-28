import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

class Admin{
    private Inventory inventory;
    private HashMap<UUID, Product> products = new HashMap<>();
    private HashMap<UUID,Integer> stockLevel = new HashMap<>();
    private HashMap<UUID, Customer> customers = new HashMap<>();
    private HashMap<UUID,Order> orders  = new HashMap<>();


    // Constructor
    public Admin() {}
    // methods for adding and updating products

    void addProduct(Product product) { products.put(product.getProductID(),product); }

    void updateProduct(Product product) {
        products.put(product.getProductID(),product);
    }

    // Methods for managing stock level
    public void updateStockLevel(Product product, int stockLevel) {
      Product p = products.get(product.getProductID());
      p.setStockLevel(stockLevel);
    }

    // Method for adding an order
    void addOrder(Order order) {
        orders.put(order.getOrderID(),order);
    }

    // Method for updating an order
    void updateOrder(Order orderToUpdate) {
        orders.put(orderToUpdate.getOrderID(),orderToUpdate);
    }



    // Method for adding a customer
    void addCustomer(Customer customer) {
        customers.put(customer.getCustomerID(),customer);
    }

    // Method for updating a customer
    void updateCustomer(Customer customerToUpdate) {
        customers.put(customerToUpdate.getCustomerID(),customerToUpdate);
    }
}
