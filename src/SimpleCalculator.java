

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter a number."));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter another number."));

		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What should I do to the numbers", "Simple calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "multiply", "divide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		int result = 0;
		String op = "";
		if (operation == 0) {
			op = "+";
			result = add(a, b);
		} else if (operation == 1) {
			result = subtract(a, b);
			op = "-";
		} else if (operation == 2) {
			result = multiply(a, b);
			op = "*";
		} else if (operation == 3) {
			result = divide(a, b);
			op = "/";
		}
		JOptionPane.showMessageDialog(null, "" + a + " " + op + " " + b + " = " + result);

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	// 4. Create similar methods for subtraction, multiplication and division.
	static int add(int a, int b) {
		return a + b;
	}
	
	static int subtract(int a, int b) {
		return a - b;
	}
	
	static int multiply(int a, int b) {
		return a * b;
	}
	
	static int divide(int a, int b) {
		return a / b;
	}
	
}