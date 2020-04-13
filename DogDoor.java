package dream.door;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
public class DogDoor {
	private boolean open;
	//private Bark allowedBark;
	private Bark[] allowedBarks;
	ArrayList<Bark> container = new ArrayList<Bark>();
	
	public DogDoor() {
		this.open=false;
	}
	
	public void open() {
		System.out.println("The DogDoor Opens.");	
		open =true;
		
		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				close();
				timer.cancel();
			}
		},5000);
	}
	public void close() {
		System.out.println("The DogDoor Closed.");	
		open=false;
	}
	public boolean isOpen() {
		return open;
	}
//	public void addAllowedBark(Bark bark) {
//		this.allowedBark = bark;
//	}
//
//	public Bark getAllowedBark() {
//		return allowedBark;
//	}
	public void addAllowedBarks(Bark bark) {
		this.container.add(bark);
	}

	public ArrayList<Bark> getAllowedBarks() {
		return container;
	}
}
