
import java.util.Scanner;

public class Main{
	
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			int b = Integer.parseInt(sc.next());
			a[i] = m - b;
		}
		
		long [][]dp = new long [n+1][2* m * n +1];
		
		dp[0][m*n] = 1;
		
		for(int i = 1 ; i <= n ;i++) {
			for(int j = 0 ; j <= 2 * m * n ; j++) {
				if(j - a[i-1]  > 2 * m * n || j - a[i-1] < 0) {
					dp[i][j] = dp[i-1][j];  
				}
				else {
					dp[i][j] = dp[i-1][j] + dp[i-1][j-a[i-1]];
				}
			}
		}
		
		long ans = dp[n][m*n];
		System.out.println(ans-1);
		
		
		
 			
		}

}
