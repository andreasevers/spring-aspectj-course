package be.ordina.spring;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	public void printEmployeeName() {
		Employee employee = new Employee();
		employee.setName("Andreas");
		System.out.println("Printing employee with name: " + employee.getName());
	}

	
}
