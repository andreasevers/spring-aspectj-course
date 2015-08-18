package be.ordina.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@ComponentScan("be.ordina.spring")
public class Application {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
		employeeService.printEmployeeName();
		context.close();
	}
	
}
