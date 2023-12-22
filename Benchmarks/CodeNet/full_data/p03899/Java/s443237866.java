
import java.io.*;
import java.math.*;
import java.util.*;

import static java.util.Arrays.*;

public class Main {
	private static final int mod = (int)1e9+7;

	final Random random = new Random(0);
	final IOFast io = new IOFast();

	/// MAIN CODE
	public void run() throws IOException {
//		int TEST_CASE = Integer.parseInt(new String(io.nextLine()).trim());
		int TEST_CASE = 1;
		while(TEST_CASE-- != 0) {
			int N = io.nextInt();
			int M = io.nextInt();
			int K = io.nextInt();
			long[] A = io.nextLongArray(N);
			
//			Seg2 seg = new Seg2(N);
//			for (int i = 0; i < K; i++) {
//				for (int j = N - 1; j >= 0; j--) {
//					seg.update(j, (i + 1) * A[j] + seg.get(j - M, j));
//				}
//			}
//			io.out.println(seg.get(0, N));
			
			long[][] dp = new long[K][N];
			for (int i = 0; i < N; i++) dp[0][i] = A[i];
			for (int i = 0; i + 1 < K; i++) {
				SlideMinimum2 min = new SlideMinimum2(N, M);
				for (int j = 0; j < N; j++) {
					if (j < i) {
						dp[i+1][j] = Long.MIN_VALUE;
					} else {
						dp[i+1][j] = A[j] * (i+2) + (-min.min());
					}
					if (j >= i) {
						min.shift(-dp[i][j]);
					}
				}
			}
			long ans = Long.MIN_VALUE;
			for (long d : dp[K-1]) ans = Math.max(ans, d);
			io.out.println(ans);
		}
	}
	
	public class SlideMinimum2 {
		private int m, s, t, idx;
		private int[] deq;
		
		long[] a;
		long minValue;

		public SlideMinimum2(int n, int m) {
			this.m = m;

			idx = s = t = 0;
			minValue = 1L<<60;
			a = new long[n];
			deq = new int[n];
		}

		// min [idx-m..idx)
		public long min() {
			return minValue;
		}

		public void shift(long val) {
			a[idx] = val;
			while(s < t && a[deq[t-1]] >= a[idx]) t--;
			deq[t++] = idx;
			minValue = a[deq[s]];
			if(idx - m >= 0) {
				if(deq[s] == idx - m) {
					s++;
				}
			}
			idx++;
		}
	}

	static
	class Seg2 {
		final int n;
		final long[] seg;
		
		public Seg2(final int n) {
			this.n = Integer.highestOneBit(n) << 1;
			seg = new long[this.n << 1];
		}

		long get(int l, int r) { return get(l, r, 0, 0, n); }
		long get(int l, int r, int k, int curL, int curR) {
			if(curR <= l || curL >= r) return 0;
			if(l <= curL && curR <= r) { return seg[k]; }
			final int curM = (curL + curR) / 2;
			return Math.max(
					get(l, r, 2 * k + 1, curL, curM),
					get(l, r, 2 * k + 2, curM, curR));
		}
		
		void update(int i, long v) {
			i += n - 1;
			seg[i] = v;
			while(i != 0) {
				i = (i - 1) / 2;
				seg[i] = Math.max(seg[2*i+1], seg[2*i+2]);
			}
		}
	}

	
	/// TEMPLATE
	static int gcd(int n, int r) { return r == 0 ? n : gcd(r, n%r); }
	static long gcd(long n, long r) { return r == 0 ? n : gcd(r, n%r); }
	
	static <T> void swap(T[] x, int i, int j) { T t = x[i]; x[i] = x[j]; x[j] = t; }
	static void swap(int[] x, int i, int j) { int t = x[i]; x[i] = x[j]; x[j] = t; }

	void printArrayLn(int[] xs) { for(int i = 0; i < xs.length; i++) io.out.print(xs[i] + (i==xs.length-1?"\n":" ")); }
	void printArrayLn(long[] xs) { for(int i = 0; i < xs.length; i++) io.out.print(xs[i] + (i==xs.length-1?"\n":" ")); }
	
	static void dump(Object... o) { System.err.println(Arrays.deepToString(o)); } 
	
	void main() throws IOException {
		//		IOFast.setFileIO("rle-size.in", "rle-size.out");
		try { run(); }
		catch (EndOfFileRuntimeException e) { }
		io.out.flush();
	}
	public static void main(String[] args) throws IOException { new Main().main(); }
	
