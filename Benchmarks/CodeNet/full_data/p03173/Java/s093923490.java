import java.io.*;
import java.util.*;
 
class Main {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long[] arr = new long[n];
		for(long i=0; i< n; i++)
			arr[i] = in.nextLong();
		long[][] dp = new  long[n][n];

		for(int i = n-1; i>=0; i--){
			for(int j = i; j<n; j++) {
				if(i==j){
					dp[i][j]=0;
				} else {
					dp[i][j] = Long.MAX_VALUE;
					for(int k=i; k<=j-1; k++){
						dp[i][j] = Math.min(dp[i][j],
							dp[i][k]+dp[k+1][j]+getSum(i,j,arr));
					}
				}
			}
		}

		System.out.println(dp[0][n-1]);

	}

	static long getSum(int l, int r, long[] arr){
     long s =0;
     for(int i =l; i<=r; i++){
     	s+=a[i];
     }
     return s;
	}
}