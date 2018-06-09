package mediator;

public class Test {

	public static void main(String[] args) {
		SimpleStockMarket mkt = new SimpleStockMarket("NYSE");
		SimpleBroker b1 = new SimpleBroker("JP Morgan");
		SimpleBroker b2 = new SimpleBroker("Goldman Sachs");
		b1.registerOn(mkt);
		b2.registerOn(mkt);
		
		b1.createOffer(new Offer("sell",10,"AMZN",b1.getParticipantName()));
		b2.createOffer(new Offer("sell",100,"GGL",b2.getParticipantName()));
		
		
		b2.createOffer(new Offer("buy",10,"AMZN",b2.getParticipantName()));
		b2.createOffer(new Offer("buy",10,"AMZN",b2.getParticipantName()));
		
		mkt.showStandingOffers();
		b1.createOffer(new Offer("sell",100,"BBM",b1.getParticipantName()));
		mkt.showStandingOffers();

	}

}

