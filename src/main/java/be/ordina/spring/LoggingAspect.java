package be.ordina.spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Pointcut("target(be.ordina.spring.EmployeeService)")
	public void allPrintEmployeeNames() {}
	
	@Around("allPrintEmployeeNames()")
	public void logPrintEmployeeName(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("Before printing...");
		try {
			jp.proceed();
		} catch (Throwable e) {
			System.out.println("Exception was thrown");
			throw e;
		}
		System.out.println("After printing...");
	}
	
	@AfterThrowing(pointcut = "allPrintEmployeeNames()", throwing = "e")
	public void doSomethingWithException(JoinPoint jp, Throwable e) {
		System.err.println("Exception that was thrown is:");
	}
}
