import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short h = Short.parseShort(sc.next());
		short w = Short.parseShort(sc.next());

		char[][] a = new char[h][w];
		for (int i = 0; i < h; i++) {
			a[i] = sc.next().toCharArray();
		}

		short[][][][] dp = new short[17][h][h][w];
		boolean cflag;
		char tmps;

		for (int i = w - 1; i >= 0; i--) {//w1
			for (int j = 0; j < h; j++) {//h1
				if (i == w - 1) {
					dp[0][j][j][i] = (short) (w - 1);
					continue;
				}
				if (a[j][i] == a[j][i + 1]) {
					dp[0][j][j][i] = dp[0][j][j][i + 1];
				} else {
					dp[0][j][j][i] = (short) i;
				}
			}
		}

		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h - 1; j++) {
				tmps = a[j][i];
				cflag = false;
				for (int k = j + 1; k < h; k++) {
					if (cflag == false && a[k][i] != tmps) {
						cflag = true;
					}
					if (cflag == true) {
						dp[0][j][k][i] = -1;
						continue;
					}
					dp[0][j][k][i] = (short) Math.min(dp[0][j][k - 1][i], dp[0][k][k][i]);
				}
			}
		}
		short tmpw;
		short tmp = -1;

		for (int i = 1; i < 17; i++) {
			for (int j = 0; j < w; j++) {//w1
				for (int k = 0; k < h; k++) {//h1
					tmpw = dp[i - 1][k][k][j];
					dp[i][k][k][j] = tmpw == w - 1 ? (short) (w - 1) : dp[i - 1][k][k][tmpw + 1];
					for (int l = k + 1; l < h; l++) {//h2
						tmpw = dp[i - 1][k][l][j];
						if (tmpw == w - 1) {
							dp[i][k][l][j] = (short)(w-1);
							continue;
						}
						if (tmpw != -1) {
							dp[i][k][l][j] = (short) Math.max(dp[i - 1][k][l][j], dp[i - 1][k][l][tmpw+1]);
							continue;
						}
						tmp = -1;
						for (int m = k; m < l; m++) {
							tmp = (short) Math.max(tmp, (short) Math.min(dp[i - 1][k][m][j], dp[i - 1][m + 1][l][j]));
						}
						dp[i][k][l][j] = tmp;
					}
				}
			}
		}
//		for (int i = 0; i < h; i++) {
//			for (int j = i; j < h; j++) {
//				for (int k = 0; k < w; k++) {
//					System.out.print(i + "," + j + "," + k + " ");
//					for (int l = 0; l < 5; l++) {
//						System.out.print(dp[l][i][j][k] + ",");
//					}
//					System.out.println();
//				}
//			}
//		}
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
