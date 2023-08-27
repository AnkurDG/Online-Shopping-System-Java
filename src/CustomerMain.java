

class Customer{
    private String name;
    private String address;
    private String email;

    // Constructor
    public Customer(){
        name="";
        address="";
        email="";
    }

    public Customer(String name,String address,String email){
        this.name=name;
        this.address=address;
        this.email=email;
    }

    //getter
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return email;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Customer otherCustomer = (Customer) obj;
        return name.equals(otherCustomer.name) &&
                address.equals(otherCustomer.address) &&
                email.equals(otherCustomer.email);
    }


}

public class CustomerMain {

    public static void main(String[] args){

        Customer c1 = new Customer("Ankur","Solapur","ankur@gmail.com");
        Customer c2 = new Customer("Kranti","Gangakhed","kranti@gmail.com");


        System.out.println(c1.equals(c2));
    }
}
