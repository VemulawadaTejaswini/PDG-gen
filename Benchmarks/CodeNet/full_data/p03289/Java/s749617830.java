import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		if (check(S)) {
			System.out.println("AC");
		} else {
			System.out.println("WA");
		}
	}

	private static boolean check(String S) {
		if (S.charAt(0) != 'A') return false;
		
		int C = 0;
		for (int i = 2; i < S.length() - 1; i++) {
			if (S.charAt(i) == 'C') {
				C++;
			}
		}
		if (C != 1) return false;

		int upper = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) >= 'A' && S.charAt(i) <= 'Z') {
				upper++;
			}
		}
		if (upper != 2) return false;

		return true;
	}
}