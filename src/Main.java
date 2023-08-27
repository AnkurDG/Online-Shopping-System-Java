

public class Main {
    public static void main(String[] args) {

        //Create a new product
       Product p1 = new Product("iPhone", "New iPhone", 999.99, 10);

       //Create a new Inventory
        Inventory inventory = new Inventory();

        // Add the product to the inventory
        inventory.addProduct(p1, 10);

        // Create a new customer
        Customer c1 = new Customer("John Smith", "123 Main St", "johnsmith@email.com");

        // Create a new shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add the product to the cart
        cart.addProduct(p1);

        // Check if the product is in stock
        if (inventory.inStock(p1)) {
            System.out.println("Product is in stock");
        } else {
            System.out.println("Product is out of stock");
        }

        // Print the total cost of items in the cart
        System.out.println("Total cost: Rs "+cart.totalCost());

        // Create a new payment
        Payment payment = new Payment(cart.totalCost(), "Credit Card");

        // Print the payment details
        System.out.println("Payment amount: Rs "+payment.getAmount());
        System.out.println("Payment method: "+payment.getPaymentMethod());




    }
}