import java.util.UUID;

class Customer{
    private UUID customerID;
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
        this.customerID = UUID.randomUUID();
        this.name=name;
        this.address=address;
        this.email=email;
    }

    //getter
    public UUID getCustomerID(){return customerID;}
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
        return customerID.equals(otherCustomer.customerID);
    }


}

