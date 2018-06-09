package mediator.interfaces.raw.level0;

public interface Mediator {
	public int register(Participant newParticipant);
	public void unregister(Participant removeParticipant);
	
	public String getMediatorName();

}
