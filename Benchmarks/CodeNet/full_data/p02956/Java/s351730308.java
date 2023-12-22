import java.io.*;
import java.util.Arrays;
import java.util.SplittableRandom;

public class Main {
	static FastScanner sc = new FastScanner(System.in);
	static final long MOD = 998244353;
	static long[] pow2;
	static int N;

	public static void main(String[] args) {
		N = sc.nextInt();
		pow2 = new long[N + 1];
		pow2[0] = 1;
		for (int i = 0; i < N; i++) {
			pow2[i + 1] = pow2[i] * 2;
			if (pow2[i + 1] >=MOD) pow2[i + 1] -= MOD;
		}
		for (int i = 0; i <= N; i++) {
			pow2[i] = pow2[i] - 1;
		}
		Point[] ps = new Point[N];
		for (int i = 0; i < N; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			ps[i] = new Point(X, Y);
		}
		Arrays.sort(ps, (p1, p2) -> Integer.compare(p1.y, p2.y));
		for (int i = 0; i < N; i++) {
			ps[i].yi = i;
		}
		Arrays.sort(ps, (p1, p2) -> Integer.compare(p1.x, p2.x));
		long ans = count(ps);
		for (int i = 1; i < N; i++) {
			ans += pow2[i] * 4;
		}
		ans %= MOD;
		System.out.println((N * pow2[N] + MOD - ans) % MOD);
	}

	static long count(Point[] ps) {
		RBST<Integer> set = new RBST<>();
		long ret = 0;
		for (int i = 0; i < N; i++) {
			int lower = set.rank(ps[i].y);
			int upper = i - lower;
			int lower2 = ps[i].yi - lower;
			int upper2 = N - 1 - i - lower2;
			ret += MOD - pow2[upper];
			ret += MOD - pow2[lower];
			ret += MOD - pow2[upper2];
			ret += MOD - pow2[lower2];
			set.insert(ps[i].y);
		}
		ret %= MOD;
		return ret;
	}

	static class Point {
		int x, y, yi;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static class RBST<T extends Comparable<T>> {
		SplittableRandom rnd = new SplittableRandom(42);
		Node root;

		void insert(T v) {
			root = insert(root, v);
		}

		// return new root
		Node insert(Node node, T v) {
			if (node == null) return new Node(v);
			if (rnd.nextInt(node.size + 1) == 0) return insertRoot(node, v);
			if (v.compareTo(node.val) < 0) {
				node.left = insert(node.left, v);
			} else {
				node.right = insert(node.right, v);
			}
			node.fixSize();
			return node;
		}

		Node insertRoot(Node node, T v) {
			if (node == null) return new Node(v);
			if (v.compareTo(node.val) < 0) {
				node.left = insertRoot(node.left, v);
				return rotateRight(node);
			} else {
				node.right = insertRoot(node.right, v);
				return rotateLeft(node);
			}
		}

		Node rotateRight(Node node) {
			Node top = node.left;
			Node mid = node.left.right;
			top.right = node;
			node.left = mid;
			node.fixSize();
			top.fixSize();
			return top;
		}

		Node rotateLeft(Node node) {
			Node top = node.right;
			Node mid = node.right.left;
			top.left = node;
			node.right = mid;
			node.fixSize();
			top.fixSize();
			return top;
		}

		Node find(T v) {
			if (root == null) return null;
			Node cur = root;
			while (cur != null) {
				int compare = v.compareTo(cur.val);
				if (compare == 0) return cur;
				if (compare < 0) {
					cur = cur.left;
				} else {
					cur = cur.right;
				}
			}
			return null;
		}

		int rank(T v) {
			if (root == null) return 0;
			Node cur = root;
			int ret = 0;
			while (cur != null) {
				int compare = v.compareTo(cur.val);
				if (compare == 0) return ret;
				if (compare < 0) {
					cur = cur.left;
				} else {
					if (cur.left != null) ret += cur.left.size;
					ret += 1;
					cur = cur.right;
				}
			}
			return ret;
		}

		void remove(T v) {
			root = remove(root, v);
		}

		Node remove(Node node, T v) {
			if (node == null) throw new RuntimeException("not found");
			int compare = v.compareTo(node.val);
			if (compare == 0) {
				return join(node.left, node.right);
			}
			if (compare < 0) {
				node.left = remove(node.left, v);
			} else {
				node.right = remove(node.right, v);
			}
			node.fixSize();
			return node;
		}

		Node join(Node left, Node right) {
			if (left == null) return right;
			if (right == null) return left;
			if (rnd.nextInt(left.size + right.size) < left.size) {
				left.right = join(left.right, right);
				left.fixSize();
				return left;
			} else {
				right.left = join(left, right.left);
				right.fixSize();
				return right;
			}
		}

		int size() {
			return root == null ? 0 : root.size;
		}

		int height() {
			return root == null ? 0 : root.height();
		}

		class Node {
			T val;
			Node left, right;
			int size;

			Node(T v) {
				this.val = v;
				this.size = 1;
			}

			int height() {
				int lh = left == null ? 0 : left.height();
				int rh = right == null ? 0 : right.height();
				return Math.max(lh, rh) + 1;
			}

			void fixSize() {
				this.size = 1 + (left == null ? 0 : left.size) + (right == null ? 0 : right.size);
			}

			void print(int level) {
				if (left != null) left.print(level + 1);
				for (int i = 0; i < level * 2; ++i) {
					System.out.print(" ");
				}
				System.out.println(val);
				if (right != null) right.print(level + 1);
			}

		}
	}

