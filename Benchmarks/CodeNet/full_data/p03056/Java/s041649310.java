import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		char[][] a = new char[h][w];
		for (int i = 0; i < h; i++) {
			a[i] = sc.next().toCharArray();
		}

		int[][][][] dp = new int[17][h][h][w];
		int csum;
		char tmps;
		int cnt;
		int cslog;

		for (int i = 0; i < w; i++) {//w1
			for (int j = 0; j < h; j++) {//h1
				tmps = a[j][i];
				csum = 0;
				for (int k = j; k < h; k++) {//h2
					if (tmps != a[k][i]) {
						csum++;
						tmps = a[k][i];
					}
					cslog = (int) Math.ceil(Math.log(csum + 1) / Math.log(2));
					if (cslog != 0) {
						for (int l = 0; l < cslog; l++) {
							dp[l][j][k][i] = -1;
						}
					}

					cnt = 0;
					check: for (int l = i + 1; l < w; l++) {
						for (int m = j; m <= k; m++) {
							if (a[m][l] != a[m][i]) {
								break check;
							}
						}
						cnt++;
					}

					dp[cslog][j][k][i] = i + cnt;

				}
			}
		}
//		for (int i = 0; i < h; i++) {
//			for (int j = i; j < h; j++) {
//				for (int k = 0; k < w; k++) {
//					System.out.print(i + "," + j + "," + k + " ");
//					for (int l = 0; l < 4; l++) {
//						System.out.print(dp[l][i][j][k] + ",");
//					}
//					System.out.println();
//				}
//			}
//		}

		int tmpw;

		for (int i = 1; i < 20; i++) {
			for (int j = 0; j < h; j++) {
				for (int k = j; k < h; k++) {
					for (int l = 0; l < w; l++) {
						tmpw = dp[i - 1][j][k][l];
						if (tmpw == w - 1) {
							dp[i][j][k][l] = tmpw;
							continue;
						}
						if (tmpw == -1) {
							continue;
						}
						if (dp[i - 1][j][k][tmpw + 1] == -1) {
							dp[i][j][k][l] = tmpw;
							continue;
						}
						dp[i][j][k][l] = dp[i - 1][j][k][tmpw + 1];
					}
				}
			}
		}

		int ans = 0;
		while (true) {
			if (dp[ans][0][h - 1][0] == w - 1) {
				break;
			}
			ans++;
		}
		System.out.println(ans);

	}

}
