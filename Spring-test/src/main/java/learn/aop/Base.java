package learn.aop;

import org.springframework.stereotype.Component;

@Component("base")
public class Base {

	public void run(){
		StackTraceElement stackTrace = Thread.currentThread().getStackTrace()[1];
		System.out.println(stackTrace.getClassName()+"-"+stackTrace.getMethodName()+"-"+stackTrace.getLineNumber());
	}
}
