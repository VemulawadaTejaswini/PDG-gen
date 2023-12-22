import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		char a = input.charAt(0);
		char b = input.charAt(1);
		char c = input.charAt(2);
		int flagA = 0;
		int flagB = 0;
		int flagC = 0;
		for (int i = 0; i <= 3; i++) {
			if (a == input.charAt(i)) {
				flagA++;
			}
		}
		for (int i = 0; i <= 3; i++) {
			if (b == input.charAt(i)) {
				flagB++;
			}
		}
		for (int i = 0; i <= 3; i++) {
			if (c == input.charAt(i)) {
				flagC++;
			}
		}

		if (flagA == 2 && flagB == 2 && flagC == 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
