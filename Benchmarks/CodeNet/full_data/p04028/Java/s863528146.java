
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
			int n = io.nextInt();
			int S = io.next().length;
			io.out.println(rec(n, S));
		}
	}
	
	boolean[][] done = new boolean[5001][5001];
	long[][] mp = new long[5001][5001];
//	TreeMap<Long, Long> mp = new TreeMap<>();
	long rec(int ope, int fix) {
		if(fix < 0 || ope < fix) return 0;
		if(ope == 0) return fix == 0 ? 1 : 0;
		
		if(done[ope][fix]) {
			return mp[ope][fix];
		}
		done[ope][fix] = true;
//		long key = (long)ope<<16|fix<<0;
//		if(mp.containsKey(key)) return mp.get(key);
		
		long ans = 0;
		
		// back(push 0 or 1)
//		ans += rec(ope - 1, fix, any + 1);
		for(int i = 0; i <= ope; i += 2) {
			long val = 0;
			
//			val += rec(ope - i, fix);
			if(fix == 0) {
				if(i == ope) val += 1;
				val += rec(ope - i - 1, fix);
			}

			// push 0 or 1
			val += rec(ope - i - 1, fix - 1);
			ans += val * back(i) % mod;
		}
		
//		System.err.println(ope + " " + fix + ": " + ans);
//		mp.put(key, ans % mod);
		return mp[ope][fix] = ans % mod;
	}
	
	long[][] dp2;
	long back(int t) {
		if(t%2 != 0) return 0;
		if(dp2 == null) {
			dp2 = new long[5001][5001];
			dp2[0][0] = 1;
			for(int i = 0; i < dp2.length; i++) {
				for(int j = i; j < dp2[i].length; j++) {
					if(i > 0) dp2[i][j] += dp2[i-1][j];
					if(j > 0) dp2[i][j] += dp2[i][j-1] * 2;
					if(dp2[i][j] >= mod) dp2[i][j] -= mod;
					if(dp2[i][j] >= mod) dp2[i][j] -= mod;
				}
			}
		}
//		System.err.println(t + " " + dp2[t/2][t/2]);
		return dp2[t/2][t/2];
	}

	/*
	long rec2(int ope, int fix, int any) {
		if(fix < 0 || any < 0 || ope < fix + any) return 0;
		if(ope == 0) return fix == 0 && any == 0 ? 1 : 0;
		
		long key = (long)ope<<32|fix<<16|any;
		if(mp.containsKey(key)) return mp.get(key);
		
		long ans = 0;
		
		// back(push 0 or 1)
		ans += rec(ope - 1, fix, any + 1);
		if(fix == 0 && any == 0) {
			ans += rec(ope - 1, fix, any);
		}

		// push 0 or 1
		if(any > 0) {
			ans += 2 * rec(ope - 1, fix, any - 1);
		} else {
			ans += rec(ope - 1, fix - 1, any);
		}
		
//		System.err.println(ope + " " + fix + " " + any + ": " + ans);
		mp.put(key, ans % mod);
		return ans % mod;
	}
	*/
	
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
