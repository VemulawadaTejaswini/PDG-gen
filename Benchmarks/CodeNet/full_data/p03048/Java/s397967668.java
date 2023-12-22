import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		
		long dp[] = new long[n+5000];
		dp[0] = 1;
		
		for(int i = 0; i < n ; i++) {
			dp[i+r] += dp[i]; 
		}
		for(int i = 0; i < n ; i++) {
			dp[i+g] += dp[i]; 
		}

		for(int i = 0; i < n ; i++) {
			dp[i+b] += dp[i]; 
		}
		
		System.out.println(dp[n]);
	}
}
