import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int ans = 0;

		int ans1 = A * X + B * Y;
		int tmp = Math.min(X, Y);
		int ans2 = C * tmp * 2;
		ans2 += A * (X - tmp);
		ans2 += B * (Y - tmp);
		int tmp2 = Math.max(X, Y);
		int ans3 = C * tmp2 * 2;

		if (ans1 < ans2) {
			if (ans1 < ans3) {
				ans = ans1;
			} else {
				ans = ans3;
			}
		} else {
			if (ans2 < ans3) {
				ans = ans2;
			} else {
				ans = ans3;
			}
		}
		System.out.println(ans);
	}
}
