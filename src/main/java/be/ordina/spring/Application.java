package be.ordina.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("be.ordina.spring")
public class Application {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
		employeeService.printEmployeeName();
		context.close();
	}
	
	@Bean
	public LoggingAspect logAspect() {
		return new LoggingAspect();
	}
	
}
