
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
			int h = io.nextInt();
			int w = io.nextInt();
			int n = io.nextInt();
			f = io.nextInt();
			
			int sy = io.nextInt();
			int sx = io.nextInt();
			int gy = io.nextInt();
			int gx = io.nextInt();
			
			HashMap<Long, Arrow> mp = new HashMap<>();
			for (int i = 0; i < n; i++) {
				int y = io.nextInt();
				int x = io.nextInt();
				char dir = io.nextChar();
				int d = io.nextInt();
				int e = io.nextInt();
				Arrow a = new Arrow(i, x, y, "ENWS".indexOf(dir), d, e);
				mp.put((long)x<<32|y, a);
				setX.add(a);
				setY.add(a);
			}
			
			Arrow a = mp.get((long)sx<<32|sy);
			if (a == null) {
				io.out.println(-1);
				return;
			}
			
			long ans = Long.MAX_VALUE;
			PriorityQueue<State> q = new PriorityQueue<>();
			q.add(new State(2, a, 0));
			long[] memo = new long[n * 3];
			Arrays.fill(memo, Long.MAX_VALUE);
			memo[a.idx * 3 + 2] = 0;
			while (!q.isEmpty()) {
				State s = q.poll();

//				dump(s.a.x, s.a.y, s.cost, s.cost(gx, gy), gx, gy);
				if (memo[s.a.idx * 3 + s.prevDir] < s.cost) continue;
				memo[s.a.idx * 3 + s.prevDir] = s.cost;
//				if (s.cost + s.mincost(gx, gy) >= ans) continue;
				
//				dump(s.a.x, s.a.y, s.cost, s.cost(gx, gy), gx, gy);
				ans = Math.min(ans, s.cost(gx, gy));
				
				Arrow x0 = setY.lower(s.a);
				Arrow x1 = setY.higher(s.a);
				Arrow y0 = setX.lower(s.a);
				Arrow y1 = setX.higher(s.a);
				if (x0 != null && x0.y == s.a.y) q.add(s.move(x0));
				if (x1 != null && x1.y == s.a.y) q.add(s.move(x1));
				if (y0 != null && y0.x == s.a.x) q.add(s.move(y0));
				if (y1 != null && y1.x == s.a.x) q.add(s.move(y1));
			}
			
			io.out.println(ans);
		}
	}
	
	long f;
	class State implements Comparable<State> {
		final int prevDir;
		final Arrow a;
		final long cost;
		
		public State(int pd, Arrow a, long c) {
			this.prevDir = pd;
			this.a = a;
			this.cost = c;
		}

		public State move(Arrow b) {
			long res = Long.MAX_VALUE;
			if (a.y == b.y) {
				if (prevDir != 2 && prevDir == 0) res = Math.min(res, f * Math.abs(a.x - b.x));
				for (int i = 0; i < 4; i++) {
					if (a.dir % 2 == 0) res = Math.min(res, (i==0?0:a.e) + f * Math.abs(a.dstX() - b.x));
					a.rot();
				}
				return new State(0, b, cost + res);
			} else if (a.x == b.x) {
				if (prevDir != 2 && prevDir == 1) res = Math.min(res, f * Math.abs(a.y - b.y));
				for (int i = 0; i < 4; i++) {
					if (a.dir % 2 != 0) res = Math.min(res, (i==0?0:a.e) + f * Math.abs(a.dstY() - b.y));
					a.rot();
				}
				return new State(1, b, cost + res);
			} else {
				throw new RuntimeException();
			}
		}

		public long mincost(int gx, int gy) {
			return f * (Math.abs(a.x - gx) + Math.abs(a.y - gy));
		}

		public long cost(int gx, int gy) {
			long res = Long.MAX_VALUE;
			if (a.y == gy) {
				if (prevDir != 2 && prevDir == 0) res = Math.min(res, f * Math.abs(a.x - gx));
				for (int i = 0; i < 4; i++) {
					if (a.dir % 2 == 0) {
						res = Math.min(res, (i==0?0:a.e) + f * Math.abs(a.dstX() - gx));
					}
					a.rot();
				}
			} else if (a.x == gx) {
				if (prevDir != 2 && prevDir == 1) res = Math.min(res, f * Math.abs(a.y - gy));
				for (int i = 0; i < 4; i++) {
					if (a.dir % 2 != 0) {
						res = Math.min(res, (i==0?0:a.e) + f * Math.abs(a.dstY() - gy));
//						dump(res, (i==0?0:a.e), f * Math.abs(a.dstY() - gy), a.dir);
					}
					a.rot();
				}
			} else {
				return Long.MAX_VALUE;
			}
			return cost + res;
		}

		@Override
		public int compareTo(State o) {
			return -Long.compare(cost, o.cost);
		}
	}

	TreeSet<Arrow> setX = new TreeSet<>((a,b)->{
		if (a.x != b.x) return a.x-b.x;
		return a.y-b.y;
	});
	TreeSet<Arrow> setY = new TreeSet<>((a,b)->{
		if (a.y != b.y) return a.y-b.y;
		return a.x-b.x;
	});
	
	static class Arrow {
		public final int x, y, len, e;
		public int dir;
		public final int idx;
		
		public Arrow(int idx, int x, int y, int dir, int len, int e) {
			this.idx = idx;
			this.x = x;
			this.y = y;
			this.dir = dir;
			this.len = len;
			this.e = e;
		}
		
		static int[] d = new int[]{1,0,-1,0,1,};
		public void rot() { dir = (dir + 1) & 3; }
		public int dstX() { return x + len * d[dir]; }
		public int dstY() { return y + len * d[dir+1]; }
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
