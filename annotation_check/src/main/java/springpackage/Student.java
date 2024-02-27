package springpackage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Student {
	@Value("${student.id}")
	private int id;
	
	public Student(int id) {
		this.id=id;
	}
	public void display() {
		System.out.println("iam a student");
		System.out.println(id);
	}
}
