package ChainOfResponsibility.demo;

public class ConcreteHandlerB extends Handler {

	@Override
	public void handRequest(int i) {
		if(i > 20){
			System.out.println("i>20");
		}
		
		if(next != null)
			next.handRequest(i);
	}

}
