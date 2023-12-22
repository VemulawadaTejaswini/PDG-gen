import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static int INF = Integer.MAX_VALUE/3;
	public static void main(String[] args) {
		int n = sc.nextInt();
		int ma = sc.nextInt();
		int mb = sc.nextInt();
		int[][] dp = new int[401][401];
		for (int i = 0;i < 401;i++) {
			for (int j = 0;j < 401;j++) {
				dp[i][j] = INF;
			}
		}

		dp[0][0] = 0;

		for (int i = 0;i < n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			for (int j = 0;j < 401-a;j++) {
				for (int k = 0;k < 401-b;k++) {
					int t = dp[j][k];
					if (t!=INF) {
						dp[j+a][k+b] = Math.min(dp[j+a][k+b],t+c);
					}
				}
			}
		}

		int ret = INF;

		for (int i = 1;i < 401;i++) {
			int a = i*ma;
			int b = i*mb;
			if (a<401&&b<401) {
				ret = Math.min(ret,dp[a][b]);
			}
		}

		System.out.println(ret==INF?-1:ret);
	}
}
