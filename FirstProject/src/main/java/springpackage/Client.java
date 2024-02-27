package springpackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		System.out.println("HELLO THIS IS JEGAN");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("NewFile.xml");
		Student student = (Student)applicationContext.getBean("student");
		String nameString = student.getNameString();
		System.out.println(nameString);
		}

}
