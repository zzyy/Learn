package ChainOfResponsibility.demo;

public abstract class Handler {
	protected Handler next; 
	
	public abstract void handRequest(int i);

	public Handler setNext(Handler next) {
		this.next = next;
		return this.next;
	}
}
