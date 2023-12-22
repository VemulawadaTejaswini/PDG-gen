import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Greedy 0に気を付ける
		// シミュレーション
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 0L;
		long mod = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (a > 0) {
				a += mod;
			}

			ans += a / 2;
			mod = a % 2;
		}
		System.out.println(ans);
	}
}
