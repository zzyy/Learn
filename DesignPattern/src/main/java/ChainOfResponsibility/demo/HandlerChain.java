package ChainOfResponsibility.demo;

public class HandlerChain extends Handler {

	@Override
	public void handRequest(int i) {
		Handler handler = new ConcreteHandlerA();
		handler.setNext(new ConcreteHandlerB()).setNext(new ConcreteHandlerA());
		handler.handRequest(i);
		
		if(next != null)
			next.handRequest(i);
	}

}
