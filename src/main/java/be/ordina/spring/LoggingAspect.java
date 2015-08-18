package be.ordina.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Pointcut("execution(* * printEmployeeName())")
	public void allPrintEmployeeNames() {}
	
	@Before("target(be.ordina.spring.EmployeeService)")
	public void logPrintEmployeeName() {
		System.out.println("Before printing...");
	}
}
