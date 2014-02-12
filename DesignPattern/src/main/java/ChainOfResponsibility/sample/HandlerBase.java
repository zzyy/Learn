package ChainOfResponsibility.sample;

public abstract class HandlerBase implements IHandler {
	
	protected HandlerBase next;

	public void setNext(HandlerBase next) {
		this.next = next;
	}

	public HandlerBase(HandlerBase next) {
		this.next = next;
	}

	public HandlerBase() {	}
}
