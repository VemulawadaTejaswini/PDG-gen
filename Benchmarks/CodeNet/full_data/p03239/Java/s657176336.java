import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int T = sc.nextInt();
		int c = 0, t = 0, ans = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			c = sc.nextInt();
			t = sc.nextInt();
			if (t <= T && c < ans) {
				ans = c;
			}
		}

		if (ans > 1001) {
			System.out.println("TLE");
		} else {
			System.out.println(ans);
		}
		sc.close();
	}

}
