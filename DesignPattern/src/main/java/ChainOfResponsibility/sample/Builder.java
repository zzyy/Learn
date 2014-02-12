package ChainOfResponsibility.sample;

import org.junit.Test;

public class Builder {
	@Test
	public void test1(){
		HandlerBase handler1 = new HandlerFirst();
		HandlerBase handler2 =  new HandlerSecond();
		
		IAddOn addOn = new AddOnImpl();
		HandlerBase handlerAddOn = new HandlerAddOn(addOn);
		
		handler1.setNext(handlerAddOn);
		handlerAddOn.setNext(handler2);
		
		
		handler1.evaluate();
	}
}
