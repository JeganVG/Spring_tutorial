package springpackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Cheetah implements Animal{
	private int noOfLegs;
	private int speed;
	
	@Autowired
	@Qualifier("redmeat")
	private Food food;
	
	public Cheetah(int noOfLegs, int speed) {
		this.noOfLegs = noOfLegs;
		this.speed = speed;
	}
	
	public void move() {
		System.out.println("CHEETAH IS MOVING ....");
	}
	
	public void eat() {
		System.out.println("QUANTITY IS :"+food.getQuantity());
		System.out.println("CHEETAH IS EATING ....");
		food.decrement();
		System.out.println("AFTER EATING QUANTITY IS :"+food.getQuantity());
	}
	public void speak() {
		System.out.println("GRRRRR ....");
	}
	
	
}
