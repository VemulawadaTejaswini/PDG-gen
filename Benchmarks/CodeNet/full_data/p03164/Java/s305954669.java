import java.util.Scanner;
import java.util.Arrays;

public class Main {
	
	//read input
	public static void main(String[] args) {
		int N = 0;
		int W = 0;
		
		Scanner sc = new Scanner(System.in);
		
		 N = sc.nextInt();
		 int[] v = new int[N+1]; //0 to v
		 W = sc.nextInt();
		 int[] w = new int[N+1]; //0 to W
		
		for(int i = 1; i <= N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		
		int sumValues = 0;
		
		for(int value : v) {
			sumValues += value;
		}
		
	    long[] dp = new long[sumValues+1]; //dp[i][j] max value from 1 to i with max weight j
		
		Arrays.fill(dp, Integer.MAX_VALUE);
		for (int i = 1; i <= N; ++i) {
			for(int j = sumValues; j >= v[i]; --j) {
				dp[j] = Math.min(dp[j], dp[j - v[i]] + w[i]);
			}	
		}
		
		int max = 0;
		for(int i = 1; i <= sumValues; i++) {
			if(dp[i] <= W) {
				max = Math.max(max, i);
			}
		}
		
	   
	  System.out.println(max);
	}
}
