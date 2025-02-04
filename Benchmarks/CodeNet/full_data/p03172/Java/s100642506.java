
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int n = sc.nextInt();
		int k =sc.nextInt();
		long[] arr = input(n);
		
		long[] dp = new long[k+1];
		long[] cum = new long[k+1];
		long mod = 1000000007;

		for(int i = 0 ; i < n;i++ ) {
			
			
			
				cum = dp;
			
			for(int j = 1 ;j <= k ;j++) {
				cum[j]= (cum[j] + cum[j-1] )%mod;				
				cum[j] %=mod;
			}
			dp= new long[k+1];
			for(int j = 0 ;j <= k ;j++) {
				if(i==0) {
					if(j<=arr[i])
					dp[j]=1;
					continue;
				}
				dp[j] = cum[j]%mod;
				dp[j]= (dp[j] - ( (j - arr[i]>0)? cum[(int) (j - arr[i]-1)] : 0 ) + mod )%mod;
				dp[j]%=mod;
				
				
			}
			
			
		}
	
		System.out.println(dp[k]);
	}

	public static long[] input(int n) throws Exception {

		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		return arr;
	}

	public static int[][] input(int n, int m) throws Exception {

		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}

}
