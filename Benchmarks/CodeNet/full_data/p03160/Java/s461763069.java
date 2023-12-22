import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dp[] = new int[n];
		int h[] = new int[n];
		final int INF = 1000000000;
		dp[0] = 0;

		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
			if(i > 0)dp[i] = INF;
		}

		for(int i = 1; i < n; i++) {
			dp[i] = chmin(dp[i], dp[i-1] + Math.abs(h[i] - h[i-1]));
			if(i > 1) {dp[i] = chmin(dp[i], dp[i-2] + Math.abs(h[i] - h[i-2]));}
		}

		System.out.println(dp[n-1]);
		sc.close();
	}

	public static int chmin(int a, int b) {
		if(a > b) {
			return b;
		}else {return a;}
	}
}
