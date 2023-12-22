import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Ma = sc.nextInt();
		int Mb = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		sc.close();
		int n = 401;

		int[][][] dp = new int[N + 1][n][n];
		dp[0][0][0] = 1;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < n; k++) {
					int A = j + a[i];
					int B = k + b[i];
					if(dp[i][j][k] != 0) {
						dp[i + 1][j][k] = dp[i][j][k];
						if(dp[i + 1][A][B] == 0) {
							dp[i + 1][A][B] = dp[i][j][k] + c[i];
						}else {
							dp[i + 1][A][B] = Math.min(dp[i + 1][A][B], dp[i][j][k] + c[i]);
						}
					}
				}
			}
		}
		for(int i = 0; i <= N; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < n; k++) {
					if(dp[i][j][k] != 0) {
						dp[i][j][k]--;
					}
				}
			}
		}
		int init = 100000000;
		int min = init;

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(dp[N][i][j] != 0 && Ma * j == Mb * i) {
					min = Math.min(min, dp[N][i][j]);
				}
			}
		}
		if(min == init) min = -1;
		System.out.println(min);
	}
}