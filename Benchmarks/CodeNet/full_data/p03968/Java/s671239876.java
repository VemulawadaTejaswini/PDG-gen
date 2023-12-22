
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
		long[][] comb = new long[401][401];
		long[] fact = new long[401];
		fact[0] = 1;
		for(int i = 0; i < comb.length; i++) {
			if(i > 0) fact[i] = fact[i-1] * i;
			comb[i][0] = comb[i][i] = 1;
			for(int j = 1; j < i; j++) {
				comb[i][j] = comb[i-1][j-1] + comb[i-1][j];
			}
		}
		
//		dump(comb[400][6]);
		
//		int TEST_CASE = Integer.parseInt(new String(io.nextLine()).trim());
		int TEST_CASE = 1;
		while(TEST_CASE-- != 0) {
			int n = io.nextInt();
			int[][] C = io.nextIntArray2D(n, 4);
			long ans = 0;
			int[] dup = new int[4];
			int[][] cnt = new int[4][4];
			int[] tmp = new int[4];

//			int[] p1 = new int[]{0, 1, 2, 3,};
			int[] p2 = new int[]{1, 0, 3, 2,};
			
			for(int i = 0; i < n; i++) {
				for(int j = i + 1; j < n; j++) for(int d = 0; d < 4; d++) {
					if(!(i == 1 && j == 3 && d == 2)) {
//						continue;
					}
					
					Arrays.fill(dup, 1);
					for(int[] s : cnt) Arrays.fill(s, 0);
					LOOP: for(int s = 0; s < 4; s++) {
						int t2 = C[i][(s+0)&3];
						int t1 = C[i][(s+1)&3];
						int b1 = C[j][p2[(s+d+0)&3]];
						int b2 = C[j][p2[(s+d+1)&3]];
						for(int s2 = 0; s2 < s; s2++) {
							tmp[0] = C[i][(s2+1)&3];
							tmp[1] = C[i][(s2+0)&3];
							tmp[2] = C[j][(s2+d+0)&3];
							tmp[3] = C[j][(s2+d+1)&3];
							for(int d2 = 0; d2 < 4; d2++) {
								if(t1 == tmp[(d2+0)&3] && t2 == tmp[(d2+1)&3] && b1 == tmp[(d2+2)&3] && b2 == tmp[(d2+3)&3]) {
									dup[s2]++;
									dup[s] = -1;
									continue LOOP;
								}
							}
						}
						for(int k = 0; k < n; k++) if(k != i && k != j) {
							int c = 0;
							for(int d2 = 0; d2 < 4; d2++) {
								if(t1 == C[k][(d2+0)&3] && t2 == C[k][(d2+1)&3] && b1 == C[k][(d2+2)&3] && b2 == C[k][(d2+3)&3]) {
									c++;
								}
							}
//							dump(k, c, C[k], t1, t2, b1, b2);
							if(c > 0) cnt[s][c - 1]++;
						}
					}
					long val = 1;
					for(int s = 0; s < 4; s++) if(dup[s] != -1) {
						long[] dp = new long[dup[s]+1];
						dp[0] = 1;
						for(int c = 0; c < 4; c++) {
							for(int k = dup[s] - 1; k >= 0; k--) {
								for(int l = 1; l <= cnt[s][c] && k + l <= dup[s]; l++) {
									dp[k+l] += dp[k] * comb[cnt[s][c]][l] * fact[l] * pow(c + 1, l);
								}
							}
						}
						val *= dp[dup[s]];
					}
					ans += val;
//					dump(i, j, cnt, dup, val);
				}
			}
//			dump(ans, ans % 3);
			ans /= 3;
			io.out.println(ans);
		}
	}
	
	int pow(int c, int p) {
		int res = 1;
		for(int i = 0; i < p; i++) res *= c;
		return res;
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
