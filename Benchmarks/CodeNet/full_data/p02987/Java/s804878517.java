import java.util.*;

public class Main {
	public static void main(String[] args) {
		// practice contest

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		for (int i = 0; i < 4; i++) {
			if (s.charAt(0) == s.charAt(i)) {
				a += 1;
			}

		}
		for (int i = 0; i < 4; i++) {
			if (s.charAt(1) == s.charAt(i)) {
				b += 1;
			}

		}
		for (int i = 0; i < 4; i++) {
			if (s.charAt(2) == s.charAt(i)) {
				c += 1;
			}

		}
		for (int i = 0; i < 4; i++) {
			if (s.charAt(3) == s.charAt(i)) {
				d += 1;
			}

		}

		if ((a == 2 && b == 2) || (a == 2 && c == 2) || (a == 2 && d == 2) || (b == 2 && c == 2) || (b == 2 && d == 2)
				|| (c == 2 && d == 2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
