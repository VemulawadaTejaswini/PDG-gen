import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	private static final boolean TEST = false;

	public static void main(String[] args) {

		// 時間を0.5単位に計算できるようにするため、距離、時間を２倍にする
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n, l, t;
		n = in.nextInt();
		l = in.nextInt() * 2;
		t = in.nextInt() * 2;
		int[] x = new int[n];
		boolean[] w = new boolean[n];
		for (int i = 0; i < n; i++) {
			x[i] = in.nextInt() * 2;
			if (in.nextInt() == 1)
				w[i] = true;
		}
		solve(n, l, t, x, w);
		in.close();
	}

	private static void solve(int n, int l, int t, int[] x, boolean[] w) {

		// 衝突の発生する時間＋時計まわりに動いていた方の対象の番号をQUEUEする
		PriorityQueue<Long> pq = new PriorityQueue<>();
		int[] xt = new int[n];

		// 衝突の予定をQUEUE
		for (int i = 1; i < n; i++)
			if (w[i - 1] && !w[i])
				pq.add((long) getCrushTime(i - 1, n, l, x, xt, w) * 100000 + i - 1);
		if (w[n - 1] && !w[0])
			pq.add((long) getCrushTime(n - 1, n, l, x, xt, w) * 100000 + n - 1);

		while (!pq.isEmpty()) {
			long nx = pq.poll();
			int tc = (int) (nx / 100000);
			int nr = (int) (nx % 100000);
			int nl = (nr + 1) % n;
			if (TEST)
				System.out.println("---- " + nr + " " + nl + " T" + tc);
			if (tc >= t)
				break;

			// 衝突の処理
			x[nr] += tc - xt[nr];
			x[nr] %= l;
			x[nl] -= tc - xt[nl];
			x[nl] %= l;
			xt[nr] = tc;
			xt[nl] = tc;
			w[nr] = false;
			w[nl] = true;

			// 次回の衝突があればQUEUE
			int tmp = (nr - 1 + n) % n;
			if (w[tmp])
				pq.add((long) getCrushTime(tmp, n, l, x, xt, w) * 100000 + tmp);
			tmp = (nl + 1) % n;
			if (!w[tmp])
				pq.add((long) getCrushTime(nl, n, l, x, xt, w) * 100000 + nl);
		}
		// 結果出力
		for (int i = 0; i < n; i++) {
			if (w[i])
				System.out.println((x[i] + t - xt[i]) % l / 2);
			else
				System.out.println((x[i] - t + xt[i]) % l / 2);
		}
	}

	private static int getCrushTime(int nr, int n, int l, int[] x, int[] xt, boolean[] w) {
		// 衝突の相手
		int nl = (nr + 1) % n;
		// 一周した位置の補正
		int xr = x[nr];
		int xl = x[nl];
		if (xl < xr)
			xl += l;
		//
		int r = 0;
		if (xt[nr] > xt[nl]) {
			xl -= xt[nr] - xt[nl];
			r = xt[nr] + (xl - xr) / 2;
		} else {
			xr += xt[nl] - xt[nr];
			r = xt[nl] + (xl - xr) / 2;
		}
		if (TEST)
			System.out.println("-- " + nr + " " + nl + " T" + r);
		return r;
	}
}