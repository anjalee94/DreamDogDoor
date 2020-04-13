package dream.door;

public class DogDoorSimulator {
	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		door.addAllowedBarks(new Bark ("Woof"));
		door.addAllowedBarks(new Bark ("Rawlf"));
		door.addAllowedBarks(new Bark("Roulf"));
		door.addAllowedBarks(new Bark("Bhow"));
		
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);
		System.out.println("Fido barks to go outside.....");
		//remote.pressButton();
		recognizer.recognize(new Bark ("Roulf"));
		System.out.println("\nFido has gone outside.....");
		System.out.println("\nwhen Fido is doing his work...");
		try {
			Thread.currentThread().sleep(10000);
		}catch(InterruptedException e) {}
		System.out.println("...but he is stuck Outside.");
		Bark smallDogBark = new Bark("Yip");
		System.out.println("A small Dog Barking..");
		recognizer.recognize(smallDogBark);
		try {
			Thread.currentThread().sleep(1000);
		}catch(InterruptedException e) {}
		System.out.println("\nFido starts barking...");
		//System.out.println("So Gina grab the remote control..");
		//remote.pressButton();
		recognizer.recognize(new Bark("Rawlf"));	
		System.out.println("\nFido's back inside...");
	}
}