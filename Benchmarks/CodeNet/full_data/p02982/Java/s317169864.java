import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		int[][] X = new int[n][d];
		int idx_n;
		int idx_d;
		for (idx_n = 0; idx_n < n; idx_n++) {
			for (idx_d = 0; idx_d < d; idx_d++) {
				X[idx_n][idx_d] = Short.parseShort(sc.next());
			}
		}

		int ans = 0;
		// 点x1とx2の(x1<x2)比較
		int x1;
		int x2;
		double dist;
		double distInt;
		for (x1 = 0; x1 < n - 1; x1++) {
			for (x2 = x1 + 1; x2 < n; x2++) {
				dist = calcDist(X[x1], X[x2], d);
				distInt = Math.round(dist);
				if (dist - distInt == 0.0) {
					++ans;
				}
			}
		}

		System.out.println(ans);

	}

	public static double calcDist(int[] x1, int[] x2, int d) {
		double dist = 0.0;
		int dist2 = 0;
		int idx = 0;

		for (idx = 0; idx < d; idx++) {
			dist2 += (x1[idx] - x2[idx]) * (x1[idx] - x2[idx]);
		}
		dist = Math.sqrt((double) dist2);

		return dist;
	}
}
