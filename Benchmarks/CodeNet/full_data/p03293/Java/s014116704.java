import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		char c[] = s.toCharArray();
		boolean ans = false;
		for (int i = 0; i <= s.length() + 3; i++) {
			turn(c);
			s = new String(c);

			if (s.equals(t)) {
				ans = true;
			}
		}
		if (ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static void turn(char c[]) {
		char ten = c[c.length - 1];
		for (int i = c.length - 1; i > 0; i--) {
			c[i] = c[i - 1];
		}
		c[0] = ten;

	}
}