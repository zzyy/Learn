package ChainOfResponsibility;

import ChainOfResponsibility.demo.ConcreteHandlerA;
import ChainOfResponsibility.demo.ConcreteHandlerB;
import ChainOfResponsibility.demo.Handler;
import ChainOfResponsibility.demo.HandlerChain;

public class Client {

	public static void main(String[] args) {
		Handler handler = new HandlerChain();

		handler.handRequest(50);
	}
}
