package springpackage;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("${student.nameString}")
	private String nameString;
	
	@Value("${student.id}")
	private int id;
	
	public String getNameString() {
		return nameString;
	}
	
	public int getId() {
		return id;
	}
	
	
}
