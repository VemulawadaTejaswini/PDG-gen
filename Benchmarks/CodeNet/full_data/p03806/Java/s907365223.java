import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static int INF = Integer.MAX_VALUE/3;
	public static void main(String[] args) {
		int n = sc.nextInt();
		int ma = sc.nextInt();
		int mb = sc.nextInt();
		int[][] dp = new int[1010][1010];
		for (int i = 0;i <= 1000;i++) {
			for (int j = 0;j <= 1000;j++) {
				dp[i][j] = -1;
			}
		}
		dp[0][0] = 0;

		for (int i = 0;i < n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			for (int j = 0;j < 1000;j++) {
				for (int k = 0;k < 1000;k++) {
					int mc = dp[j][k];
					if (mc>=0) {
						int t = dp[j+a][k+b];
						if (t==-1) {
							dp[j+a][k+b] = mc+c;
						} else {
							dp[j+a][k+b] = Math.min(t, mc+c);
						}
					}
				}
			}
		}

		int ret = INF;
		for (int i = 1;i <= 400;i++) {
			int a = i*ma;
			int b = i*mb;
			if (a<1000&&b<1000) {
				if (dp[a][b]!=-1) {
					ret = Math.min(ret, dp[a][b]);
				}
			}
		}
		System.out.println(ret==INF?-1:ret);
	}
}
