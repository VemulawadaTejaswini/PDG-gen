import java.util.Arrays;
import java.util.Scanner;

//Educational DP Contest / DP まとめコンテスト
//B - Frog 2
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int h[] = new int[N];
		for (int i = 0; i < N; i++) {
			h[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		int[] dp = new int[N + 2];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < K; j++) {
				if (i - j >= 1) {
					dp[i] = Math.min(dp[i], dp[i - j - 1] + Math.abs(h[i - j - 1] - h[i]));
				}
			}
		}

		System.out.println(dp[N - 1]);
	}
}
