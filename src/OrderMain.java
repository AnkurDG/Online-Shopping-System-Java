import java.util.ArrayList;

class Order{
    private Customer customer;
    private ArrayList<Product> products = new ArrayList<>();
    private double totalCost;
    private Payment payment;
    private Shipping shipping;


    //Constructor
    public Order(Customer customer,ArrayList<Product> products,double totalCost,Payment payment,Shipping shipping){
        this.customer = customer;
        this.products = products;
        this.totalCost = totalCost;
        this.payment = payment;
        this.shipping = shipping;
    }

    // getters and setters

    Customer getCustomer() { return customer; }

    ArrayList<Product> getProducts() { return products; }

    double getTotalCost() { return totalCost; }

    Payment getPayment() { return payment; }

    Shipping getShipping() { return shipping; }

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

        return customer.equals(order.customer) &&
                products.equals(order.products) &&
                Double.compare(totalCost, order.totalCost) == 0;
    }
}

public class OrderMain {
    public static void main(String[] args){
        Customer c1 = new Customer("Ankur","Solapur","ankur@gmail.com");
        Customer c2 = new Customer("Kranti","Solapur","ankur@gmail.com");
        ArrayList<Product> p1 = new ArrayList<>();
        Product p2 = new Product("Ankur","Solapur",20.9,1);
        Product p4 = new Product("Ankur","Solapur",20.9,1);

        p1.add(p2);
        p1.add(p4);

        Payment p3 = new Payment();
        Shipping s = new Shipping();

        Order o = new Order(c1,p1,100.0,p3,s);
        Order o2 = new Order(c2,p1,100.0,p3,s);

        System.out.println(o.equals(o2));
    }
}
