import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		sc.close();

		char s[] = new char[S.length()];

		for (int i = 0; i < S.length(); i++) {
			s[i] = S.charAt(i);

			if (i == 0) {
				if (s[i] != 'A') {
					System.out.print("WA");
					return;
				}
			}

			if (i == S.length() - 1) {
				if (s[i] == 'C') {
					System.out.print("WA");
					return;
				}
			}
		}

		int countC = 0;
		int indexC = 0;

		for (int i = 2; i < S.length() - 1; i++) {
			if (s[i] == 'C') {
				countC++;
				indexC = i;
			}
		}

		if (countC != 1) {
			System.out.print("WA");
			return;
		}

		for (int i = 1; i < S.length(); i++) {
			if (i == 0) {
				continue;
			}
			if (i == indexC) {
				continue;
			}

			if (Character.isUpperCase(s[i])) {
				System.out.print("WA");
				return;
			}
		}
		System.out.print("AC");
	}
}