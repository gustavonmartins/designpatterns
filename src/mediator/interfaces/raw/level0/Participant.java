package mediator.interfaces.raw.level0;

public interface Participant {
	public void registerOn(Mediator mediator);
	public void unregister();
	
	public Mediator getMediator();

}
