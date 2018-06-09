package observer;

public interface Subscriber {
	public void updateThisSubscriberFrom(Publisher publisher);
}
