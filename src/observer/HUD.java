package observer;

public class HUD implements Subscriber {
	private String name;
	
	public HUD(String name) {
		this.name=name;
	}

	@Override
	public void updateThisSubscriberFrom(Publisher publisher) {
		String hudName = this.name;
		String pName=((PlayerHealth)publisher).getName();
		int health = ((PlayerHealth)publisher).getHealth();		
		System.out.format("HUD %s: Player %s health %d\n", hudName, pName, health);
		
	}

}
