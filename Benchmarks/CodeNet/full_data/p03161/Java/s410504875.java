import java.util.Arrays;
import java.util.Scanner;


public class Main {

	static int N;
	static int K;
	static int[] nums;
	static int[] dp;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();

		int[] nums = new int[N+1];
		int[] dp = new int[N+1];


		for (int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}

		Arrays.fill(dp, Integer.MAX_VALUE);

		dp[0] = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 1; j <= K; j++) {
				if (i+j >= N) {
					continue;
				}else {
					dp[i+j] = Math.min(dp[i+j], dp[i] + Math.abs(nums[i] - nums[i+j]));
				}
			}
		}

		System.out.println(dp[N-1]);

	}
}
