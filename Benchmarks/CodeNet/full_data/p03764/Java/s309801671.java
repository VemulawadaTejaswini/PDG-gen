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
		
		int res = solve();
		
		/*
		 * finish
		 */
		
		output = res +"";
		println(output);
			
	}
	/* 
	 * define variable
	 */
	
	int n, m;
	int[] x;
	int[] y;
	
	void input() {
		
		n = ni();
		m = ni();
		x = new int[n];
		y = new int[m];
		
		for (int i = 0; i < n; i ++) {
			x[i] = ni();
		}
		
		for (int j = 0; j < m; j ++) {
			y[j] = ni();
		}
	}
	
	int solve() {
		
		long tmp = 0;
		
		for (int r = 0; r < n; r ++) {
			for (int l = 0; l < r; l ++) {
				tmp += x[r] - x[l];
				tmp %= MOD;
			}
		}
		
		long tmp2 = 0;
		for (int r = 0; r < m; r ++) {
			for (int l = 0; l < r; l ++) {
				tmp2 += y[r] - y[l];
				tmp2 %= MOD;
			}
		}
		
		return (int)(tmp * tmp2 %MOD);
	}
	
}
