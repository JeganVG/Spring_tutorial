package springpackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SystemManager {
	private Machine machine;
	
	@Autowired
	@Qualifier("chainsaw")
	public void setMachine(Machine machine) {
		this.machine = machine;
	}
	
	public void display() {
		System.out.println("THE MACHINE IS RUNNING AND NAME IS:"+machine.getName());
	}
}
