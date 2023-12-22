
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		/*
		 * int b[] = new int[n]; int w[] = new int[n];
		 * 
		 * for(int i =0 ; i < n ; i++){ String c = sc.next(); int a =
		 * sc.nextInt()-1; if(c.startsWith("B")){ b[a] = i; }else{ w[a] = i; } }
		 */
		int[] b = new int[2 * n];
		int[] w = new int[2 * n];

		int[] ib = new int[n + 1];
		int[] iw = new int[n + 1];

		for (int i = 0; i < n * 2; i++) {
			String c = sc.next();
			int a = sc.nextInt();
			if (c.startsWith("B")) {
				b[i] = a;
				w[i] = -1;
				ib[a] = i;
			} else {
				w[i] = a;
				b[i] = -1;
				iw[a] = i;
			}
		}

		int[][] bbb = new int[n * 2 +1][n];
		int[][] www = new int[n * 2 +1][n];
		for (int i = 0; i < n * 2; i++) {
			for (int j = 0; j < n; j++) {
				if (b[i] > 0 && b[i] <= j + 1) {
					bbb[i+1][j] = bbb[i ][j] + 1;
				} else {
					bbb[i+1][j] = bbb[i ][j];
				}
				if (w[i] > 0 && w[i] <= j + 1) {
					www[i+1][j] = www[i ][j] + 1;
				} else {
					www[i+1][j] = www[i ][j];
				}
			}
		}

		System.out.println(Arrays.deepToString(bbb));
		System.out.println(Arrays.deepToString(www));
		int dp[][] = new int[n + 1][n + 1];


		for (int i = 0; i < n + 1; i++) {
			Arrays.fill(dp[i], Integer.MAX_VALUE / 3);
		}

		dp[0][0] = 0;
		for (int i = 0; i < 2 * n; i++) {

			for (int bb = Math.max(0, i - n); bb <= i && bb <= n; bb++) {
				int ww = i - bb;

				// System.out.println(i+" "+bb+" "+ ww);
				// b

				if (bb < n) {
					int ibx = ib[bb + 1];
					int ibx2 = ibx - (ww+bb -  (ibx - www[ibx][Math.min(ww,n-1)] - bbb[ibx][bb]));
					int scb = ibx - www[ibx2][Math.min(ww,n-1)] - bbb[ibx2][bb];
					dp[bb + 1][ww] = Math.min(dp[bb + 1][ww], dp[bb][ww] + scb);
				}
				if (ww < n) {
					int iwx = iw[ww + 1];
					int iwx2 = iwx - (ww+bb-(iwx - www[iwx][ww] - bbb[iwx][Math.min(bb,n-1)]));
					int scw = iwx - www[iwx][ww] - bbb[iwx][Math.min(bb,n-1)];
					dp[bb][ww + 1] = Math.min(dp[bb][ww + 1], dp[bb][ww] + scw);
				}
			}
		}
		System.out.println(dp[n][n]);

	}

}