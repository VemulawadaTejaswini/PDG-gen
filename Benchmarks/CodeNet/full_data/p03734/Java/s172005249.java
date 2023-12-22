import java.util.*;

public class Main {
	
	/*
	 * default function
	 * */	
	int ni() {
		return cin.nextInt();
	}
	
	String nl() {
		return cin.nextLine();
	}
	
	void println(String str) {	
		System.out.println(str);
	}
	
	void print(String str) {
		System.out.print(str);
	}
	
	/*
	 * default variable
	 */
	
	static final int MOD = 1000000007;
	
	Scanner cin = new Scanner(System.in);	
	String  output;
	
	public static void main(String[] args) {			
		new Main().run();						
	}
	/* default above */
		
	public void run() {
			
		input();
		/* 
		 * start
		 */	
		
		int res = solve();
		/*
		 * finish
		 */
		
		output = res+"";
		println(output);
			
	}
	/* 
	 * define variable
	 */
	
	int N, W;
	int[] weight;
	int[] value;
	
	void input() {
		
		N = ni();
		W = ni();
		
		weight = new int[N+1];
		value  = new int[N+1];
		
		for (int i = 0; i < N; i ++) {
			weight[i+1] = ni();
			value[i+1]  = ni();
		}
		
	}
	
	int solve() {
		
		int[][] dp = new int[N + 1][W + 1];
		
		for (int i = 1; i <= N; i ++) {
			for (int j = 1; j <= W; j ++) {
				dp[i][j] = dp[i-1][j];
				
				if (weight[i] <= j) {
					dp[i][j] = Math.max(dp[i][j], dp[i-1][j-weight[i]] + value[i]);
				}
			}
		}
		
		return dp[N][W];
	}
}
