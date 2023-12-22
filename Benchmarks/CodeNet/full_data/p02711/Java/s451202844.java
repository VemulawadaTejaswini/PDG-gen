package aBC162;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = N % 10;
		N /= 10;
		int b = N % 10;
		N /= 10;

		if (a == 7 || b == 7 || N == 7) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
