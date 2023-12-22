import java.util.*;

public class Main {
	
	/*
	 * default function
	 * */	
	int ni() {
		return cin.nextInt();
	}
	
	long nl() {
		return cin.nextLong();
	}
	
	String line() {
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
		
		dfs(0, 0, 0, 0);
		
		/*
		 * finish
		 */
		
		output = res +"";
		println(output);
			
	}
	/* 
	 * define variable
	 */
	
	int N;
	int[] nums;
	
	long res;
	
	
	void input() {
		
		res = Long.MIN_VALUE;		
		
		N = ni();
		nums = new int[N * 3];
		
		for (int i = 0; i < nums.length; i ++) {
			nums[i] = ni();
		}		
	}
	
	void dfs(int index, long sum1, long sum2, int cnt) {
		
		
		if (index == 3*N) {
			if (cnt != 2*N) {
				return;
			}
			
			res = Math.max(res, sum1 - sum2);
			return;
		}
		
		if (3*N - index < 2*N - cnt) {
			return;
		}
			
		
		if (cnt < N) {
			dfs(index + 1, sum1 + nums[index], sum2, cnt + 1);
		} else {
			dfs(index + 1, sum1, sum2 + nums[index], cnt + 1);
		}
		
		dfs(index + 1, sum1, sum2, cnt);
	}
	
}
