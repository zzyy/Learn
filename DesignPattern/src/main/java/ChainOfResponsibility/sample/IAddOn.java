package ChainOfResponsibility.sample;

public interface IAddOn {
	
	public IHandler apply(IHandler base);
}
