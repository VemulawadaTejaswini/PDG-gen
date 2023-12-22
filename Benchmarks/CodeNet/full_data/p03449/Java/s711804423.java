import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int[][] A = new int[2][N];
		
		for(int i = 0 ; i < 2 ; i++){
			for(int j = 0 ; j < N ; j++){
				A[i][j] = scan.nextInt();
			}	
		}
		
		int[][] dp = new int[2][N];
		dp[0][0] = A[0][0];
		dp[1][0] = A[1][0]+dp[0][0] ;
		dp[0][1] = A[0][1]+dp[0][0] ;
		
		for(int j = 1 ; j < N-1 ; j++){
			dp[1][j+1] = dp[1][j+1] + dp[1][j]; 
			dp[2][j] = Math.max(dp[1][j] + dp[2][j], dp[2][j-1] + dp[2][j]);		
		}
		dp[2][N-1] = Math.max(dp[1][N-1] + dp[2][N-1], dp[2][N-2] + dp[2][N-1]);	
		
		System.out.println(dp[2][N-1]);
		
	}
}