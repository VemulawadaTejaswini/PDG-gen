
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

	static MyReader sc = new MyReader();
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		int n = sc.nextInt();
		String s = sc.next();
		long[] color = new long[3];
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'R') {
				color[0]++;
			} else if(s.charAt(i) == 'G') {
				color[1]++;
			} else {
				color[2]++;
			}
		}
		long ans = color[0] * color[1] * color[2];
		for(int i = 1; i < n / 2 + 1; i++) {
			for(int j = 0; j < n; j++) {
				if(j + i * 2 >= n)
					break;
				char a = s.charAt(j), b = s.charAt(j + i), c = s.charAt(j + i * 2);
				if(a != b && b != c && a != c)
					ans--;
			}
		}
		out.println(ans);
		out.close();

	}

	//GCD
	static int GCD(int n, int m) {
		if(m > n)
			return GCD(m, n);
		if(n % m == 0)
			return m;
		else {
			return GCD(m, n % m);
		}
	}

}

class MyReader {
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static String[] line = new String[0];
	private static int num = 0;

	protected MyReader() {

	}

	private void nextline() throws IOException {
		String s = in.readLine();
		line = s.split(" ");
	}

	protected String next() throws IOException {
		if(num == line.length) {
			nextline();
			num = 0;
		}
		String ret = line[num];
		num++;
		return ret;
	}

	protected int nextInt() throws IOException {
		if(num == line.length) {
			nextline();
			num = 0;
		}
		int ret = Integer.valueOf(line[num]);
		num++;
		return ret;
	}

	protected long nextLong() throws IOException {
		if(num == line.length) {
			nextline();
			num = 0;
		}
		long ret = Long.valueOf(line[num]);
		num++;
		return ret;
	}

}

// 組み合わせ計算
class Combination {
	public static int MAX = 510000;
	public static int MOD = 1000000007;

	public static long[] f = new long[MAX];
	public static long[] finv = new long[MAX];
	public static long[] inv = new long[MAX];

	protected Combination() {
		f[0] = f[1] = 1;
		finv[0] = finv[1] = 1;
		inv[1] = 1;
		for(int i = 2; i < MAX; i++) {
			f[i] = f[i - 1] * i % MOD;
			inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
			finv[i] = finv[i - 1] * inv[i] % MOD;
		}
	}

	public static long Com(int n, int k) {
		if(n < k)
			return 0;
		if(n < 0 || k < 0)
			return 0;
		return f[n] * (finv[k] * finv[n - k] % MOD) % MOD;
	}

	public static long Inverse(int n) {
		return inv[n];
	}

	public static long Factorial(int n) {
		return f[n];
	}
}

// union-find木
class UnionFind {
	private int[] parent;
	private int[] depth;
	private int[] size;

	protected UnionFind(int n) {
		super();
		parent = new int[n];
		for(int i = 0; i < n; i++) {
			parent[i] = i;
		}
		depth = new int[n];
		size = new int[n];
		for(int i = 0; i < n; i++) {
			depth[i] = 1;
			size[i] = 1;
		}
	}

	public int Parent(int n) {
		if(parent[n] == n) {
			return n;
		} else {
			return Parent(parent[n]);
		}
	}

	public void Union(int a, int b) {
		int pa = Parent(a);
		int pb = Parent(b);
		if(pa != pb) {
			if(depth[pa] > depth[pb]) {
				parent[pb] = pa;
				size[pa] += pb;
			} else if(depth[pa] == depth[pb]) {
				parent[pb] = pa;
				size[pa] += pb;
				depth[pa]++;
			} else {
				parent[pa] = pb;
				size[pb] += pa;
			}
		}
	}

	public int Size(int n) {
		return size[Parent(n)];
	}

}