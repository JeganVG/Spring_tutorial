package springpackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("NewFile.xml");
		Employee emp = (Employee) app.getBean("employee1");
	    String string =  emp.toString();
	    System.out.println(string);
	    
	    Employee emp1 = (Employee) app.getBean("employee2");
	    String string1 =  emp1.toString();
	    System.out.println(string1);
	    
	    Employee emp2 = (Employee) app.getBean("employee3");
	    String string2 =  emp2.toString();
	    System.out.println(string2);
	    
	    SystemManager systemManger = (SystemManager) app.getBean("system");
	    systemManger.display();
	}
}
