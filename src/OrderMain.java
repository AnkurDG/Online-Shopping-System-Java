import java.util.ArrayList;
import java.util.UUID;

class Order{
    private UUID orderID;
    private Customer customer;
    private ArrayList<Product> products = new ArrayList<>();
    private double totalCost;
    private Payment payment;
    private Shipping shipping;


    //Constructor
    public Order(Customer customer,ArrayList<Product> products,double totalCost,Payment payment,Shipping shipping){
        this.orderID = UUID.randomUUID();
        this.customer = customer;
        this.products = products;
        this.totalCost = totalCost;
        this.payment = payment;
        this.shipping = shipping;
    }

    // getters and setters
    public UUID getOrderID(){return orderID;}
    public Customer getCustomer() { return customer; }

    public ArrayList<Product> getProducts() { return products; }

    double getTotalCost() { return totalCost; }

    public Payment getPayment() { return payment; }

    public Shipping getShipping() { return shipping; }

    void setCustomer(Customer customer) { this.customer = customer; }

    void setProducts(ArrayList<Product> products) { this.products = products; }

    void setTotalCost(double totalCost) { this.totalCost = totalCost; }

    void setPayment(Payment payment) { this.payment = payment; }

    void setShipping(Shipping shipping) { this.shipping = shipping; }


    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Order order = (Order) obj;

        return orderID.equals(order.orderID);
    }

}
