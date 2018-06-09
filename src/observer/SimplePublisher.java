package observer;

import java.util.ArrayList;

public class SimplePublisher implements Publisher {
	
	private ArrayList<Subscriber> observers;
	private Publisher address;
	
	public SimplePublisher(Publisher address) {
		this.observers = new ArrayList<Subscriber>();
		this.address=address;
	}

	@Override
	public void registerSubscriber(Subscriber observer) {
		observers.add(observer);
		
	}

	@Override
	public void unregisterSubscriber(Subscriber observer) {
		observers.remove(observer);
		
	}

	@Override
	public void updateAllSubscribers() {
		observers.forEach(obs -> obs.updateThisSubscriberFrom(address));
		
	}

}
