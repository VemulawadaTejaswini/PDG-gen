import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		double[][] dp = new double[N+1][N+1];
		double[] p = new double[N+1];
		double answer = 0.0;
		for (int i = 1; i <= N; i++) {
			p[i] = input.nextDouble();
		}
		dp[1][1] = p[1];
		for (int i = 2; i <= N; i++) { //Filling diagonals of DP table
			dp[i][i] = dp[i-1][i-1]*p[i];
		}
		for (int j = 2; j <= N; j++) { //Filling 1st row of DP table
			dp[1][j] = dp[1][j-1]*(1.0-p[j]);
			if (j==2) dp[1][j]+=p[j]*(1.0-dp[1][j-1]);
			else dp[1][j]+=p[j]*(1.0-dp[j-1][j-1]-dp[1][j-1]);
		}
		for (int i = 2; i < N; i++) { //dp[N][N] is already filled, last row not necessary
			for (int j = i+1; j <= N; j++) {
				dp[i][j]=dp[i][j-1]*(1.0-p[j])+dp[i-1][j-1]*p[j]; 
			}
		}
		/*for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.print("\n");
		}*/
		for (int i = N/2+1; i <= N; i++) {
			answer+=dp[i][N];
		}
		System.out.println(answer);
	}
}