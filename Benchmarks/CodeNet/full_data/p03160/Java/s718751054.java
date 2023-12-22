import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		
		long []h = new long [n];
		
		for(int i = 0 ; i < n ;i++) {
			h[i] = sc.nextLong();
		}
		
		long []dp = new long [n];
		
		dp[0] = 0;
		dp[1] = Math.abs(h[1] - h[0]);
		
		for(int i = 2 ;i < n ; i++) {
			long a = Math.abs(h[i] -h[i-1]);
			long b = Math.abs(h[i] -h[i-2]);
			if(a > b) {
				dp[i] = dp[i-2] + b;
			}
			else {
				dp[i] = dp[i-1] + a;
			}
		}
		
		System.out.println(dp[n-1]);


	}

}
