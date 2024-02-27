package SpringPackage;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("HELLO WORLD");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
		context.registerShutdownHook();
		StudentDAO dao = (StudentDAO) context.getBean("studentdao");
		dao.selectAllRows();
		dao.deleteStudentRecord(3);
		dao.selectAllRows();	
		
		
	}
}
