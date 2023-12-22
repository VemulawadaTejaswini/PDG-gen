
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
			
			rh2 = new RollingHash[n];
			int len = 0;
			cs = new char[n][];
			for(int i = 0; i < n; i++) {
				cs[i] = io.next();
				rh2[i] = new RollingHash(cs[i]);
				set.add(rh2[i].hash(0, cs[i].length));
//				dump("rh", i, rh2[i].hash(0, cs[i].length));
				len += cs[i].length + 1;
			}
			int alphabet = 26 + 1;
			tree = new SuffixTree(alphabet, len);

			cs2 = new char[len];
			for(int i = 0, j = 0; i < n; i++) {
				for(char c : cs[i]) {
//					dump(c);
					tree.add(c - 'a');
					cs2[j++] = c;
				}
				tree.add(alphabet - 1);
				cs2[j++] = '$';
			}
			tail = new int[len];
			for(int i = len - 1, j = -1; i >= 0; i--) {
				if(cs2[i] == '$') j = i;
				tail[i] = j;
			}

			int q = io.nextInt();
			rh = new RollingHash(cs2);
			memo = new int[tree.MAX_EDGE];
			Arrays.fill(memo, -1);
			for(int i = 0; i < q; i++) {
				int ki = io.nextInt() - 1;
				p = io.next();
				io.out.println(rec(tree._root, ki, 0, 0) + 1);
			}
		}
	}

	char[][] cs;
	char[] cs2;
	TreeSet<Long> set = new TreeSet<>();
	RollingHash[] rh2;
	int[] tail;
	SuffixTree tree;
	RollingHash rh;
	char[] p;
	int[] memo;
	int rec(int e, int ki, int cur, long h) {
		if(e == -1) return 0;
		if(ki == -1) {
			if(memo[e] != -1) {
//				dump(0, memo[e]);
				return memo[e];
			}
		}
//		if(ki != -1) dump(e, ki, dbg);
		if(e != tree._root) {
			// $ またぎ
			int start = tree._start[e];
			int len = tree._len[e];
			int len2 = len;
			if(start + len > tail[start] + 0) {
				len2 = tail[start] - start;
			}
//			dump(start, len, len2);
			h = h * rh.pow[len2] + rh.hash(start, start + len2);
//			dbg += new String(cs2, start, len2);
			if(len != len2) {
//				dump(1, dbg, h, ki == -1 && set.contains(h) ? 1 : 0);
				return ki == -1 && set.contains(h) ? 1 : 0;
			}
			cur += len;
		}
		if(memo[e] == -1) {
			int ans = 0;
			for(int i = 0; i <= 26; i++) {
				ans += rec(tree._nextEdge[i][e], -1, cur, h);
			}
	//		dump(2, dbg, cur, ans);
			memo[e] = ans;
		}
		if(ki == -1) {
			return memo[e];
		} else if(memo[e] > 1) {
			int ans = 0;
			if(cs[ki].length != cur) {
//				dump(cs[ki].length, cur, dbg);
				ans += rec(tree._nextEdge[26][e], -1, cur, h);
				for(int i = 0; i < 26; i++) {
					if(cs[ki][cur] == p[i]) {
						ans += rec(tree._nextEdge[p[i] - 'a'][e], ki, cur, h);
						break;
					} else {
						ans += rec(tree._nextEdge[p[i] - 'a'][e], -1, cur, h);
					}
				}
			}
//			dump(3, dbg, cur, ans);
			return ans;
		}
		return 0;
	}
	
	static
	public class SuffixTree {
		final int MAX_EDGE;
		final int MAX_LEN;
		final int ALPHABET_SIZE;
		
		int _root;
		int _curEdge;
		int _curOffset;
		
		int _strIndex;
		int _edgeLen;
		
		int[] _suffixLink;
		int[] _start;
		int[] _len;
		int[] _str;
		int[] _parent;
		
		int[][] _nextEdge;
		
		public SuffixTree(final int alphabetSize, final int capacity) {
			ALPHABET_SIZE	= alphabetSize;
			MAX_LEN			= capacity;
			MAX_EDGE		= MAX_LEN * 2;
			
			// 辺が文字列のどこに対応するか
			_start		= new int[MAX_EDGE];
			
			// 辺の長さ
			_len		= new int[MAX_EDGE];
			_suffixLink	= new int[MAX_EDGE];
			_parent		= new int[MAX_EDGE];
			_nextEdge	= new int[ALPHABET_SIZE][MAX_EDGE];
			_str = new int[MAX_LEN];
			
			_curEdge = _root = _edgeLen++;
			_parent[_root] = -1;
			for(int i = 0; i < _nextEdge.length; i++) {
				_nextEdge[i][0] = -1;
			}
		}
		
		void appendEdge(final int c, int prevEdge) {
			while(true) {
				if(prevEdge != -1) {
					_suffixLink[prevEdge] = _curEdge;
				}
				prevEdge = _curEdge;
				
				if(_nextEdge[c][_curEdge] != -1) {
					_curOffset = 1;
					_curEdge = _nextEdge[c][_curEdge];
					break;
				}
				
				addEdge(c);
	
				if(_curEdge == _root) {
					_curOffset = 0;
					break;
				}
				
				_curEdge = _suffixLink[_curEdge];
			}
		}
		
		int addEdge(final int c, final int targetEdge) {
			final int e = _edgeLen++;
			
			_nextEdge[c][targetEdge] = e;
			
			_start[e] = _strIndex;
			_len[e] = MAX_LEN - _strIndex;
			_parent[e] = targetEdge;
			_suffixLink[e] = -1;
			for(int i = 0; i < _nextEdge.length; i++) {
				_nextEdge[i][e] = -1;
			}
			return e;
		}
		
		int addEdge(final int c) {
			return addEdge(c, _curEdge);
		}
		
		void moveEdge() {
			int offset = 0;
			int p = _start[_curEdge];
			
			if(_parent[_curEdge] == _root) {
				_curOffset--;
				p++;
			}
	
			int e = _suffixLink[_parent[_curEdge]];
			p -= _len[e];
			_curOffset += _len[e];
			while(_len[e] < _curOffset) {
				offset += _len[e];
				_curOffset -= _len[e];
				e = _nextEdge[_str[p + offset]][e];
			}
			_curEdge = e;
		}
		
		void sepEdge(final int c) {
			final int newEdge = _edgeLen++;
			
			for(int i = 0; i < _nextEdge.length; i++) {
				_nextEdge[i][newEdge] = -1;
			}
			
			final int cc = _str[_start[_curEdge] + _curOffset];
			
			final int p = _parent[_curEdge];
			final int s = _str[_start[_curEdge]];
			_nextEdge[s][p] = newEdge;
			
			_parent[newEdge] = _parent[_curEdge];
			_nextEdge[cc][newEdge] = _curEdge;
			_start[newEdge] = _start[_curEdge];
			_len[newEdge] = _curOffset;
			
			_parent[_curEdge] = newEdge;
			_start[_curEdge] += _curOffset;
			_len[_curEdge] -= _curOffset;
			
			// add
			addEdge(c, newEdge);
			
			_curEdge = newEdge;
		}
		
		void cutEdge(final int c) {
			int prevEdge = -1;
			while(true) {
				if(_curOffset == _len[_curEdge]) {
					appendEdge(c, prevEdge);
					break;
				}
				
				if(_str[_start[_curEdge] + _curOffset] == c) {
					_curOffset++;
					break;
				}
				
				sepEdge(c);
				
				if(_parent[_curEdge] == _root && _curOffset == -1) {
					_curEdge = _root;
					_curOffset = 0;
					break;
				}
				
				if(-1 != prevEdge) {
					_suffixLink[prevEdge] = _curEdge;
				}
				prevEdge = _curEdge;
				
				moveEdge();
			}
		}
		
		public void add(final int c) {
			_str[_strIndex] = c;
			cutEdge(c);
			_strIndex++;
		}
	}
	
	static
	class RollingHash {
		private static final long RADIX = 1000000009L * 1000000007L;
		private int n;
		long[] table, pow;

		public RollingHash(char[] str) {
			n = str.length;

			table = new long[n + 1];
			pow = new long[n + 1];

			pow[0] = 1;
			for (int i = 0; i < n; i++) {
				table[i + 1] = table[i] * RADIX + str[i];
				pow[i + 1] = pow[i] * RADIX;
			}
		}

		public long hash(int i, int j) {
			assert(i <= j);
			return table[j] - table[i] * pow[j - i];
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
