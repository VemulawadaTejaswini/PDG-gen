import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long dp[] = new long[N+1];

		for (int i=0; i<=N; i++) {
			if (i==0) dp[0] = 2;
			else if (i==1) dp[1] = 1;
			else dp[i] = dp[i-1] + dp[i-2];
		}
		System.out.println(dp[N]);
	}
}
