package springpackage;

import org.springframework.beans.factory.annotation.Autowired;

public class Machine {
	
	private String name;
	private int price;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void display() {
		System.out.println("Name:"+name+"price:"+price);
	}
	
}
