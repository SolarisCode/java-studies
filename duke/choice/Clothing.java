package duke.choice;

public class Clothing implements Comparable<Clothing> {
    
    private double price;
    private String size = "M";
    private String description;
    
    public final static double MIN_PRICE = 10.0;
    public final static double TAX = 0.2;

    public Clothing() {}
    public Clothing(String description, double price) {
        this.description = description;
        this.setPrice(price);
    }
    public Clothing(String description, double price, String size) {
        this.description = description;
        this.setPrice(price);
        this.size = size;
    }
    public void setPrice(double newPrice) {
        this.price = (newPrice > MIN_PRICE) ? newPrice : MIN_PRICE;
    }
    public double getPrice() {
        return price + price * TAX;
    }
    public boolean fit(Customer cust) {
        return (size.equals(cust.getSize()));
    }
    public String getSize() {
        return size;
    }
    public void setSize(String newSize) {
        size = newSize;
    }
    public void setDescription(String newDes) {
        this.description = newDes;
    }
    public String getDescription() {
        return description;
    }
    @Override
    public String toString() {
        return (getDescription() + ", " + getPrice() + ", " + getSize());
    }
    @Override
    public int compareTo(Clothing other) {
        return this.description.compareTo(other.description);
    }
}