package learn.aop;

public class Base {

	public void run(){
		StackTraceElement stackTrace = Thread.currentThread().getStackTrace()[1];
		System.out.println(stackTrace.getClassName()+"-"+stackTrace.getMethodName()+"-"+stackTrace.getLineNumber());
	}
}
