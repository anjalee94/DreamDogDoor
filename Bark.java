package dream.door;

public class Bark {
	private String sound;
	private Bark allowedBarks;
	public Bark(String sound) {
		this.sound = sound;
	}
	public String getSound() {
		return sound;
	}
	public boolean equals(Bark bark) {
		if(bark instanceof Bark) {
			Bark otherbark = (Bark)bark;
			if(this.sound.equalsIgnoreCase(otherbark.sound)) {
				return true;
			}
		}
		return false;
	}
}