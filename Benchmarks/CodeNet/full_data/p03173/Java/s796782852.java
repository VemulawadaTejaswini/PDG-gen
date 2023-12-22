import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Main ans = new Main();
		System.out.println(ans.solve());
	}

	private long solve() {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		 
		long [] array = new long[N+1];
		for(int i=1;i<=N;i++) {
			array[i] = sc.nextLong();
		}
		long[][]sum = preprocess(array, N);
		long [][] dp = new long[500][500];
		return solve(dp, array, 1, N, sum);
	}

	private long solve(long[][]dp, long[]array, int start, int end, long[][] sum) {
		if (start==end) return 0;
		if (dp[start][end]!=0) return dp[start][end];
		long bestSlime= (long) (1e15);
		for(int k=start;k<end;k++){
			long combine = solve(dp, array, start, k, sum) + solve(dp, array, k+1, end, sum) + sum[start][end];
			bestSlime = Math.min(bestSlime, combine);
		}
		dp[start][end] = bestSlime;
		return bestSlime;
	}

	private long [][] preprocess(long[] array, int N ) {
 
		long[][] sum = new long[N+1][N+1];
		for(int i=1;i<=N;i++){
			for(int j=i;j<=N;j++){
				sum[i][j] = array[j] + ((j==i) ? 0: sum[i][j-1]);
			}
		}
		return sum;

	}
}