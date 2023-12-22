import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int check = 0;
		int check2 = 0;
		int check3 = 0;

		for (int i = 0; i < (s.length() / 2); i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				check = 1;
			}
		}

		for (int i = 0; i < (s.length() - 1) / 2 / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				check2 = 1;
			}
		}

		for (int i = 0; i < (s.length() - 1) / 2 / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				check3 = 1;
			}
		}

		if (check == 0 && check2 == 0 && check3 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
