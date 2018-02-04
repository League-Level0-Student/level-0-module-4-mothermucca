import java.util.Scanner;


public class SimpleSorter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter 3 integers.");
			

			int a = Integer.parseInt(scanner.next());
			int b = Integer.parseInt(scanner.next());
			int c = Integer.parseInt(scanner.next());
			
			System.out.println("" + findLowest(a, b, c) + ", " + findMiddle(a, b, c) + ", " + findHighest(a, b, c));
			System.out.println("" + findHighest(a, b, c) + ", " + findMiddle(a, b, c) + ", " + findLowest(a, b, c));
		}
		
		scanner.close();
	}
	
	static int findLowest(int a, int b, int c) {
		if (a < b && a < c) {
			return a;
		} else if (b < a && b < c) {
			return b;
		} else {
			return c;
		}
	}
	
	static int findHighest(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > a && b > c) {
			return b;
		} else {
			return c;
		}
	}
	
	static int findMiddle(int a, int b, int c) {
		if (a < b && a > c) {
			return a;
		} else if ((b < a && b > c) ||
				   (b > a && b < c)) {
			return b;
		} else {
			return c;
		}
	}
}
