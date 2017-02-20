import java.util.Scanner;

public class VirtualPetApp {

	private static Scanner input;

	public static void main(String[] args) {
		VirtualPet bunny = new VirtualPet();
		input = new Scanner(System.in);
		int userChoice = 0;
		
		bunny.bunny();
		
		bunny.tick();

		System.out.println("\nTakeda the Ninja Bunny\n\nHunger: " + bunny.getHunger() + "\nSleepy: " + bunny.getSleepy()
				+ "\nDirty: " + bunny.getDirty() + "\nBored: " + bunny.getBored() + "\n\n");

		// ask for user Input now
		System.out.println("What do you want to do with Takeda?\n1. Feed the bunny\n2. Pet the bunny"
				+ "\n3. Bath the bunny\n4. Do nothing and fight Takeda\n\n");

		userChoice = input.nextInt();
		switch (userChoice) {
		case 1:
			if (bunny.getHunger() <= 8) {
				System.out.println("Takeda is full as a tick, don't feed him anymore!");
			} else {
				bunny.feed();
				System.out.println("Yummy!");
			}
			break;

		case 2:
			if (bunny.getSleepy() <= 5) {
			System.out.println("You pet the bunny, to bad Takeda thinks your form is weak.");
			} else {
				bunny.pet();
				System.out.println("You pet the bunny and he didn't run away!");
			}
			break;

		case 3:
			if (bunny.getDirty() <= 3) {
			System.out.println("The Bunny is still dirty!");
		    } else {
			bunny.giveBath();
			System.out.println("All clean");
		    }
			break;

		case 4:
			System.out.println("Bad choice, no one wins against Takeda.");
			break;

		default:
			System.out.println("ERROR- Please enter 1-4");
			break;
		}

		System.out.println("\n\nNow the bunny is\nHunger: " + bunny.getHunger() + "\nSleepy: " + bunny.getSleepy()
				+ "\nDirty: " + bunny.getDirty() + "\nBored: " + bunny.getBored() + "\n\n");
	}
}
