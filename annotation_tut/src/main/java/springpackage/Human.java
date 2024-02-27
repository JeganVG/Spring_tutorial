package springpackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human implements Animal{
	private int noOfLegs;
	private int speed;
	
	@Autowired
	@Qualifier("redmeat")
	private Food food;
	
	@Autowired
	@Qualifier("painkiller")
	private Food food1;
	
	public Human(int noOfLegs, int speed) {
		this.noOfLegs = noOfLegs;
		this.speed = speed;
	}
	
	public void move() {
		System.out.println("HUMAN IS MOVING ....");
	}
	
	public void eat() {
		
		System.out.println("QUANTITY IS :"+food.getQuantity());
		System.out.println("HUMAN IS EATING ....");
		food.decrement();
		System.out.println("AFTER EATING QUANTITY IS :"+food.getQuantity());
		System.out.println("\n");
		System.out.println("OUCH HURTED. APPLYING PAINKILLER");
		System.out.println("PAIN KILLER QUANITY IS :"+food1.getQuantity());
		food1.decrement();
		System.out.println("AFTER EATING QUANTITY IS :"+food1.getQuantity());
	}
	
	public void speak() {
		System.out.println("AHHHHHH ....");
	}
}
