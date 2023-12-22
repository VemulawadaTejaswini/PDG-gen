import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static int INF = Integer.MAX_VALUE/3;
	public static void main(String[] args) {
		int n = sc.nextInt();
		int ma = sc.nextInt();
		int mb = sc.nextInt();
		int[][][] dp = new int[41][401][401];
		for (int i = 0;i <= 40;i ++) {
			for (int j = 0;j <= 400;j++) {
				for (int k = 0;k <= 400;k++) {
					dp[i][j][k] = -1;
				}
			}
		}

		for (int i = 0;i < n;i++) {
			dp[i][0][0] = 0;
		}

		for (int i = 0;i < n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			for (int j = 0;j <= 400;j++) {
				for (int k = 0;k <= 400;k++) {
					int mc = dp[i][j][k];
					if (mc>=0) {
						int t = dp[i+1][j+a][k+b];
						if (t==-1) {
							dp[i+1][j+a][k+b] = mc+c;
						} else {
							dp[i+1][j+a][k+b] = Math.min(t, mc+c);
						}
					}
				}
			}
		}

		int ret = INF;
		for (int i = 1;i <= n;i++) {
			for (int j = 1;j <= 400;j++) {
				int a = j*ma;
				int b = j*mb;
				if (a<=400&&b<=400) {
					if (dp[i][a][b]!=-1) {
						ret = Math.min(ret, dp[i][a][b]);
					}
				}
			}
		}
		System.out.println(ret==INF?-1:ret);
	}
}
