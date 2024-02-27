package springpackage;

public class Food {
	private int quantity;
	private String item;
	
	public Food(int quantity, String item) {
		this.quantity = quantity;
		this.item = item;
	}


	public int getQuantity() {
		return quantity;
	}

	public String getItem() {
		return item;
	}
	
	public void decrement() {
		this.quantity-=1;
	}

}
