package com.tcs.aspect;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
  
	final static Logger logger = Logger.getLogger(LoggingAspect.class);
	
	@Before("execution(* com.tcs..*(..))")
	public void logBefore(JoinPoint joinPoint) {
		logger.info("Entered into:"+joinPoint.getSignature().getDeclaringTypeName() +" ;;" + joinPoint.getSignature().getName());
	}
	@Pointcut("execution(public* com.tcs..*(..))")
	public void logAfter(JoinPoint joinPoint){
		logger.info("Exit into : " + joinPoint.getSignature().getDeclaringTypeName() + " :: " + joinPoint.getSignature().getName());
	}
}
