
// This file is a "Hello, world!" in Java language by OpenJDK for wandbox.
import java.util.*;
import java.io.*;
import java.math.BigInteger;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	final long MOD = (long) 1e9 + 7;
	ArrayList<Integer>[] g;
	int N;
	int[] sz;
	long[] dp;
	long[] dp2;// 黒を含まない可能性

	long pow(long a, long n) {
		long ret = 1;
		for (; n > 0; n >>= 1, a = a * a % MOD) {
			if (n % 2 == 1) {
				ret = ret * a % MOD;
			}
		}
		return ret;
	}

	long inv(long a) {
		return pow(a, MOD - 2);
	}

	long expected_edges = 0;

	void dfs(int cur, int par) {
		sz[cur] = 1;
		for (int dst : g[cur]) {
			if (dst == par)
				continue;
			dfs(dst, cur);
			sz[cur] += sz[dst];
		}
		if (par != -1) {
			expected_edges += (1 - pow(inv(2), sz[cur])) * (1 - pow(inv(2), N - sz[cur])) % MOD;
			expected_edges %= MOD;
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		g = new ArrayList[N];
		for (int i = 0; i < N; ++i)
			g[i] = new ArrayList<>();
		sz = new int[N];
		dp = new long[N];
		dp2 = new long[N];
		for (int i = 0; i < N - 1; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			--a;
			--b;
			g[a].add(b);
			g[b].add(a);
		}
		dfs(0, -1);
		long p0 = pow(inv(2), N);// bb,bw,wb,ww (1/4+{1-(1/2)^2})-1
		long p1 = N * pow(inv(2), N) % MOD;
		long ans = ((expected_edges + 1-p0) - N * inv(2) % MOD + MOD) % MOD;
		ans = (ans + MOD) % MOD;
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}

// OpenJDK reference:
//   http://openjdk.java.net/

// Java language references:
//   http://docs.oracle.com/javase