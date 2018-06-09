package mediator.interfaces.raw;

import mediator.Offer;
import mediator.interfaces.raw.level0.Mediator;

public interface StockMarket extends Mediator {
	public void putOfferFrom(Offer newOffer);
	public void processOffers();
	public void showStandingOffers();

}
