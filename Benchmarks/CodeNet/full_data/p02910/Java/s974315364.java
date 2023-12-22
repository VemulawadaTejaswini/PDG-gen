import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'R' || s.charAt(i) == 'L') {
				if (i % 2 == 1 && s.charAt(i) != 'L') {
					System.out.println("No");
					return;
				} else if (i % 2 == 0 && s.charAt(i) != 'R') {
					System.out.println("No");
					return;
				}
			}

			sc.close();
		}

		System.out.println("Yes");

	}
}
