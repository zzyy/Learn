package ChainOfResponsibility.sample;

public class AddOnImpl implements IAddOn {

	public IHandler apply(final IHandler base) {
		return new IHandler() {
			public void evaluate() {
				System.out.println("-AddOnImpl");
				base.evaluate();
				System.out.println("-AddOnImpl --after");
			}
		};
	}

}
