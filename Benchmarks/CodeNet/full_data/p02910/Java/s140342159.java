import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String step = sc.next();
		boolean good = true;

		for (int i = 0; i < step.length(); i++) {
			if (i % 2 == 0) {
				if (step.substring(i, i + 1).equals("L")) {
					good = false;
				}
			} else {
				if (step.substring(i, i + 1).equals("R")) {
					good = false;
				}
			}
		}

		if (good) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}