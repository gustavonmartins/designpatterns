package observer;

public class ObserverTest {

	public static void main(String[] args) {
		HUD hud1 = new HUD("Taskbar");
		HUD hud2 = new HUD("TeleHUD");
		
		PlayerHealth p1 = new PlayerHealth("Joe");
		PlayerHealth p2 = new PlayerHealth("Paul");
		
		System.out.println("Starting...");
		
		p1.registerSubscriber(hud1);
		p2.registerSubscriber(hud2);
			
		p1.setHealth(100);
		p2.setHealth(-20);
			
		p1.setHealth(1000);
		p2.setHealth(34);
		
		p1.unregisterSubscriber(hud1);
		
		p1.setHealth(1001);
		p2.setHealth(341);
		p2.unregisterSubscriber(hud2);
		p1.setHealth(1002);
		p2.setHealth(342);
		p1.unregisterSubscriber(hud1);
		p2.unregisterSubscriber(hud2);
		p1.setHealth(1003);
		p2.setHealth(344);

	}

}
