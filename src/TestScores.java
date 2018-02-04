import javax.swing.JOptionPane;


public class TestScores {
	public static void main(String[] args) {
		int score = Integer.parseInt(JOptionPane.showInputDialog("What was your test score?"));
		
		if (score > 90) {
			JOptionPane.showMessageDialog(null, "Wow! You studied!");
		} else if (score > 80) {
			JOptionPane.showMessageDialog(null, "Good.");
		} else if (score > 70) {
			JOptionPane.showMessageDialog(null, "Okay.");
		} else if (score > 60) {
			JOptionPane.showMessageDialog(null, "Not good. Try harder next time.");
		} else {
			JOptionPane.showMessageDialog(null, "Terrible. Go back and study again.");
		}
	}
}
