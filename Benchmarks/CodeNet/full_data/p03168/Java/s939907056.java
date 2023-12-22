import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args) {
		Main ans = new Main();
		System.out.printf("%.10f",ans.solve());
	}

	private double solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double [] array = new double[N+1];
		for(int i=1;i<=N;i++){
			array[i] = sc.nextDouble();
		}

		double ans = 0.0;
		double [][] dp = new double[3000][3000];
		for(int i=0;i<3000;i++) {
			Arrays.fill(dp[i], -1);
		}


		return solve(dp, array, N, (N+1)/2);

	}

	private double solve(double [][] dp, double []array, int i, int x) {

		if (x==0) return 1;
		if (i==0) return 0;
		if (dp[i][x]>-0.9) return dp[i][x];
		dp[i][x] = array[i]* solve(dp, array, i-1, x-1) + (1-array[i]) * solve(dp, array, i-1, x);
		return dp[i][x];

	}

}