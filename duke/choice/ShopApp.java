package duke.choice;

public class ShopApp {

    public static void main(String[] args) {
        double total;
        System.out.println("Welcome to Duke Choice Shop!");
        System.out.println("*--------------------------*");
        Customer c1 = new Customer();
        c1.setName("Pinky");
        c1.setSize(3);
        System.out.println("Hello, " + c1.getName());
        System.out.println("Customre Size: " + c1.getSize());

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        item3.setDescription("Green Scarf");
        item3.setPrice(5);
        item3.setSize("S");

        item4.setDescription("Blue T-Shirt");
        item4.setPrice(10.5);
        item4.setSize("S");

        Clothing[] items = {item1, item2, item3, item4};
        total = 0;
        for (Clothing item: items) {
            if (item.fit(c1)) {
                System.out.println(item.getDescription() + ", " + item.getPrice() + ", " + item.getSize());
                total += item.getPrice();
            }
            if (total > 15) {break;};
        }
        System.out.println("Total Amount to PAy: " + total);
        // if (c1.getName().equalsIgnoreCase("pinky")) {
        //     System.out.println("Hello, " + c1.getName().concat(" Butler.").toUpperCase() + c1.getName().indexOf("i"));
        //     System.out.println(c1.getName().toLowerCase());
        // } else {
        //     System.out.println("     Hello, Valued customer!    ".trim() + c1.getName().length());
        // }
    }
}