
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.nextLine();

			if (s.charAt(0) != 'A') {
				System.out.println("WA");
				return;
			}

			if (s.charAt(1) < 'a' || 'z' < s.charAt(1)) {
				System.out.println("WA");
				return;
			}

			if (s.charAt(s.length() - 1) < 'a' || 'z' < s.charAt(s.length() - 1)) {
				System.out.println("WA");
				return;
			}

			boolean hasC = false;
			for (int i = 2; i < s.length() - 1; i++) {
				char c = s.charAt(i);

				if (c == 'C') {
					if (hasC) {
						System.out.println("WA");
						return;
					} else {
						hasC = true;
					}
				} else if (s.charAt(i) < 'a' || 'z' < s.charAt(i)) {
					System.out.println("WA");
					return;
				}
			}

			if (hasC) {
				System.out.println("AC");
			} else {
				System.out.println("WA");
			}
		}
	}
}
