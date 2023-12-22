package atcoder_104A;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Rを指定");
		int R = scanner.nextInt();

		if (R < 1200) {
			System.out.println("ABC");
		} else if (R < 280) {
			System.out.println("ARC");
		} else {
			System.out.println("AGC");
		}

	}

}