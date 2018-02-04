//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.applet.AudioClip;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FruitQuiz extends KeyAdapter {

	void makeQuestions() {
		question1 = new JLabel(
				"<html>Which is not a real animal? <br> A: Flubber Monkey <br> B: Pink Fairy Armadillo <br> C: Dumbo Octopus</html>");
		// 11. Make another question called "question2"
		question2 = new JLabel(
				"<html>Which is not a real fruit? <br> A: Flubber Orange <br> B: Pink Fairy Strawberry <br> C: Dumbo Banana</html>");
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		int keyCode = arg0.getKeyCode();
		// 1. Print out the key code variable
		System.out.println(keyCode);

		// 2. Make 3 variables that hold the key codes for apple, banana and carrot
		int appleCode = KeyEvent.VK_A;
		int bananaCode = KeyEvent.VK_B;
		int carrotCode = KeyEvent.VK_C;
		

		
		if (question1.isShowing()) {
			// 3. If they touched the right fruit, do steps 4 and 7
			if (keyCode == appleCode) {
				// 4. Call the correct() method
				correct();
				// 7. Use the nextQuestion() method to go to question2
				nextQuestion(question2);
			} else {
			// 8. else (if they touched something else)
				// 9. Call the incorrect() method
				incorrect();
			}
		}

		// 12. If question2 is showing,
		if (question2.isShowing()) {
			// 13. check if it is right or wrong like you did for question1
			if (keyCode == bananaCode) {
				correct();
			} else {
				incorrect();
			}
		}
	}

	private void correct() {
		// 5. Find a sound for when they get a question right, and drag it into
		// the default package. It must be a .wav file. 
		// There are lots on freesound.org
		// 6. Use the playSound method to play your sound
		playSound("ding.wav");
	}

	private void incorrect() {
		// 10. Find a sound for wrong answers and put it in the default package. Use the playSound method to play it.
		playSound("buzz.wav");
	}

	private void nextQuestion(JLabel newQuestion) {
		frame.remove(question1);
		frame.remove(question2);
		frame.remove(question3);
		frame.remove(question4);
		frame.add(newQuestion);
		frame.pack();
		frame.setVisible(true);
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	public static void main(String[] args) {
		new FruitQuiz().go();
	}

	JFrame frame = new JFrame();

	private void go() {
		makeQuestions();
		frame.add(question1);
		frame.setVisible(true);
		frame.pack();
		frame.addKeyListener(this);
	}

	JLabel question1 = new JLabel(), question2 = new JLabel(), question3 = new JLabel(), question4 = new JLabel(),
			question5;
}

