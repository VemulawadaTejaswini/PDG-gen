import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C, X, Y;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		X = sc.nextInt();
		Y = sc.nextInt();

		if (2 * C < A + B) {
			if(C < A && C < B) {
				System.out.println(C * Math.max(X, Y) * 2);
				return;
			}
			if (C < B && A < C) {
				System.out.println(A * (X - Y) + C * Y * 2);
				return;
			}
			if (C < A && B < C) {
				System.out.println(C * X * 2 + B * (Y - X));
				return;
			}
		} else {
			System.out.println(A * X + B * Y);
			return;
		}
	}
}