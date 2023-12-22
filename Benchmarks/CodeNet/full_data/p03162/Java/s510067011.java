import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] p = new int[3][n];
        for(int i = 0; i < n; i++) {
        	p[0][i] = sc.nextInt();
        	p[1][i] = sc.nextInt();
        	p[2][i] = sc.nextInt();
        }

        System.out.println(solve(n, p));

    }



	private static int solve(int n, int[][] p) {
		int[][] dp = new int[3][n];

		for(int i = 0; i < 3; i++)
			dp[i][0] = p[i][0];

		for(int i = 1; i < n; i++) {
			for(int j = 0; j < 3; j++) {
				dp[j][i] = Math.max(dp[(j+1) % 3][i-1], dp[(j+2)%3][i-1]) + p[j][i];
			}
		}


		int mostHappy = Math.max(Math.max(dp[0][n-1], dp[1][n-1]), dp[2][n-1]);
		return mostHappy;

	}
}