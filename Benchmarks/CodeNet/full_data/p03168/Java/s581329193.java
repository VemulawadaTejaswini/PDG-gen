import java.util.*;
import java.io.*;

public class Main {
	

	public static void main(String[] args) {
		Main ans = new Main();
		System.out.printf("%.10f\n",ans.solve());
	}

	private double solve(){

		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		double [] array = new double[N+1];
		for(int i=1;i<=N;i++){
			array[i] = sc.nextDouble();
		}

		double [][] dp = new double[3001][3001];
		for(int i=0;i<3001;i++) {
			Arrays.fill(dp[i], -1.0);
		}

		return solve(array, N, (N+1)/2, dp);
	}

	private double solve(double[] array, int total, int requiredHeads, double [][] dp) {
		if (requiredHeads==0) return 1;
		if (total==0) return 0;
		if (dp[total][requiredHeads] > -0.9) return dp[total][requiredHeads];
		double ans = (array[total] * solve(array, total-1, requiredHeads-1, dp)) +  ((1-array[total]) * solve(array, total-1, requiredHeads, dp));
		dp[total][requiredHeads] = ans;
		return ans;
	}
	
}