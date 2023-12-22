import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		int N = input.nextInt();
		long W = input.nextLong();
		long[][] dp = new long[101][100001]; //Minimum weights to get value v by item N
		//100000 = 100*1000 = (max items)*(max value)
		//Arrays.fill(dp, (long)(1e5));
		//Don't need all rows (only 2 rows needed for comparison)
		long[] w = new long[N+1];
		int[] v = new int[N+1];
		int ans = 0;
		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100000; j++) { //Arrays.fill = too much memory
				//Therefore implement yourself for optimization convenience
				dp[i][j]=(long)(1e9+1);
			} 
		}
		for (int i = 1; i <= N; i++) {
			w[i]=input.nextLong();
			v[i] = input.nextInt();
		}
		dp[1][v[1]]=w[1];
		if (w[1]<=W) ans=Math.max(ans, v[1]);
		for (int i = 2; i <= N; i++) {
			dp[i][v[i]]=w[i];
			for (int val = 1; val <= 100000; val++){
				dp[i][val]=Math.min(dp[i][val],dp[i-1][val]);
				if (val-v[i]>0) dp[i][val] = Math.min(dp[i][val], dp[i-1][val-v[i]]+w[i]);
				if (dp[i][val]<=W) ans=Math.max(ans, val);
			}
		} 
		System.out.println(ans);
	}	
}