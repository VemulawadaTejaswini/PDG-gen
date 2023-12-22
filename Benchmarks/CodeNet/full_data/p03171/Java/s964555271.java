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
		long sum =0;
		for(int i=1;i<=N;i++){
			array[i] = sc.nextLong();
			sum+= array[i];
		}

		long [][] dp = new long[3002][3002];

		long X = solve(dp, array,1, N, 1);
		long Y = sum-X;
		return X-Y;
	}

	private long solve(long[][] dp, long[] array, int left, int right, int turn) {

		if(left>right) return 0;
		if (dp[left][right]!=0) return dp[left][right];
		long answer=0;
		if (turn==1) {
			long choose_left = array[left] + solve(dp, array, left+1, right, 0);
			long choose_right = array[right] + solve(dp, array, left, right-1, 0);
			answer = Math.max(choose_right, choose_left);
		} else {
			long choose_left = solve(dp, array, left+1, right, 1);
			long choose_right = solve(dp, array, left, right-1, 1);
			answer = Math.min(choose_left, choose_right);			 
		}
		dp[left][right] = answer;
		return answer;
	}

}