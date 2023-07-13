package duke.choice;
import java.util.Arrays;

public class ShopApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Duke Choice Shop!");
        System.out.println("*--------------------------*");
        Customer c1 = new Customer("Pinky", 3);
        // c1.setName("Pinky");
        // c1.setSize("S");
        System.out.println("Hello, " + c1.getName());
        System.out.println("Customre Size: " + c1.getSize());
        System.out.println("Minimum Price: " + Clothing.MIN_PRICE + "\n" + "Tax Rate: " + Clothing.TAX);

        Clothing item1 = new Clothing("Blue Jacket", 20.9);
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 5, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");

        // item1.setDescription("Blue Jacket");
        // item1.setPrice(20.9);

        // item2.setDescription("Orange T-Shirt");
        // item2.setPrice(10.5);
        // item2.setSize("S");

        // item3.setDescription("Green Scarf");
        // item3.setPrice(5);
        // item3.setSize("S");

        // item4.setDescription("Blue T-Shirt");
        // item4.setPrice(10.5);
        // item4.setSize("S");
        // System.out.println(item1.getDescription() + ", " + item1.getPrice() + ", " + item1.getSize());

        System.out.println(item1);
        Clothing[] items = {item2, item3, item4};
        Arrays.sort(items);
        c1.addItems(items);
        for (Clothing item: c1.getItems()) {
            if (item.fit(c1)) {
                // System.out.println(item.getDescription() + ", " + item.getPrice() + ", " + item.getSize());
                System.out.println(item);
            }
        }
        System.out.println("Total Amount to Pay: " + c1.getTotalClothingCost());
        System.out.println("Avarge Price: " + c1.calcAvaragePrice());
        // if (c1.getName().equalsIgnoreCase("pinky")) {
        //     System.out.println("Hello, " + c1.getName().concat(" Butler.").toUpperCase() + c1.getName().indexOf("i"));
        //     System.out.println(c1.getName().toLowerCase());
        // } else {
        //     System.out.println("     Hello, Valued customer!    ".trim() + c1.getName().length());
        // }
    }
}