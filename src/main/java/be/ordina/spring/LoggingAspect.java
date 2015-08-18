package be.ordina.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Pointcut("execution(public void printEmployeeName())")
	public void allPrintEmployeeNames() {}
	
	@Before("allPrintEmployeeNames()")
	public void logPrintEmployeeName() {
		System.out.println("Before printing...");
	}
}
