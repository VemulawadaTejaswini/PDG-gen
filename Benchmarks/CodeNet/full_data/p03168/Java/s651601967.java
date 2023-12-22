import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Main answer = new Main();
		System.out.printf("%.10f\n",answer.solve());
	}

	private double solve() {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double [] array = new double[N+1];
		for(int i=1;i<=N;i++){
			array[i] = sc.nextDouble();			
		}
		//System.out.println(Arrays.toString(array));
		double [][] dp = new double[3001][3001];
		for(int i=0;i<dp.length;i++){
			Arrays.fill(dp[i], -1.0);
		}
		return solve(array, N, (N+1)/2, dp);
	}

	private double solve(double [] array, int i, int x, double[][] dp) {

		// prob of getting atleat 0 heads will be 1 if all are tails or 
		// even if some coins have >1 heads, then also prob of getting 
		// atleast 0 heads is 1
		if (x==0) return 1;

		// if there are 0 coins then zero prob of getting at least x heads
		// unless x is also 0 in which case prob is 1. (see reason above)
		// But this is taken care above
		if (i==0) return 0;

		// choosing 0.9 instead of -1 to account for double precision.
		if (dp[i][x]> -0.9) return dp[i][x];

		dp[i][x] = array[i]*solve(array, i-1, x-1, dp) + (1-array[i])*solve(array, i-1, x, dp);

		return dp[i][x];
  
	}
}
