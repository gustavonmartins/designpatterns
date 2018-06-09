package observer;

public interface Publisher{
	public void registerSubscriber(Subscriber subscriber);
	public void unregisterSubscriber(Subscriber subscriber);
	public void updateAllSubscribers();
}

