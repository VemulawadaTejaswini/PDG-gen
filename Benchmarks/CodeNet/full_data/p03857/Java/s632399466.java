
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
			int K = io.nextInt();
			int L = io.nextInt();

			UnionFind uf1 = new UnionFind(n);
			UnionFind uf2 = new UnionFind(n);
			UnionFind uf3 = new UnionFind(n);
			
			for (int i = 0; i < K; i++) {
				int a = io.nextInt() - 1;
				int b = io.nextInt() - 1;
				uf1.union(a, b);
			}
			
			for (int i = 0; i < L; i++) {
				int a = io.nextInt() - 1;
				int b = io.nextInt() - 1;
				uf2.union(a, b);
			}

			TreeSet<Integer>[] s1 = new TreeSet[n];
			TreeSet<Integer>[] s2 = new TreeSet[n];
			for (int i = 0; i < n; i++) if (uf1.root(i) == i) {
				TreeSet<Integer> s = new TreeSet<>();
				for (int j = i; j != -1; j = uf1.next[j]) { s.add(j); }
				s1[i] = s;
			}
			for (int i = 0; i < n; i++) if (uf2.root(i) == i) {
				TreeSet<Integer> s = new TreeSet<>();
				for (int j = i; j != -1; j = uf2.next[j]) { s.add(j); }
				s2[i] = s;
			}
			
			int[] ans = new int[n];
			for (int i = 0; i < n; i++) {
				int r1 = uf1.root(i);
				int r2 = uf2.root(i);

				if (!s1[r1].contains(i)) continue;

				TreeSet<Integer> a = s1[r1].size() < s2[r2].size() ? s1[r1] : s2[r2];
				TreeSet<Integer> b = s1[r1].size() < s2[r2].size() ? s2[r2] : s1[r1];
				List<Integer> same = new ArrayList<>();
				for (int t : a) {
					if (b.contains(t)) same.add(t);
				}
				for (int t : same) {
					s1[r1].remove(t);
					s2[r2].remove(t);
					ans[t] = same.size();
				}
			}
			
			printArrayLn(ans);
		}
	}
	
	static
	class UnionFind {
		private int[] data;
		private int[] next;
		private int[] last;
		
		public UnionFind(int size) {
			data = new int[size];
			next = new int[size];
			last = new int[size];
			clear();
		}
		
		public void clear() {
			Arrays.fill(data, -1);
			Arrays.fill(next, -1);
			for(int i = 0; i < last.length; i++) {
				last[i] = i;
			}
		}
		
		public int root(int x) { return data[x] < 0 ? x : (data[x] = root(data[x])); }
		
		public void union(int x, int y) {
			if((x = root(x)) != (y = root(y))) {
				if(data[y] < data[x]) { final int t = x; x = y; y = t; }
				data[x] += data[y];
				data[y] = x;
				next[last[x]] = y;
				last[x] = last[y];
			}
		}
		
		public boolean same(int x, int y) { return root(x) == root(y); }
		public int size(int x) { return -data[root(x)]; }
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
