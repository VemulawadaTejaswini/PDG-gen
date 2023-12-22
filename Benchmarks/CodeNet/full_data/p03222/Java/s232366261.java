import java.util.*;
public class Main {

	public static void main(String[] args) {
		int MOD = 1_000_000_007;
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		long[][] dp = new long[H+1][W+2];
		dp[0][1] = 1;
		int[] x = new int[W+2];
		int tot = 0;
		LOOP:for(int j = 0; j < 1<<(W-1); j++) {
			boolean[] r = new boolean[W-1];
			for(int k = 0; k < W-1; k++)
				if((1 & j >> k) == 1)
					r[k] = true;
			for(int k = 1; k < W-1; k++)
				if(r[k] && r[k-1])
					continue LOOP;
			for(int k = 0; k < W-1; k++)
				if(r[k])
					x[k+1]++;
			tot++;
		}
		for(int i = 0; i < H; i++)
			for(int j = 1; j <= W; j++)
				dp[i+1][j] = (dp[i][j] * (tot - x[j] - x[j-1]) % MOD + dp[i][j-1] * x[j-1] % MOD + dp[i][j+1] * x[j] % MOD) % MOD;
		System.out.println(dp[H][K]);
	}

}