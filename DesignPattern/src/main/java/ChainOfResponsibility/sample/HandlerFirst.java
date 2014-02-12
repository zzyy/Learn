package ChainOfResponsibility.sample;

public class HandlerFirst extends HandlerBase {

	public void evaluate() {
		System.out.println("-HandlerFirst");
		if(next != null){
			next.evaluate();
		}
		System.out.println("-HandlerFirst --after");
	}

}
