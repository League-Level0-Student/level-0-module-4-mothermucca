import javax.swing.JOptionPane;


public class ChooseYourOwnAdventure {
	public static void main(String[] args) {
		startHere();
	}
	
	static void startHere() {
		String story = "After a long hard day at your boring office job you arrive at home.\nBefore you walk into your house you see a letter in your mailbox,\nan unusual occurrence as bill day is Thursday not Monday.\n\nYou go up to the mailbox and see that there is a little red letter -- quite suspicious.\n\nOpen it?";
		boolean openIt = JOptionPane.showConfirmDialog(null, story, "The Red Letter", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
		
		if (openIt) {
			openIt();
		} else {
			story = "You decide that it is too suspicious and you choose to go inside.\nHalf way up the drive you slip and fall head first on a rock.\n\nNo one knows what happened to your body. Did the writer of the letter take it?";
			JOptionPane.showMessageDialog(null,  story, "The Red Letter", JOptionPane.PLAIN_MESSAGE);
			startHere();
		}
		
	}
	
	static void openIt() {
		String story = "You are too curious not to answer your mail.\nSo you grab it out of your mailbox and open it and find seven words.\n\n'Meet me on the docks at twelve'\n\nYou are not that sure whether to go or not because\nit seems like a stereotypical set up for a camp fire story.\n\nDrive up to the dock to find out who sent you the letter.";
		JOptionPane.showMessageDialog(null,  story, "The Red Letter", JOptionPane.PLAIN_MESSAGE);
		
		story = "You decide to go down to the docks to confront the person who wrote the red letter.";
		story += "\n\n11:59 pm and there is no one there. Where is he? You think to yourself, did he forget? Is it a prank?";
		story += "\n\nThen you hear a car rumble in the distance. A pair of bright yellow headlights pop into existence";
		story += "\nand they are heading towards you and the noise is getting louder.";
		story += "\n\nStand your ground?";
		
		boolean standYourGround = JOptionPane.showConfirmDialog(null, story, "The Red Letter", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
		
		if (standYourGround) {
			standYourGround();
		} else {
			runAway();
		}
	}
	
	static void standYourGround() {
		String story = "You decide to stand your ground. The car is getting dangerously close to you. Five seconds feels like it has been an hour.";
		story += "\n\nThe car is getting nearer and you are regretting your decision. You can now see the red hood of the car coming towards you.";
		story += "\n\nJust as you get ready for the numbing pain of the car hitting you it screeches to a stop.";
		story += "\nA suited man comes out of the car and he is holding a hand gun. “Where is the money?” the man shouts at you.";

		JOptionPane.showMessageDialog(null,  story, "The Red Letter", JOptionPane.PLAIN_MESSAGE);
		runAway();
	}
	
	static void runAway() {
		String story = "You decide to run away. In the distance you hear a car. Its headlights are getting closer.";
		story += "\nYou take a left turn into a dark alleyway and end up behind a small boat house. You see the car speed past you and you decide to flank it.";
		story += "\n\nYou run onto the main road and lose it. It only took you ten minutes to find the police station nearest to you.";
		story += "\n\nOnce you arrive you quickly tell your story. Thirty minutes later the police sergeant returns looking happy with himself.";
		story += "\nHe tells you that you were the bait in a drug bust and now you are a key person in the crime of the year.";
		story += "\n\nTHE END.";
		
		JOptionPane.showMessageDialog(null,  story, "The Red Letter", JOptionPane.PLAIN_MESSAGE);
	}
}
