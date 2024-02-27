package springpackage;

import java.security.PublicKey;

import javax.sound.midi.MidiChannel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("NewFile.xml");
		System.out.println("HELLO");
		
//		Student student = (Student) app.getBean("student");
//		student.display();
		
		Student student = (Student) app.getBean("student1");
		student.display();
		
		Student student2 = (Student) app.getBean("student2");
		student2.display();
		
	}

}
