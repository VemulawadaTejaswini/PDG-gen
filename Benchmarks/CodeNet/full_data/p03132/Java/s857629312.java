import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in) ;
	public static void main(String[]args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		int l = sc.nextInt();
		
		long[] a = new long[l];
		for(int i = 0 ; i < l ; i++) {
			a[i] = sc.nextInt();
		}
		
		
		long[][] dp = new long[l+1][5];
		
		for(int i=0 ; i<l ; i++) {
			
			dp[i+1][0] = dp[i][0] + a[i];

			long p2 = a[i] == 0 ? 2 : a[i] % 2;
			dp[i+1][1] = min(dp[i], 2) + p2;
			dp[i+1][2] = min(dp[i], 3) + (a[i] + 1)% 2;
			dp[i+1][3] = min(dp[i], 4) + p2;
			dp[i+1][4] = min(dp[i], 5) + a[i];
		}
		
		System.out.println(min(dp[l],5));
		
	}
	
	long min(long[] ls, int to) {
		long res = Long.MAX_VALUE/2;
		for(int i = 0 ; i < to ; i ++) {
			res = Math.min(res, ls[i]);
		}
		return res;
	}
}
