import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.NoSuchElementException;

final class UnionFindRoot {
	int l;
	int r;

	UnionFindRoot(int left, int right) {
		l = left;
		r = right;
	}

	UnionFindRoot combine(UnionFindRoot another) {
		return new UnionFindRoot(min(l, another.l), max(r, another.r));
	}

	private int min(int a, int b) {
		return a < b ? a : b;
	}

	private int max(int a, int b) {
		return a > b ? a : b;
	}

	@Override
	public String toString() {
		return "Root[" + l + ", " + r + "]";
	}
}

final class UnionFind2 {
	int[] parent;
	int[] rank;
	UnionFindRoot[] root;

	public UnionFind2(int n) {
		parent = new int[n];
		root = new UnionFindRoot[n];
		rank = new int[n];

		for (int i = 0; i < n; i++) {
			parent[i] = i;
			root[i] = new UnionFindRoot(i, i);
		}
	}

	public int find(int i) {
		int p = parent[i];
		if (i == p) {
			return i;
		}
		return parent[i] = find(p);
	}

	public UnionFindRoot findRoot(int i) {
		int p = parent[i];
		if (i == p) {
			return root[i];
		}
		return root[parent[i] = find(p)];
	}

	public void union(int i, int j) {
		int root1 = find(i);
		int root2 = find(j);

		if (root2 == root1)
			return;

		UnionFindRoot newRoot = root[root1].combine(root[root2]);

		if (rank[root1] > rank[root2]) {
			parent[root2] = root1;
			root[root1] = newRoot;
		} else if (rank[root2] > rank[root1]) {
			parent[root1] = root2;
			root[root2] = newRoot;
		} else {
			parent[root2] = root1;
			root[root1] = newRoot;
			rank[root1]++;
		}
	}
}

public class Main {
	private static void solve() {
		int n = nei();
		int[] a = new int[n];
		int[] is = new int[n + 1];
		for (int i = 0; i < n; i++) {
			a[i] = nei();
			is[a[i]] = i;
		}
		UnionFind2 uf = new UnionFind2(n);
		long sum = n;
		int idx = is[n];
		boolean[] visit = new boolean[n];
		visit[idx] = true;
		for (int i = n - 1; i >= 1; i--) {
			idx = is[i];
			visit[idx] = true;
			if (idx > 0 && visit[idx - 1]) {
				uf.union(idx, idx - 1);
			}
			if (idx < n - 1 && visit[idx + 1]) {
				uf.union(idx, idx + 1);
			}
			UnionFindRoot root = uf.findRoot(idx);
			long num = (idx - root.l + 1) * (root.r - idx + 1);
			sum += num * i;
		}
		out(sum);
	}

	static BigInteger combination(int a, int b, BigInteger mod) {
		BigInteger q = BigInteger.ONE;
		BigInteger p = BigInteger.ONE;
		for (int i = a - b + 1; i <= a; i++) {
			q = q.multiply(BigInteger.valueOf(i)).mod(mod);
		}
		for (int j = 1; j <= b; j++) {
			p = p.multiply(BigInteger.valueOf(j)).mod(mod);
		}
		return q.multiply(p.modInverse(mod)).mod(mod);
	}

	static int abs(int x) {
		return x < 0 ? -x : x;
	}

	static int gcd(int x, int y) {
		if (x < y) {
			x ^= y;
			y ^= x;
			x ^= y;
		}
		int z = x % y;
		if (z == 0)
			return y;
		return gcd(y, z);
	}

	static int clamp(int a, int min, int max) {
		return a < min ? min : a > max ? max : a;
	}

	static int max(int a, int b) {
		return a > b ? a : b;
	}

	static int min(int a, int b) {
		return a < b ? a : b;
	}

	static long max(long a, long b) {
		return a > b ? a : b;
	}

	static long min(long a, long b) {
		return a < b ? a : b;
	}

	static void out(String val) {
		IO.out(val);
	}

	static void out(int val) {
		IO.out(String.valueOf(val));
	}

	static void out(long val) {
		IO.out(String.valueOf(val));
	}

	static void out(char val) {
		IO.out(String.valueOf(val));
	}

	static void out(float val) {
		IO.out(String.valueOf(val));
	}

	static void out(double val) {
		IO.out(String.valueOf(val));
	}

