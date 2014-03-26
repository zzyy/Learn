package learn.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnotationAspectSample {
	
//	@Aspect("execution (* learn.aop.*.*(..))")
//	public void pointCut(){}

	@Before("execution (* learn.aop.*.*(..))")
	public void doBefore(){
		System.out.println("AnnotationAspectSample.before()");
	}
}