	static class FastScanner {
		Reader input;

		FastScanner() {
			this(System.in);
		}

		FastScanner(InputStream stream) {
			this.input = new BufferedReader(new InputStreamReader(stream));
		}

		int nextInt() {
			return (int) nextLong();
		}

		long nextLong() {
			try {
				int sign = 1;
				int b = input.read();
				while ((b < '0' || '9' < b) && b != '-' && b != '+') {
					b = input.read();
				}
				if (b == '-') {
					sign = -1;
					b = input.read();
				} else if (b == '+') {
					b = input.read();
				}
				long ret = b - '0';
				while (true) {
					b = input.read();
					if (b < '0' || '9' < b) return ret * sign;
					ret *= 10;
					ret += b - '0';
				}
			} catch (IOException e) {
				e.printStackTrace();
				return -1;
			}
		}

		double nextDouble() {
			try {
				double sign = 1;
				int b = input.read();
				while ((b < '0' || '9' < b) && b != '-' && b != '+') {
					b = input.read();
				}
				if (b == '-') {
					sign = -1;
					b = input.read();
				} else if (b == '+') {
					b = input.read();
				}
				double ret = b - '0';
				while (true) {
					b = input.read();
					if (b < '0' || '9' < b) break;
					ret *= 10;
					ret += b - '0';
				}
				if (b != '.') return sign * ret;
				double div = 1;
				b = input.read();
				while ('0' <= b && b <= '9') {
					ret *= 10;
					ret += b - '0';
					div *= 10;
					b = input.read();
				}
				return sign * ret / div;
			} catch (IOException e) {
				e.printStackTrace();
				return Double.NaN;
			}
		}

		char nextChar() {
			try {
				int b = input.read();
				while (Character.isWhitespace(b)) {
					b = input.read();
				}
				return (char) b;
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}

		String nextStr() {
			try {
				StringBuilder sb = new StringBuilder();
				int b = input.read();
				while (Character.isWhitespace(b)) {
					b = input.read();
				}
				while (b != -1 && !Character.isWhitespace(b)) {
					sb.append((char) b);
					b = input.read();
				}
				return sb.toString();
			} catch (IOException e) {
				e.printStackTrace();
				return "";
			}
		}

	}
}
