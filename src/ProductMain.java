
import java.util.UUID;

class Product {
    private UUID productID;
    private String name;
    private String description;
    private double price;
    private int stockLevel;

    // Constructor
    public Product(String name,String description,double price,int stockLevel){
        this.productID = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockLevel = stockLevel;


    }

    // Getters
    public UUID getProductID() { return productID;}
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
     public double getPrice(){
        return price;
    }
     public int getStockLevel(){
        return stockLevel;
    }

    //Setters


    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }


    // Comparing two products
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Product otherProduct = (Product) obj;
        return productID==(otherProduct.productID);
    }


}