	static class EndOfFileRuntimeException extends RuntimeException {
		private static final long serialVersionUID = -8565341110209207657L; }

	static
	public class IOFast {
		private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		private PrintWriter out = new PrintWriter(System.out);

		void setFileIn(String ins) throws IOException { in.close(); in = new BufferedReader(new FileReader(ins)); }
		void setFileOut(String outs) throws IOException { out.flush(); out.close(); out = new PrintWriter(new FileWriter(outs)); }
		void setFileIO(String ins, String outs) throws IOException { setFileIn(ins); setFileOut(outs); }

		private static int pos, readLen;
		private static final char[] buffer = new char[1024 * 8];
		private static char[] str = new char[500*8*2];
		private static boolean[] isDigit = new boolean[256];
		private static boolean[] isSpace = new boolean[256];
		private static boolean[] isLineSep = new boolean[256];

		static { for(int i = 0; i < 10; i++) { isDigit['0' + i] = true; } isDigit['-'] = true; isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true; isLineSep['\r'] = isLineSep['\n'] = true; }
		public int read() throws IOException { if(pos >= readLen) { pos = 0; readLen = in.read(buffer); if(readLen <= 0) { throw new EndOfFileRuntimeException(); } } return buffer[pos++]; }
		public int nextInt() throws IOException { int len = 0; str[len++] = nextChar(); len = reads(len, isSpace); int i = 0; int ret = 0; if(str[0] == '-') { i = 1; } for(; i < len; i++) ret = ret * 10 + str[i] - '0'; if(str[0] == '-') { ret = -ret; } return ret; }
		public long nextLong() throws IOException { int len = 0; str[len++] = nextChar(); len = reads(len, isSpace); int i = 0; long ret = 0; if(str[0] == '-') { i = 1; } for(; i < len; i++) ret = ret * 10 + str[i] - '0'; if(str[0] == '-') { ret = -ret; } return ret; }
		public char nextChar() throws IOException { while(true) { final int c = read(); if(!isSpace[c]) { return (char)c; } } }
		int reads(int len, boolean[] accept) throws IOException { try { while(true) { final int c = read(); if(accept[c]) { break; } if(str.length == len) { char[] rep = new char[str.length * 3 / 2]; System.arraycopy(str, 0, rep, 0, str.length); str = rep; } str[len++] = (char)c; } } catch(EndOfFileRuntimeException e) { ; } return len; }
		int reads(char[] cs, int len, boolean[] accept) throws IOException { try { while(true) { final int c = read(); if(accept[c]) { break; } cs[len++] = (char)c; } } catch(EndOfFileRuntimeException e) { ; } return len; }
		public char[] nextLine() throws IOException { int len = 0; str[len++] = nextChar(); len = reads(len, isLineSep); try { if(str[len-1] == '\r') { len--; read(); } } catch(EndOfFileRuntimeException e) { ; } return Arrays.copyOf(str, len); }
		public String nextString() throws IOException { return new String(next()); }
		public char[] next() throws IOException { int len = 0; str[len++] = nextChar(); len = reads(len, isSpace); return Arrays.copyOf(str, len); }
//		public int next(char[] cs) throws IOException { int len = 0; cs[len++] = nextChar(); len = reads(cs, len, isSpace); return len; }
		public double nextDouble() throws IOException { return Double.parseDouble(nextString()); }
		public long[] nextLongArray(final int n) throws IOException { final long[] res = new long[n]; for(int i = 0; i < n; i++) { res[i] = nextLong(); } return res; }
		public int[] nextIntArray(final int n) throws IOException { final int[] res = new int[n]; for(int i = 0; i < n; i++) { res[i] = nextInt(); } return res; }
		public int[][] nextIntArray2D(final int n, final int k) throws IOException { final int[][] res = new int[n][]; for(int i = 0; i < n; i++) { res[i] = nextIntArray(k); } return res; }
		public int[][] nextIntArray2DWithIndex(final int n, final int k) throws IOException { final int[][] res = new int[n][k+1]; for(int i = 0; i < n; i++) { for(int j = 0; j < k; j++) { res[i][j] = nextInt(); } res[i][k] = i; } return res; }
		public double[] nextDoubleArray(final int n) throws IOException { final double[] res = new double[n]; for(int i = 0; i < n; i++) { res[i] = nextDouble(); } return res; }
	}
}
