package observer;

public class PlayerHealth implements Publisher {
	private int health=0;
	private String name;
	private SimplePublisher publisherImplementation;
	
	public PlayerHealth(String name) {
		this.name=name;
		this.publisherImplementation=new SimplePublisher(this);
	}
	
	@Override
	public void registerSubscriber(Subscriber observer) {
		publisherImplementation.registerSubscriber(observer);

	}

	@Override
	public void unregisterSubscriber(Subscriber observer) {
		publisherImplementation.unregisterSubscriber(observer);

	}

	@Override
	public void updateAllSubscribers() {
		publisherImplementation.updateAllSubscribers();
	}
	
	public void setHealth(int newHealth) {
		health=(newHealth>=0) ? newHealth : 0;
		updateAllSubscribers();
	}
	
	public int getHealth() {
		return health;
	}
	public String getName() {
		return name;
	}

}
