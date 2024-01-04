package Model;

import java.util.ArrayList;

public class Tshirt {

        //. Fields to represent the name, product code, price, brand,
// description, and array of available sizes of t-shirts.
        String name;
        int product_code;
        int price;
        String brand;
        String description;
        String Available_Sizes;
// Constructor
    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProduct_code() {
        return product_code;
    }

    public void setProduct_code(int product_code) {
        this.product_code = product_code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvailable_Sizes() {
        return Available_Sizes;
    }

    public void setAvailable_Sizes(String available_Sizes) {
        Available_Sizes = available_Sizes;
    }

    public Tshirt(String name, int product_code, int price, String brand, String description, String available_Sizes) {
        this.name = name;
        this.product_code = product_code;
        this.price = price;
        this.brand = brand;
        this.description = description;
        Available_Sizes = available_Sizes;
    }
}




