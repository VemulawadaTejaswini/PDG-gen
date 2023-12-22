import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");
		int a[] = new int[100005];

		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(str[i]) + 1;

			a[value]++;
			a[value + 1]++;
			a[value - 1]++;
		}

		SegmentTree st = new SegmentTree(a);
		int ans = st.query(0, 100005);
		System.out.println(ans);
	}
}

class SegmentTree {

	// 元の配列もMAX_VALUEで初期化
	// MIN_VALUE,Math.maxで最大値を得られる

	int N;
	int[] origin;
	int[] tree;

	int INT_MAX = Integer.MIN_VALUE;

	SegmentTree(int[] original) {
		this.origin = Arrays.copyOf(original, original.length);
		int n = origin.length;
		this.N = 1;
		while (N < n)
			N *= 2;
		this.tree = new int[N * 2];
		for (int i = 0; i < N * 2; i++) {
			tree[i] = INT_MAX;
		}
		build();
	}

	// O(N)
	void build() {
		for (int i = 0; i < origin.length; i++) {
			update(i, origin[i]);
		}
	}

	// i番目の値をxに更新 O(log N)
	void update(int i, int x) {
		i += N - 1;
		tree[i] = x;
		while (i > 0) {
			i = (i - 1) / 2;
			tree[i] = marge(tree[i * 2 + 1], tree[i * 2 + 2]);
		}
	}

	// O(log N);
	int query(int start, int end) {
		return query(start, end, 0, 0, N);
	}

	// [a, b)の最小値、l, rにはノードkに対応する区間を与える
	private int query(int a, int b, int k, int l, int r) {
		if (r <= a || b <= l)
			return INT_MAX;

		if (a <= l && r <= b) {
			return tree[k];
		} else {
			int lv = query(a, b, 2 * k + 1, l, (l + r) / 2);
			int rb = query(a, b, 2 * k + 2, (l + r) / 2, r);
			return marge(lv, rb);
		}
	}

	private int marge(int l, int r) {
		return Math.max(l, r);
	}

}
