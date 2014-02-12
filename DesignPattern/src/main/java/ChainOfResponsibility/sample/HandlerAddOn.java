package ChainOfResponsibility.sample;

public class HandlerAddOn extends HandlerBase {

	private IAddOn addOn;
	
	public HandlerAddOn(IAddOn addOn) {
		this.addOn = addOn;
	}


	public void evaluate() {
		
		addOn.apply(next).evaluate();
	}

}
