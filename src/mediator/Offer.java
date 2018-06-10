package mediator;

public class Offer {
	private String type;
	private int amount;
	private String stockName;
	private String fromParticipant;
	
	public Offer(String type, int amount, String stockName, String fromParticipant) {
		this.type=type;
		this.amount=amount;
		this.stockName=stockName;
		this.fromParticipant=fromParticipant;
		
	}

	public String getType() {return type;}
	public int getAmount() {return amount;}
	public String getStockName() {return stockName;}
	public String getFromParticipant() {return fromParticipant;}



}
