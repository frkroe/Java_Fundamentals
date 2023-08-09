package com.frkroe.model;
import java.util.UUID;

public class Product {

    // Create private fields. A private field can only be accessed by the class itself.
    private String name;
    private Float price;
    private UUID productID;

    // Create a constructor that takes (two) parameters. A constructor is a special method that is called when an object is created.
    public Product(String name, Float price) {
        this.productID = UUID.randomUUID();
        this.name = name;
        this.price = price;
    }

    // Create public methods. A public method can be accessed by any class.
    public String getName() {
        return "Price = " + name;
    }

    public String getPrice() {

        return "Price = " + price.toString();
    }

    public String getProductID() {
        return "Product ID = " + productID.toString();
    }

    public String toJson() {
        return "{\n" +
                "  \"productID\": \"" + productID + ",\n" +
                "  \"name\": \"" + name + "\",\n" +
                "  \"price\": " + price + "\"\n" +
                "}";
    }

}
