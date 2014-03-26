package learn.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;


public class XmlAspectSample {

	public void doBefore(JoinPoint jp) {
		System.out.println(jp.toString());
		System.out.println("***XmlAspectSample.before");
	}
	
	public void doAfter() {
		System.out.println("***XmlAspectSample.after");
	}
	
	public void doAround(ProceedingJoinPoint pjp) {
		System.out.println("***XmlAspectSample.Before_Around");
		try {
			pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("***XmlAspectSample.After_Around");
	}
	
	public void doThrow() {
		System.out.println("***XmlAspectSample.Throw");
	}
}
