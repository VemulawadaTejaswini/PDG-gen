import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] w = new int[N];
		int[] v = new int[N];
		for (int i = 0; i < N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		long[] dp = new long[W + 1];
		for (int i = 0; i < N; i++) {
			for (int j = W - w[i]; j >= 0; j--) {
				dp[j + w[i]] = Math.max(dp[j + w[i]], dp[j] + v[i]);
			}
		}
		System.out.println(dp[W]);
	}

}
