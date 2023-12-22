import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] Hs = new int[N+1];
		int INF = Integer.MAX_VALUE;
		Hs[0] = INF;
		int[] dp = new int[N+1];

		for (int i = 1; i <= N; ++i) Hs[i] = sc.nextInt();
		Arrays.fill(dp, INF);

		if(N == 2) {
			System.out.println(Math.abs(Hs[2]-Hs[1]));
		}else {

			for (int i = 2; i < 2 + K; ++i) {
				dp[i] = Math.abs(Hs[1]-Hs[i]);
			}

			for (int i = 2; i <= N; ++i) {
				for (int k = 1; k <= K; ++k) {
					if(i+k<=N)dp[i+k] = Math.min(dp[i+k], dp[i]+Math.abs(Hs[i+k]-Hs[i]));
				}
			}
			System.out.println(dp[N]);
		}
	}

}
