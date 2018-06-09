package mediator;

import mediator.interfaces.basicimplementation.SimpleParticipant;
import mediator.interfaces.raw.Broker;
import mediator.interfaces.raw.StockMarket;
import mediator.interfaces.raw.level0.Mediator;
import mediator.interfaces.raw.level0.Participant;

public class SimpleBroker implements Broker {
	private Participant participantComponent;
	private String name;
	
	public SimpleBroker(String name) {
		this.name=name;
		participantComponent=new SimpleParticipant(this.name);
	}

	@Override
	public void createOffer(Offer newOffer) {
		StockMarket mediator=(StockMarket) participantComponent.getMediator();
		mediator.putOfferFrom(newOffer);
	}
	
	@Override
	public void registerOn(Mediator mediator) {participantComponent.registerOn(mediator);}

	@Override
	public void unregister() {participantComponent.unregister();}

	@Override
	public String getParticipantName() {return participantComponent.getParticipantName();}

	@Override
	public Mediator getMediator() {return participantComponent.getMediator();}

}
