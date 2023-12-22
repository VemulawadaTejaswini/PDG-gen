import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			Obj o = new Obj();
			o.x = Integer.parseInt(sa[0]);
			o.d = Integer.parseInt(sa[1]);
			arr[i] = o;
		}
		br.close();

		Arrays.parallelSort(arr, (o1, o2) -> o1.x - o2.x);
		long[] dp = new long[n + 1];
		dp[n] = 1;
		SegmentTree st = new SegmentTree(n + 1);
		for (int i = 0; i < n; i++) {
			st.update(i, i + 1);
		}
		st.update(n, n);
		for (int i = n - 1; i >= 0; i--) {
			int xd = arr[i].x + arr[i].d;
			int idx = binarySearch(arr, xd);
			int max = st.query(Math.min(idx, i + 1), idx + 1);
			st.update(i, max);
			dp[i] = dp[i + 1] + dp[max];
			dp[i] %= 998244353;
		}
		System.out.println(dp[0]);
	}

	static class SegmentTree {
		// 親へのアクセス：(n - 1) / 2
		// 子へのアクセス：n * 2 + 1、n * 2 + 2
		int n = 2; // 要素（葉）の数
		int n2; // 全ノード数
		int[] arr;

		/**
		 * 初期化 O(2*N)
		 * @param n 要素（葉）の数 ※2べき
		 */
		public SegmentTree(int x) {
			while (n < x) {
				n <<= 1;
			}
			n2 = n * 2 - 1;
			arr = new int[n2];
		}

		/**
		 * 更新 O(logN)
		 * @param i インデックス（0～n-1）
		 * @param x 更新値
		 */
		void update(int i, int x) {
			i += n - 1; // arr上でのインデックス
			arr[i] = x;
			while (i > 0) {
				i = (i - 1) / 2;
				arr[i] = Math.max(arr[i * 2 + 1], arr[i * 2 + 2]);
			}
		}

		int query(int l, int r) {
			return query(l, r, 0, 0, n);
		}

		/**
		 * 取得 O(logN)
		 * インデックスa以上b未満の区間の最大値、l, rにはノードkに対応する区間
		 * query(a, b, 0, 0, n);
		 */
		int query(int a, int b, int k, int l, int r) {
			if (r <= a || b <= l) return 0; // 交差しない
			if (a <= l && r <= b) return arr[k]; // 完全に含む
			int v1 = query(a, b, k * 2 + 1, l, (l + r) / 2);
			int v2 = query(a, b, k * 2 + 2, (l + r) / 2, r);
			return Math.max(v1, v2);
		}
	}

	static int binarySearch(Obj[] arr, long val) {
		int ng = 0;
		int ok = arr.length;

		while (Math.abs(ok - ng) > 1) {
			int mid = (ok + ng) / 2;
			if (arr[mid].x >= val) {
				ok = mid;
			} else {
				ng = mid;
			}
		}
		return ng;
	}

	static class Obj {
		int x, d;
	}
}
