import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		if(A + B > 2 * C) {
			if(A > 2 * C && B > 2 * C) {
				System.out.println(Math.max(X, Y) * C * 2);
			} else if(A > 2 * C) {
				if(X > Y) {
					System.out.println(X * C * 2);
				} else {
					System.out.println(X * C * 2 + (Y - X) * B);
				}
			} else if(B > 2 * C){
				if(X > Y) {
					System.out.println(Y * C * 2 + (X - Y) * A);
				} else {
					System.out.println(Y * C * 2);
				}
			} else {
				if(X > Y) {
					System.out.println(Y * C * 2 + (X - Y) * A);
				} else {
					System.out.println(X * C * 2 + (Y - X) * B);
				}
			}
		} else {
			System.out.println(A * X + B * Y);
		}
	}
}
