package duke.choice;

public class Customer {
	
	private String name;
	private String size;
	private Clothing[] items;

	public Customer() {}
	public Customer(String name, int measurement) {
		this.name = name;
		this.setSize(measurement);
	}
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
				this.size = "XL";
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
	public void addItems(Clothing[] newItem) {
		items = newItem;
	}
	public Clothing[] getItems() {
		return items;
	}
	public double getTotalClothingCost() {
		double totalCost = 0.0;
		for (Clothing item: items) {
			totalCost += item.getPrice();
		}
		return totalCost;
	}
	public int calcAvaragePrice() {
		int avaragePrice = 0;
		int count = 0;
		for (Clothing item: this.getItems()) {
			avaragePrice += item.getPrice();
			if (item.getSize().equals("L")) {
				count++;
			}
		}
		try {
		   avaragePrice = (count == 0) ? 0: avaragePrice / count;
			// avaragePrice = avaragePrice / count;
		   return avaragePrice;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Division on Zero is not allowed");
		}
		return avaragePrice;
	}
}