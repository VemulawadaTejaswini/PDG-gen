import java.util.Arrays;
import java.util.Scanner;

public class Main {
	class SegmentTree {
		int n;
		int[] tree;

		// ////////////////////////////////////////////////
		// 要素数k(0~k-1)
		// ////////////////////////////////////////////////

		SegmentTree(int k) {
			this.n = Integer.highestOneBit(k) << 1;
			while (k <= (this.n >> 1))
				this.n = this.n >> 1;
			tree = new int[2 * this.n];
		}

		// ////////////////////////////////////////////////
		// 区間和
		// addは更新でなく加算なので注意
		// ////////////////////////////////////////////////

		void add(int key, int value) {
			add(1, 0, this.n, key, value);
		}

		void add(int k, int low, int high, int key, int value) {
			if (key < low || high <= key) {
				return;
			}
			if (low + 1 == high) {
				this.tree[k] += value;
				return;
			}
			int mid = (low + high) / 2;
			add(2 * k, low, mid, key, value);
			add(2 * k + 1, mid, high, key, value);
			this.tree[k] = this.tree[2 * k] + this.tree[2 * k + 1];
		}

		int sum(int left, int right) {
			return sum(1, 0, this.n, left, right);
		}

		int sum(int k, int low, int high, int left, int right) {
			if (right <= low || high <= left) {
				return 0;
			}
			if (high <= low) {
				return 0;
			}
			if (left == low && high == right) {
				return this.tree[k];
			}

			int mid = (low + high) / 2;
			int sum = 0;
			sum += sum(2 * k, low, Math.min(high, mid), left,
					Math.min(right, mid));
			sum += sum(2 * k + 1, Math.max(low, mid), high,
					Math.max(left, mid), right);
			return sum;
		}

		// ////////////////////////////////////////////////
		// 区間最大値
		// updateは加算でなく更新なので注意
		// ////////////////////////////////////////////////

		void update(int key, int value) {
			update(1, 0, this.n, key, value);
		}

		void update(int k, int low, int high, int key, int value) {
			if (key < low || high <= key) {
				return;
			}
			if (low + 1 == high) {
				this.tree[k] = value;
				return;
			}
			int mid = (low + high) / 2;
			update(2 * k, low, mid, key, value);
			update(2 * k + 1, mid, high, key, value);
			this.tree[k] = Math.max(this.tree[2 * k], this.tree[2 * k + 1]);
		}

		int max(int left, int right) {
			return max(1, 0, this.n, left, right);
		}

		int max(int k, int low, int high, int left, int right) {
			if (right <= low || high <= left) {
				return Integer.MIN_VALUE;
			}
			if (high <= low) {
				return Integer.MIN_VALUE;
			}
			if (left == low && high == right) {
				return this.tree[k];
			}

			int mid = (low + high) / 2;
			int max = Integer.MIN_VALUE;
			max = Math.max(
					max,
					max(2 * k, low, Math.min(high, mid), left,
							Math.min(right, mid)));
			max = Math.max(
					max,
					max(2 * k + 1, Math.max(low, mid), high,
							Math.max(left, mid), right));
			return max;
		}

		// ////////////////////////////////////////////////
		// 共通
		// ////////////////////////////////////////////////

		int get(int key) {
			return this.tree[this.tree.length - n + key];
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long x = sc.nextInt();
		SegmentTree seg = new SegmentTree(n);
		Arrays.fill(seg.tree, Integer.MIN_VALUE);
		for (int i = 0; i < n; i++) {
			seg.update(i, -sc.nextInt());
		}

		long sum = Long.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			long tmpSum = 0;
			for (int j = 0; j < n; j++) {
				int l = (j - i + n) % n;
				int r = j;
				long min = 0;
				if (l <= r) {
					min = -seg.max(l, r + 1);
				} else {
					min = -Math.max(seg.max(0, r + 1), seg.max(l, n));
				}
				tmpSum += min;
			}
			sum = Math.min(sum, tmpSum + x * i);
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
