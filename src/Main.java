import Model.Order;
import Model.Tshirt;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //describing the product
        Tshirt t1= new Tshirt("Gorkhali Batman",572,1235,"Karuna","Description: Graphic text: You either die a hero or live long enough to see yourself be a villian","XL, Medium, Large" );
        Tshirt t2= new Tshirt("Nepali Superhero",576,1212,"Melaaine","Sved the day","XL,Medium,Small");
        Tshirt t3= new Tshirt("Asian Hellokitty",11,3449,"Xaya","HelloKitty de baobao","XXS,XS,S");
        ArrayList<Tshirt> a=new ArrayList<Tshirt>();

        a.add(t1);
        a.add(t2);
        a.add(t3);
        //multiple items to be stored in one string
        String[] ic1 = {"572", "11"};
        int[] p1 = {1235,3449};
        String[] ic2 = {"576", "11"};
        int[] p2 = {1212,3449};
//Order description
        Order o1=new Order("Kiran","9899217392",ic1,p1,a);
        Order o2= new Order("milan","875994789",ic2,p2,a);
        //printing the final order
        o1.information();
        o2.information();





    }
}
