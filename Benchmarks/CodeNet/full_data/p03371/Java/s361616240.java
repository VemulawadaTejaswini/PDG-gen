import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int X = in.nextInt();
		int Y = in.nextInt();
		int ans = 0;
		if (A + B > C * 2) {
			int min = Math.min(X, Y);
			ans += (min * C) * 2;
			if (X > min) {
				if (A > C * 2) {
					ans += (X - min) * C * 2;
				} else {
					ans += (X - min) * A;
				}
			} else if (Y > min) {
				if (B > C * 2) {
					ans += (Y - min) * C * 2;
				} else {
					ans += (Y - min) * B;
				}
			}
		} else {
			ans += A * X + B * Y;
		}
		System.out.println(ans);
		in.close();
	}
}