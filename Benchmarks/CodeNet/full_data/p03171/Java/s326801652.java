

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static long max(long dp[][], int i, int j,int n, int arr[]) {
		if(i==j) {
			dp[i][j] = arr[i];
			return dp[i][j];
		}
		if( dp[i][j]!=-1)
			return dp[i][j];
		dp[i][j]= Math.max(arr[i]-max( dp, i+1,j,n, arr), arr[j]- max(dp, i, j-1,n,arr));
		return dp[i][j];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int n = in.nextInt();
		long dp[][] = new long[n][n];
		int [] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]= in.nextInt();
			Arrays.fill(dp[i], -1);
		}
		max(dp, 0,n-1, n, arr);
		System.out.println(dp[0][n-1]);
	}

}
