package learn.aop;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class AdviceSample implements MethodBeforeAdvice, AfterReturningAdvice,
		MethodInterceptor, ThrowsAdvice {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		// TODO Auto-generated method stub

	}

	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		
	}
	
	

}
