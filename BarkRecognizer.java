package dream.door;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BarkRecognizer {
	
	private DogDoor door;
	
	public BarkRecognizer(DogDoor door) {
		this.door= door;
	}
	public void recognize(Bark bark) {
		System.out.println("BarkRecognizer: Heard a '" + bark.getSound()+ "'");
		ArrayList<Bark> allowedBarks = door.getAllowedBarks();
		for(Iterator i = allowedBarks.iterator(); i.hasNext();) {
			Bark allowedBark = (Bark) i.next();
			//if(door.allowedBark().equals(bark)) {
		if(allowedBark.equals(bark)) {
			door.open();
			return;
		}else {
			
		}
		}System.out.println("This dog is Not Allowed");
	}
}
