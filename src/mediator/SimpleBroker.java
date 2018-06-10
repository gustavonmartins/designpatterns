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
		if (mediator!=null) {mediator.putOfferFrom(newOffer);}
		else {System.out.println("Broker disconnected. Cannot perform action on Stock Market");;}
		
	}
	
	@Override
	public void registerOn(Mediator mediator) {participantComponent.registerOn(mediator);}

	@Override
	public void unregister() {participantComponent.unregister();}

	@Override
	public String getBrokerName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public Mediator getMediator() {return participantComponent.getMediator();}

}
