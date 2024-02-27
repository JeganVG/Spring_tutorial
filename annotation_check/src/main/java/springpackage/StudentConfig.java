package springpackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class StudentConfig {
	
	@Bean
	public Student student1() {
		Student student = new Student(1);
		return student;	
		}
	
	@Bean
	public Student student2() {
		Student student = new Student(2);
		return student;
	}
}
