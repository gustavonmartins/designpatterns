package mediator.interfaces.basicimplementation;

import mediator.interfaces.raw.level0.Mediator;
import mediator.interfaces.raw.level0.Participant;

public class SimpleParticipant implements Participant {
	public int participantID;
	private Mediator mediator;
	private String name;
	
	public SimpleParticipant(String name) {this.name=name;}

	@Override
	public void registerOn(Mediator mediator) {
		participantID=mediator.register(this);
		this.mediator=mediator;
		System.out.format("\n%s sucessfuly registered at %s",name,this.mediator);
		
	}

	

	@Override
	public void unregister() {
		mediator.unregister(this);
		this.mediator=null;
		
	}

	@Override
	public Mediator getMediator() {
		return this.mediator;
	}

}
