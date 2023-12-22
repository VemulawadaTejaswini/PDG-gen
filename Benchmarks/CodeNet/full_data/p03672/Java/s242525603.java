package project;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();

		if ((s.substring(0, 1) + s.substring(0, 1)).equals(s) && s.length() == 2) {
			System.out.println(2);
		}

		for (int i = 1; i < s.length(); i++) {
			s = s.substring(0, s.length() - 1);
			if (s.length() % 2 == 0 && (s.substring(0, s.length() / 2) + s.substring(0, s.length() / 2)).equals(s)) {
				System.out.println(s.length());
				return;
			}

		}
	}
}

