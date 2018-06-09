package mediator;

public class Offer {
	public String type;
	public int amount;
	public String stockName;
	public String fromParticipant;
	
	public Offer(String type, int amount, String stockName, String fromParticipant) {
		this.type=type;
		this.amount=amount;
		this.stockName=stockName;
		this.fromParticipant=fromParticipant;
		
	}

}
