import java.util.ArrayList;

class Admin{
    private Inventory inventory;
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Order> orders  = new ArrayList<>();

    // Constructor
    public Admin() {}
    // methods for adding and updating products

    void addProduct(Product product) { products.add(product); }

    void updateProduct(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).equals(product)) {
                products.set(i, product);
                break;
            }
        }
    }

    // Methods for managing stock level
    public void updateStockLevel(Product product, int stockLevel) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) == product) {
                products.get(i).setStockLevel(stockLevel);
                break;
            }
        }
    }

    // Method for adding an order
    void addOrder(Order order) {
        orders.add(order);
    }

    // Method for updating an order
    void updateOrder(Order orderToUpdate) {
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            if (order.equals(orderToUpdate)) {
                // Update the order
                orders.set(i, orderToUpdate);
                break;
            }
        }
    }



    // Method for adding a customer
    void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Method for updating a customer
    void updateCustomer(Customer customerToUpdate) {
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if (customer.equals(customerToUpdate)) {
                // Update the customer
                customers.set(i, customerToUpdate);
                break;
            }
        }
    }

}

public class AdminMain {
}
