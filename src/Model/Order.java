package Model;

import java.util.ArrayList;

public class Order {
    String name;
    String Phone_Number;
    String[] item_code;
    int[] price;
    ArrayList<Tshirt> tshirt;
//Constructor
    //Getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        Phone_Number = phone_Number;
    }

    public String[] getItem_code() {
        return item_code;
    }

    public void setItem_code(String[] item_code) {
        this.item_code = item_code;
    }

    public int[] getPrice() {
        return price;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }

    public ArrayList<Tshirt> getTshirt() {
        return tshirt;
    }

    public void setTshirt(ArrayList<Tshirt> tshirt) {
        this.tshirt = tshirt;
    }

    public Order(String name, String phone_Number, String[] item_code, int[] price, ArrayList<Tshirt> tshirt) {
        this.name = name;
        Phone_Number = phone_Number;
        this.item_code = item_code;
        this.price = price;
        this.tshirt = tshirt;
    }
    //printing of the orderwith bill and vat
    public void information() {
        System.out.println("Name:" + " " + "Phone Number:" + " " + "items" + " " + "price:");
        double tp = 0;
        for (Tshirt i : tshirt) {
            tp = tp + i.getPrice();

            System.out.println(i.getPrice() + " " + i.getProduct_code() + " " + i.getName() + " " + i.getBrand() + " " + i.getDescription() + " " + i.getAvailable_Sizes());
        }
        double vat = tp * 0.13;
        double finalTotalCost = tp + vat;
        System.out.println("Bill");
        System.out.println("Total Cost: " + tp);
        System.out.println("VAT (13%): " + vat);
        System.out.println("Final Total Cost: cost" + finalTotalCost);

    }
}
