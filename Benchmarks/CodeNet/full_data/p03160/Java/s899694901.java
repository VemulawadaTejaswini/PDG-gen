import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int[] H = new int[N];
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		int[] dp = new int[N];
		Arrays.fill(dp, (int)2e9);
		dp[0] = 0;
		for (int i = 0; i < N; i++) {
			if (i + 1 < N && dp[i] + Math.abs(H[i] - H[i + 1]) < dp[i + 1]) {
				dp[i + 1] = dp[i] + Math.abs(H[i] - H[i + 1]);
			}
			if (i + 2 < N && dp[i] + Math.abs(H[i] - H[i + 2]) < dp[i + 2]) {
				dp[i + 2] = dp[i] + Math.abs(H[i] - H[i + 2]);
			}
		}
		System.out.println(dp[N - 1]);
	}

}
