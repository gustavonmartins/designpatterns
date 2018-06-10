package mediator.interfaces.raw;

import mediator.Offer;
import mediator.interfaces.raw.level0.Participant;

public interface Broker extends Participant{
	public void createOffer(Offer newOffer);
	public String getBrokerName();

}
