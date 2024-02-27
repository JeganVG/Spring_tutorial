package springpackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Competition {
	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("NewFile.xml");
		Animal animal1  = app.getBean("human", Animal.class);
		animal1.move();
		animal1.eat();
		animal1.speak();
		
		System.out.println("\n");
		Animal animal2  = app.getBean("cheetah", Animal.class);
		animal2.move();
		animal2.eat();
		animal2.speak();
		
	}
}
