package ChainOfResponsibility.sample;

public class HandlerSecond extends HandlerBase {

	public void evaluate() {
		System.out.println("-HandlerSecond");
		if(next != null){
			next.evaluate();
		}
		System.out.println("-HandlerSecond --after");
	}

}
