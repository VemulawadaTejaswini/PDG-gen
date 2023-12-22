import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [][]a = new int [n][3];
		
		for(int i = 0; i < n ;i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
			a[i][2] = sc.nextInt();
			
			}
		int [][]dp = new int [n+1][3];
		
		for(int i = 1; i <= n ;i++) {
			for(int j = 0; j < 3 ;j++) {
				dp[i][j] = Math.max(dp[i-1][(j+1)%3] + a[i-1][(j+1)%3], dp[i-1][(j+2)%3] + a[i-1][(j+2)%3]);
			}
		}
		int temp = Math.max(dp[n][0], dp[n][1]);
		int ans = Math.max(dp[n][2], temp);
		
		System.out.println(ans);
	}
		
}
