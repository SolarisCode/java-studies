package duke.choice;

public class Clothing {
    
    private double price;
    private String size = "M";
    final double MIN_PRICE = 10.0;
    final double TAX = 0.2;
    private String description;

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
}