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
		
		int res = dfs(0, 0);
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
	
	Integer[][] memo;
	
	void input() {
		
		N = ni();
		W = ni();
		
		weight = new int[N];
		value  = new int[N];
		
		for (int i = 0; i < N; i ++) {
			weight[i] = ni();
			value[i]  = ni();
		}
		
		memo = new Integer[N + 1][W + 1];
		
		
	}
	
	int dfs(int i, int w) {
		
		if (i == N) {
			return 0;
		}
		
		if (memo[i][w] != null) {
			return memo[i][w];
		}
		
		int res = 0;
		
		if (w > W - weight[i]) {
			
			res = dfs(i + 1, w);
		} else {
			
			int r1 = dfs(i + 1, w);
			int r2 = dfs(i + 1, w + weight[i]) + value[i];
			
			res = Math.max(r1, r2);
		}
		
		memo[i][w] = res;
		return res;		
	}	
}