	static void out(boolean val) {
		IO.out(String.valueOf(val));
	}

	static String nes() {
		return IO.next();
	}

	static int nei() {
		return IO.nextInt();
	}

	static long nel() {
		return IO.nextLong();
	}

	static int parseInt(String val) {
		return Integer.parseInt(val);
	}

	static int parseInt(char val) {
		return Integer.parseInt(String.valueOf(val));
	}

	static long parseLong(String val) {
		return Long.parseLong(val);
	}

	public static void main(String[] args) {
		solve();
		IO.flush();
	}
}

final class RMQ {
	int[] dat;
	int h;
	int n;

	RMQ(int num) {
		h = 0;
		while ((1 << h) < num)
			h++;
		n = 1 << h;
		int size = 2 * n - 1;
		dat = new int[size];
		for (int i = 0; i < size; i++) {
			dat[i] = 2147483647;
		}
	}

	void update(int i, int x) {
		i += n - 1;
		dat[i] = x;
		while (i > 0) {
			i = i - 1 >> 1;
			dat[i] = min(dat[i * 2 + 1], dat[i * 2 + 2]);
		}
	}

	void update(int[] xs, int offset) {
		int i = n - 1 + offset;
		int num = xs.length;
		for (int j = 0; j < num; j++) {
			dat[i + j] = xs[j];
		}
		for (int j = n - 2; j >= 0; j--) {
			dat[j] = min(dat[j * 2 + 1], dat[j * 2 + 2]);
		}
	}

	int query(int a, int b, int k, int l, int r) {
		if (r <= a || b <= l)
			return 2147483647;
		if (a <= l && r <= b)
			return dat[k];
		int vl = query(a, b, k * 2 + 1, l, l + r >> 1);
		int vr = query(a, b, k * 2 + 2, l + r >> 1, r);
		return min(vl, vr);
	}

	int min(int x, int y) {
		return x < y ? x : y;
	}
}

final class UnionFind {
	int[] data;

	UnionFind(int n) {
		data = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = -1;
		}
	}

	boolean union(int x, int y) {
		x = root(x);
		y = root(y);
		if (x == y)
			return false;
		if (data[y] < data[x]) {
			x ^= y;
			y ^= x;
			x ^= y;
		}
		data[x] += data[y];
		data[y] = x;
		return true;
	}

	boolean find(int x, int y) {
		return root(x) == root(y);
	}

	int root(int x) {
		return data[x] < 0 ? x : (data[x] = root(data[x]));
	}

	int size(int x) {
		return -data[root(x)];
	}
}

final class IO {
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out, false);
	private static final byte[] buffer = new byte[1024];
	private static int ptr = 0;
	private static int len = 0;

	private static boolean hasNextByte() {
		if (ptr < len)
			return true;
		ptr = 0;
		try {
			len = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return len > 0;
	}

	private static int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	static boolean hasNext() {
		byte c;
		while (hasNextByte() && ((c = buffer[ptr]) < '!' || c > '~'))
			ptr++;
		return hasNextByte();
	}

	static String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (b >= '!' && b <= '~') {
			sb.append((char) b);
			b = readByte();
		}
		return sb.toString();
	}

	static long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		int sign = 1;
		int b = readByte();
		if (b == '-') {
			sign = -1;
			b = readByte();
		}
		if (b < '0' || '9' < b)
			throw new NumberFormatException();
		while (true) {
			if ('0' <= b && b <= '9')
				n = n * 10 + b - '0';
			else if (b == -1 || b < '!' || b > '~')
				return n * sign;
			else
				throw new NumberFormatException();
			b = readByte();
		}
	}

	static int nextInt() {
		if (!hasNext())
			throw new NoSuchElementException();
		int n = 0;
		int sign = 1;
		int b = readByte();
		if (b == '-') {
			sign = -1;
			b = readByte();
		}
		if (b < '0' || '9' < b)
			throw new NumberFormatException();
		while (true) {
			if ('0' <= b && b <= '9')
				n = n * 10 + b - '0';
			else if (b == -1 || b < '!' || b > '~')
				return n * sign;
			else
				throw new NumberFormatException();
			b = readByte();
		}
	}

	static void out(String val) {
		out.println(val);
	}

	static void flush() {
		out.flush();
	}
}