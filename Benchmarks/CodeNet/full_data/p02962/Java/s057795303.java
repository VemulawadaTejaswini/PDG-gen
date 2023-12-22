import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class Main {

	static PrintWriter out;
	static InputReader ir;

	static void solve() {
		MersenneTwister mersenne = new MersenneTwister();
		long LO = (long) Math.pow(2L, 30), HI = LO + 100000;
		List<Long> primes = segmentSieve(LO, HI);
		mersenne.shuffle(primes);
		long[] mods = new long[] { primes.get(0), primes.get(1) },
				bases = new long[] { mersenne.nextLong63(), mersenne.nextLong63() };
		String s = ir.next();
		int n = s.length();
		String t = ir.next();
		int m = t.length();
		StringBuilder sb = new StringBuilder();
		RollingHash rht = new RollingHash(t, mods, bases);
		while (sb.length() <= m * 2)
			sb.append(s);
		sb.append(s);
		RollingHash rhs = new RollingHash(sb.toString(), mods, bases);
		long hasht = rht.calcHash(1, m);
		int[] p = new int[n];
		Arrays.fill(p, -1);
		int[] hashs=new int[n];
		for(int i=0;i<n;i++){hashs[i]=rhs.calcHash(i + 1, i + m);}
		for (int i = 0; i < n; i++) {
			if (hashs[i]== hasht) {
				p[i] = (i + m) % n;
			}
		}
		// tr(p);
		int[] dp = new int[n];
		Arrays.fill(dp, -1);
		int ma = 0;
		HashSet<Integer> st = new HashSet<>();
		for (int i = 0; i < n; i++) {
			if (dp[i] >= 0 || p[i] < 0)
				continue;
			dp[i] = 0;
			int cur = i;
			while (p[cur] >= 0) {
				dp[i]++;
				st.add(cur);
				cur = p[cur];
				if (st.contains(cur)) {
					out.println(-1);
					return;
				}
				if (dp[cur] >= 0) {
					dp[i] += dp[cur];
					break;
				}
			}
			ma = Math.max(dp[i], ma);
			st.clear();
		}
		// tr(dp);
		out.println(ma);
	}

	static strictfp class MersenneTwister extends Random { // {{{
															// MersenneTwister
		private static final long serialVersionUID = -515082678588212038L;
		private final static int UPPER_MASK = 0x80000000;
		private final static int LOWER_MASK = 0x7fffffff;

		private final static int N = 624;
		private final static int M = 397;
		private final int[] MAGIC = new int[] { 0x0, 0x9908b0df };

		private transient int[] mt;
		private transient int mti;

		public MersenneTwister() {
			super(0L);
			setSeed(System.currentTimeMillis());
		}

		public MersenneTwister(long seed) {
			super(seed);
			this.setSeed(seed);
		}

		public MersenneTwister(int[] buf) {
			super(0L);
			setSeed(buf);
		}

		private final void setSeed(int seed) {
			if (mt == null) {
				mt = new int[N];
			}
			mt[0] = seed;
			for (mti = 1; mti < N; ++mti) {
				mt[mti] = (1812433253 * (mt[mti - 1] ^ (mt[mti - 1] >>> 30)) + mti);
			}
		}

		public final synchronized void setSeed(long seed) {
			setSeed((int) seed);
		}

		public final synchronized void setSeed(int[] buf) {
			int length = buf.length;
			if (length == 0) {
				throw new IllegalArgumentException("buf is empty");
			}
			int i = 1, j = 0, k = (N > length ? N : length);
			setSeed(19971007);
			for (; k > 0; --k) {
				mt[i] = (mt[i] ^ ((mt[i - 1] ^ (mt[i - 1] >>> 30)) * 1664525)) + buf[j] + j;
				++i;
				++j;
				if (i >= N) {
					mt[0] = mt[N - 1];
					i = 1;
				}
				if (j >= length) {
					j = 0;
				}
			}
			for (k = N - 1; k > 0; --k) {
				mt[i] = (mt[i] ^ ((mt[i - 1] ^ (mt[i - 1] >>> 30)) * 1566083941)) - i;
				++i;
				if (i >= N) {
					mt[0] = mt[N - 1];
					i = 1;
				}
			}
			mt[0] = UPPER_MASK;
		}

		protected final synchronized int next(int bits) {
			int y, kk;
			if (mti >= N) {
				for (kk = 0; kk < N - M; ++kk) {
					y = (mt[kk] & UPPER_MASK) | (mt[kk + 1] & LOWER_MASK);
					mt[kk] = mt[kk + M] ^ (y >>> 1) ^ MAGIC[y & 0x1];
				}
				for (; kk < N - 1; ++kk) {
					y = (mt[kk] & UPPER_MASK) | (mt[kk + 1] & LOWER_MASK);
					mt[kk] = mt[kk + (M - N)] ^ (y >>> 1) ^ MAGIC[y & 0x1];
				}
				y = (mt[N - 1] & UPPER_MASK) | (mt[0] & LOWER_MASK);
				mt[N - 1] = mt[M - 1] ^ (y >>> 1) ^ MAGIC[y & 0x1];
				mti = 0;
			}
			y = mt[mti++];
			y ^= (y >>> 11);
			y ^= (y << 7) & 0x9d2c5680;
			y ^= (y << 15) & 0xefc60000;
			y ^= (y >>> 18);
			return (y >>> (32 - bits));
		}

		public int nextInt31() {
			return nextInt() >>> 1;
		}

		public long nextLong63() {
			return nextLong() >>> 1;
		}

		public <T> void shuffle(List<T> list) {
			int n = list.size();
			for (int i = n - 1; i >= 1; --i) {
				int k = nextInt31() % (i + 1);
				if (k == i) {
					continue;
				}
				Collections.swap(list, k, i);
			}
		}
	} // }}}

	public static List<Long> segmentSieve(long a, long b) {
		int sqb = (int) Math.sqrt(b);
		boolean[] isPrimeSmall = new boolean[sqb + 1];
		Arrays.fill(isPrimeSmall, true);
		isPrimeSmall[0] = isPrimeSmall[1] = true;
		boolean[] isPrime = new boolean[(int) (b - a)];
		Arrays.fill(isPrime, true);
		isPrime[0] = a != 1;
		for (long i = 2; i * i < b; ++i) {
			if (isPrimeSmall[(int) i]) {
				for (long j = 2 * i; j * j < b; j += i) {
					isPrimeSmall[(int) j] = false;
				}
				for (long j = Math.max(2, ((a + i - 1) / i)) * i; j < b; j += i) {
					isPrime[(int) (j - a)] = false;
				}
			}
		}
		List<Long> res = new ArrayList<>();
		for (long i = 0; i < b - a; ++i) {
			if (isPrime[(int) i]) {
				res.add(i + a);
			}
		}
		return res;
	}

	static class RollingHash {
		private String s;
		private long[][] b, H;
		private long[] mods, bases;

		RollingHash(String s, long[] mods, long[] bases) {
			this.s = s;
			this.mods = mods;
			this.bases = bases;
			b = new long[2][0];
			H = new long[2][0];
			int n = s.length();
			for (int j = 0; j < 2; ++j) {
				long B = bases[j] % mods[j];
				b[j] = new long[n + 1];
				H[j] = new long[n + 1];
				b[j][0] = 1;
				H[j][0] = 0;
				for (int i = 0; i < n; ++i) {
					b[j][i + 1] = b[j][i] * B;
					b[j][i + 1] %= mods[j];
					H[j][i + 1] = H[j][i] * B + (int) s.charAt(i);
					H[j][i + 1] %= mods[j];
				}
			}
		}

		long calcHash(int l, int r) {
			long h0 = (H[0][r] - b[0][r - l + 1] * H[0][l - 1]) % mods[0];
			if (h0 < 0) {
				h0 += mods[0];
			}
			long h1 = (H[1][r] - b[1][r - l + 1] * H[1][l - 1]) % mods[1];
			if (h1 < 0) {
				h1 += mods[1];
			}
			long hash = (h0 << 31) + h1;
			return hash;
		}
	}

	public static void main(String[] args) {
		ir = new InputReader(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
	}

	static class InputReader {

		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;

		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}

		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}

		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}

		public boolean hasNext() {
			skip();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}

	static void tr(Object... o) {
		out.println(Arrays.deepToString(o));
	}
}