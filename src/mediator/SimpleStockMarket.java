package mediator;

import java.util.ArrayList;

import mediator.interfaces.basicimplementation.SimpleMediator;
import mediator.interfaces.raw.StockMarket;
import mediator.interfaces.raw.level0.Mediator;
import mediator.interfaces.raw.level0.Participant;

public class SimpleStockMarket implements StockMarket {
	private Mediator mediatorComponent;
	private String name;
	private ArrayList<Offer> offersList;
	
	public SimpleStockMarket(String name) {
		this.name=name;
		this.mediatorComponent=new SimpleMediator(this.name);
		this.offersList=new ArrayList<Offer>();
	}



	@Override
	public void putOfferFrom(Offer newOffer) {
		boolean match=false;
		for (Offer current:offersList) {
			if ((current.stockName==newOffer.stockName) 
					&& (current.amount==newOffer.amount) 
					&& (current.type != newOffer.type)
					) {
				System.out.format("\nMatch for %s",current.stockName);
				match=true;
				offersList.remove(current);
				
			}
		}
		if (!match) {
			offersList.add(newOffer);
			System.out.println("\nNo match, adding to backlog");
		}
		
	}

	@Override
	public void processOffers() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public int register(Participant newParticipant) {return mediatorComponent.register(newParticipant);}

	@Override
	public void unregister(Participant removeParticipant) {mediatorComponent.unregister(removeParticipant);}

	@Override
	public String getMediatorName() {return mediatorComponent.getMediatorName();}



	@Override
	public void showStandingOffers() {
		System.out.println("Standing offers:");
		offersList.forEach(o->System.out.format("%s %s %d units from %s\n", o.stockName,o.type,o.amount,o.fromParticipant));
		
	}

}
