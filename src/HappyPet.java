//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.
	static int happinessLevel = 0;
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
		String kindOfPet = JOptionPane.showInputDialog("What kind of pet do you want?");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (; ;) {
			
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "How do you want to make your " + kindOfPet + " happy?" , "Pet Happiness", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "feed", "take a walk", "pet"}, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 0) {
				doCuddle();
			} else if (task == 1) {
				doFeed();
			} else if (task == 2) {
				doWalk(kindOfPet);
			} else if (task == 3) {
				doPet(kindOfPet);
			} else {
				JOptionPane.showMessageDialog(null, "What did you just do?");
			}

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if (happinessLevel >= 10) {
				JOptionPane.showMessageDialog(null, "Awesome! You must love your pet!");
				break;
			}
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void doPet(String kindOfPet) {
		if (kindOfPet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "purr");
		} else if (kindOfPet.equals("dog")) {
			JOptionPane.showMessageDialog(null, "wag");
		} else {
			JOptionPane.showMessageDialog(null, "snuggle");
		}		
		
		happinessLevel++;
	}
	
	static void doCuddle() {
		JOptionPane.showMessageDialog(null, "Awwww. I feel cuddly.");
		happinessLevel++;
	}
	
	static void doFeed() {
		JOptionPane.showMessageDialog(null,  "Yum!");
		happinessLevel++;
	}
	
	static void doWalk(String kindOfPet) {
		if (kindOfPet.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Walkies!!!!");
			happinessLevel++;
		} else if (kindOfPet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Are you crazy? Cat's don't walk.");
		} else {
			JOptionPane.showMessageDialog(null, "I love walking.");
			happinessLevel++;
		}
	}
}