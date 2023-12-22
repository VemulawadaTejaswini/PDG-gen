import java.io.*;
import java.util.*;
public class Sol3{
	public static int dp[][] = new int[201][201];
	final public static int MOD = (int)1e9+7;
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dp[][] = new int[n][3];
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
			
		}
		dp[0][0] = a[0];
		dp[0][1] = b[0];
		dp[0][2] = c[0];
		for(int i=1; i<n; i++) {
			dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2]) + a[i];
			dp[i][1] = Math.max(dp[i-1][0], dp[i-1][2]) + b[i];
			dp[i][2] = Math.max(dp[i-1][0], dp[i-1][1]) + c[i];
		}
		int max = Math.max(dp[n-1][0], dp[n-1][1]);
		max = Math.max(max, dp[n-1][2]);
		System.out.println(max);
		sc.close();
	}
}
