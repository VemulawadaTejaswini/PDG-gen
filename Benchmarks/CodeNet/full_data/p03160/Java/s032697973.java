import java.util.Arrays;
import java.util.Scanner;

//Educational DP Contest / DP まとめコンテスト
//A - Frog 1
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int h[] = new int[N];
		for (int i = 0; i < N; i++) {
			h[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		int[] dp = new int[N + 2];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		for (int i = 0; i < N; i++) {
			if (i > 1) {
				dp[i] = Math.min(dp[i], dp[i-2] + Math.abs(h[i - 2] - h[i]));
			}
			if (i > 0) {
				dp[i] = Math.min(dp[i], dp[i-1] + Math.abs(h[i - 1] - h[i]));
			}
		}

		System.out.println(dp[N-1]);
	}
}
