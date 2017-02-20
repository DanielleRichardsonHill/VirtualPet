import java.util.Random;

public class VirtualPet {

	Random random = new Random();
	// Attributes
	private int hunger = 0;
	private int sleepy = 0;
	private int dirty = 0;
	private int bored = 8;

	// get random method
	public int getRandom() {
		return random.nextInt(10); // random from 0-9 will be added/sub
	}

	// Tick method
	public void tick() {
		hunger += (4 + getRandom());
		sleepy += (3 + getRandom());
		dirty += (6 + getRandom());
		bored -= (2 + getRandom());
	}

	public void bunny() {
	}

	// getters
	public int getHunger() {
		return hunger;
	}

	public int getSleepy() {
		return sleepy;
	}

	public int getDirty() {
		return dirty;
	}

	public int getBored() {
		return bored;
	}

	// Methods
	public void feed() {
		hunger -= 7;
		sleepy += 4;
	}

	public void pet() {
		bored -= 3;
		sleepy += 5;
	}

	public void giveBath() {
		dirty -= 3;
		hunger += 2;
	}

	public void fight() {
		hunger -= 6;
		dirty += 5;
	}
}
