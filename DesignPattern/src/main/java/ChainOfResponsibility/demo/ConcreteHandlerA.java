package ChainOfResponsibility.demo;

public class ConcreteHandlerA extends Handler {
	@Override
	public void handRequest(int i) {
		if(i > 10){
			System.out.println("i>10");
		}
		
		if(next != null)
			next.handRequest(i);
	}
}
