
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

public class Main implements Runnable {
	public static void main(String[] args) {
		// long t = System.currentTimeMillis();
		new Thread(null, new Main(), "", Runtime.getRuntime().maxMemory()).start();
		// System.err.println(System.currentTimeMillis() - t);
	}

	// 2
	int K;
	int[] p10 = new int[100001];
	int max = 100;

	public void run() {
		// 和xで余り0を構成できるか

		Scanner sc = new Scanner();
		 K = sc.nextInt();
//		for (int K = 100000; K >= 2; --K) {
			solve(K);
//		}
	}

	void solve(int K_) {
		K = K_;
		p10[0] = 1;
		for (int i = 1; i < p10.length; ++i) {
			p10[i] = p10[i - 1] * 10 % K;
		}
		int ans = Integer.MAX_VALUE / 3;
		ans = Math.min(ans, g(1000, 0, 0, f(K)));
		System.out.println(ans);
	}

	HashMap<List<Integer>, Integer> memo = new HashMap<>();
	int cand = Integer.MAX_VALUE / 3;

	int g(int x, int y, int z, int cutoff) {
		cutoff = Math.min(cutoff, cand);
		if (cutoff < 0)
			return Integer.MAX_VALUE / 3;
		if (x == 0) {
			if (z == 1 && y == 0)
				return 0;
			else
				return Integer.MAX_VALUE / 3;
		}
		if (memo.containsKey(Arrays.asList(x, y, z))) {
			return memo.get(Arrays.asList(x, y, z));
		}
		int ret = Integer.MAX_VALUE / 3;
		for (int i = 1; i <= 9; ++i) {
			int add = p10[x] * i % K;
			ret = Math.min(ret, i + g(x - 1, (y - add + K) % K, z | 1, cutoff - i));
		}
		ret = Math.min(ret, g(x - 1, y, z, cutoff));
		memo.put(Arrays.asList(x, y, z), ret);
		if (z == 0 && y == 0) {
			cand = Math.min(cand, ret);
		}
		return ret;
	}

	// g(i,j)=桁数iで%K=jとなる時の桁和のmin
	// i<=20
	// j<=10^5
	int f(long v) {
		int ret = 0;
		while (v > 0) {
			ret += v % 10;
			v /= 10;
		}
		return ret;
	}

	class Scanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[ptr++];
			else
				return -1;
		}

		private boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr]))
				ptr++;
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}

		public int nextInt() {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
				throw new NumberFormatException();
			return (int) nl;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}