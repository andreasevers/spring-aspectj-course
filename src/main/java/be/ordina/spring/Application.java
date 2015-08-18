package be.ordina.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext("be.ordina.spring");
		EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
		employeeService.printEmployeeName();
		context.close();
	}
	
}
