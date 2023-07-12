package duke.choice;

public class Customer {
    private String name;
    private String size;

    public void setSize(String newSize) {
        this.size = newSize;
    }
    public void setSize(int measurement) {
        switch (measurement) {
            case 1, 2, 3:
                this.size = "S";
                break;
            case 4, 5, 6:
                this.size = "M";
                break;
            case 7, 8, 9:
                this.name = "L";
                break;
            default:
                this.size = "X";
                break;
        }
    }
    public String getSize() {
        return size;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public String getName() {
        return name;
    }
}