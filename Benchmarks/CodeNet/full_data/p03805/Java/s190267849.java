import java.util.*;
import java.io.*;
import java.math.*;
import java.util.function.*;
public class Main implements Runnable {
	static boolean DEBUG;
	public static void main(String[] args) {
		DEBUG = args.length > 0 && args[0].equals("-DEBUG");
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> { e.printStackTrace(); System.exit(1); });
		new Thread(null, new Main(), "", 1 << 31).start();
	}

	public void run() { Solver solver = new Solver(); solver.solve(); solver.exit(); }

	static class FastScanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int pointer = 0;
		private int buflen = 0;
		private boolean hasNextByte() {
			if(pointer < buflen) return true;
			else {
				pointer = 0;
				try { buflen = in.read(buffer);
				}catch (IOException e) { e.printStackTrace(); }
				return buflen > 0;
			}
		}
		private int readByte() { if(hasNextByte()) return buffer[pointer ++]; else return -1; }
		private boolean isPrintableChar(int c) { return isPrintableChar(c, false); }
		private boolean isPrintableChar(int c, boolean includingSpace) { return (includingSpace ? 32 : 33) <= c && c <= 126; }
		private void skipUnprintable() { skipUnprintable(false); }
		private void skipUnprintable(boolean includingSpace) { while(hasNextByte() && !isPrintableChar(buffer[pointer], includingSpace)) pointer ++; }
		private boolean hasNext() { return hasNext(false); }
		private boolean hasNext(boolean includingSpace) { skipUnprintable(includingSpace); return hasNextByte(); }
		private StringBuilder sb = new StringBuilder();
		public String next() { return next(false); }
		public String next(boolean includingSpace) {
			if(!hasNext(includingSpace)) throw new NoSuchElementException();
			sb.setLength(0);
			int b = readByte();
			while(isPrintableChar(b, includingSpace)) { sb.appendCodePoint(b); b = readByte(); }
			return sb.toString();
		}
		public long nextLong() {
			if(!hasNext()) throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if(b == '-') { minus = true; b = readByte(); }
			if(b < '0' || '9' < b) throw new NumberFormatException();
			while(true) {
				if('0' <= b && b <= '9') n = n * 10 + b - '0';
				else if(b == -1 || !isPrintableChar(b)) return minus ? - n : n;
				else throw new NumberFormatException();
				b = readByte();
			}
		}
	}

	static class Solver {
		final FastScanner sc = new FastScanner();
		public Solver() { }

		String ns() { return ns(false); }
		String ns(boolean includingSpace) { return sc.next(includingSpace); }
		String[] ns(int n) { return ns(n, false); }
		String[] ns(int n, boolean includingSpace) { String a[] = new String[n]; for(int i = 0; i < n; i ++) a[i] = ns(includingSpace); return a; }
		String[][] ns(int n, int m) { return ns(n, m, false); }
		String[][] ns(int n, int m, boolean includingSpace) { String a[][] = new String[n][m]; for(int i = 0; i < n; i ++) a[i] = ns(m, includingSpace); return a; }
		char nc() { return ns().charAt(0); }
		char[] nc(int n) {
			String str = ns();
			if(n < 0) n = str.length();
			char a[] = new char[n];
			for(int i = 0; i < n; i ++) a[i] = str.charAt(i);
			return a;
		}
		char[][] nc(int n, int m) { char a[][] = new char[n][m]; for(int i = 0; i < n; i ++) a[i] = nc(m); return a; }
		boolean[] nb(int n, char t) {
			char c[] = nc(-1);
			if(n < 0) n = c.length;
			boolean a[] = new boolean[n];
			for(int i = 0; i < n; i ++) a[i] = c[i] == t;
			return a;
		}
		boolean[][] nb(int n, int m, char t) { boolean a[][] = new boolean[n][m]; for(int i = 0; i < n; i ++) a[i] = nb(m, t); return a; }
		int ni() { return Math.toIntExact(sc.nextLong()); }
		int[] ni(int n) { int a[] = new int[n]; for(int i = 0; i < n; i ++) a[i] = ni(); return a; }
		int[][] ni(int n, int m) { int a[][] = new int[n][m]; for(int i = 0; i < n; i ++) a[i] = ni(m); return a; }
		long nl() { return sc.nextLong(); }
		long[] nl(int n) { long a[] = new long[n]; for(int i = 0; i < n; i ++) a[i] = nl(); return a; }
		long[][] nl(int n, int m) { long a[][] = new long[n][m]; for(int i = 0; i < n; i ++) a[i] = nl(m); return a; }
		double nd() { return Double.parseDouble(sc.next()); }
		double[] nd(int n) { double a[] = new double[n]; for(int i = 0; i < n; i ++) a[i] = nd(); return a; }
		double[][] nd(int n, int m) { double a[][] = new double[n][m]; for(int i = 0; i < n; i ++) a[i] = nd(m); return a; }
		PairII npii() { return new PairII(ni(), ni()); }
		PairII[] npii(int n) { PairII a[] = new PairII[n]; for(int i = 0; i < n; i ++) a[i] = npii(); return a; }
		PairII[][] npii(int n, int m) { PairII a[][] = new PairII[n][m]; for(int i = 0; i < n; i ++) a[i] = npii(m); return a; }
		PairIL npil() { return new PairIL(ni(), nl()); }
		PairIL[] npil(int n) { PairIL a[] = new PairIL[n]; for(int i = 0; i < n; i ++) a[i] = npil(); return a; }
		PairIL[][] npil(int n, int m) { PairIL a[][] = new PairIL[n][m]; for(int i = 0; i < n; i ++) a[i] = npil(m); return a; }
		PairID npid() { return new PairID(ni(), nd()); }
		PairID[] npid(int n) { PairID a[] = new PairID[n]; for(int i = 0; i < n; i ++) a[i] = npid(); return a; }
		PairID[][] npid(int n, int m) { PairID a[][] = new PairID[n][m]; for(int i = 0; i < n; i ++) a[i] = npid(m); return a; }
		PairLI npli() { return new PairLI(nl(), ni()); }
		PairLI[] npli(int n) { PairLI a[] = new PairLI[n]; for(int i = 0; i < n; i ++) a[i] = npli(); return a; }
		PairLI[][] npli(int n, int m) { PairLI a[][] = new PairLI[n][m]; for(int i = 0; i < n; i ++) a[i] = npli(m); return a; }
		PairLL npll() { return new PairLL(nl(), nl()); }
		PairLL[] npll(int n) { PairLL a[] = new PairLL[n]; for(int i = 0; i < n; i ++) a[i] = npll(); return a; }
		PairLL[][] npll(int n, int m) { PairLL a[][] = new PairLL[n][m]; for(int i = 0; i < n; i ++) a[i] = npll(m); return a; }
		PairLD npld() { return new PairLD(nl(), nd()); }
		PairLD[] npld(int n) { PairLD a[] = new PairLD[n]; for(int i = 0; i < n; i ++) a[i] = npld(); return a; }
		PairLD[][] npld(int n, int m) { PairLD a[][] = new PairLD[n][m]; for(int i = 0; i < n; i ++) a[i] = npld(m); return a; }
		PairDI npdi() { return new PairDI(nd(), ni()); }
		PairDI[] npdi(int n) { PairDI a[] = new PairDI[n]; for(int i = 0; i < n; i ++) a[i] = npdi(); return a; }
		PairDI[][] npdi(int n, int m) { PairDI a[][] = new PairDI[n][m]; for(int i = 0; i < n; i ++) a[i] = npdi(m); return a; }
		PairDL npdl() { return new PairDL(nd(), nl()); }
		PairDL[] npdl(int n) { PairDL a[] = new PairDL[n]; for(int i = 0; i < n; i ++) a[i] = npdl(); return a; }
		PairDL[][] npdl(int n, int m) { PairDL a[][] = new PairDL[n][m]; for(int i = 0; i < n; i ++) a[i] = npdl(m); return a; }
		PairDD npdd() { return new PairDD(nd(), nd()); }
		PairDD[] npdd(int n) { PairDD a[] = new PairDD[n]; for(int i = 0; i < n; i ++) a[i] = npdd(); return a; }
		PairDD[][] npdd(int n, int m) { PairDD a[][] = new PairDD[n][m]; for(int i = 0; i < n; i ++) a[i] = npdd(m); return a; }

		String booleanToString(boolean b) { return b ? "#" : "."; }

		final PrintWriter out = new PrintWriter(System.out);
		final PrintWriter err = new PrintWriter(System.err);
		final StringBuilder sb4prtln = new StringBuilder();
		void prt() { out.print(""); }
		<T> void prt(T a) { out.print(a); }
		void prtln() { out.println(""); }
		<T> void prtln(T a) { out.println(a); }
		void prtln(int... a) { sb4prtln.setLength(0); for(int ele : a) { sb4prtln.append(ele); sb4prtln.append(" "); } prtln(sb4prtln.toString().trim()); }
		void prtln(long... a) { sb4prtln.setLength(0); for(long ele : a) { sb4prtln.append(ele); sb4prtln.append(" "); } prtln(sb4prtln.toString().trim()); }
		void prtln(double... a) { sb4prtln.setLength(0); for(double ele : a) { sb4prtln.append(ele); sb4prtln.append(" "); } prtln(sb4prtln.toString().trim()); }
		void prtln(String... a) { sb4prtln.setLength(0); for(String ele : a) { sb4prtln.append(ele); sb4prtln.append(" "); } prtln(sb4prtln.toString().trim()); }
		void prtln(char... a) { sb4prtln.setLength(0); for(char ele : a) sb4prtln.append(ele); prtln(sb4prtln.toString()); }
		void prtln(boolean... a) { sb4prtln.setLength(0); for(boolean ele : a) sb4prtln.append(booleanToString(ele)); prtln(sb4prtln.toString()); }
		void prtlns(int... a) { sb4prtln.setLength(0); for(int ele : a) { sb4prtln.append(ele); sb4prtln.append("\n"); } prt(sb4prtln.toString()); }
		void prtlns(long... a) { sb4prtln.setLength(0); for(long ele : a) { sb4prtln.append(ele); sb4prtln.append("\n"); } prt(sb4prtln.toString()); }
		void prtlns(double... a) { sb4prtln.setLength(0); for(double ele : a) { sb4prtln.append(ele); sb4prtln.append("\n"); } prt(sb4prtln.toString()); }
		void prtlns(String... a) { sb4prtln.setLength(0); for(String ele : a) { sb4prtln.append(ele); sb4prtln.append("\n"); } prt(sb4prtln.toString()); }
		void prtlns(char... a) { sb4prtln.setLength(0); for(char ele : a) { sb4prtln.append(ele); sb4prtln.append("\n"); } prt(sb4prtln.toString()); }
		void prtlns(boolean... a) { sb4prtln.setLength(0); for(boolean ele : a) { sb4prtln.append(booleanToString(ele)); sb4prtln.append("\n"); } prt(sb4prtln.toString()); }
		void prtln(int[][] a) { for(int[] ele : a) prtln(ele); }
		void prtln(long[][] a) { for(long[] ele : a) prtln(ele); }
		void prtln(double[][] a) { for(double[] ele : a) prtln(ele); }
		void prtln(String[][] a) { for(String[] ele : a) prtln(ele); }
		void prtln(char[][] a) { for(char[] ele : a) prtln(ele); }
		void prtln(boolean[][] a) { for(boolean[] ele : a) prtln(ele); }

		String errconvert(int a) { return isINF(a) ? "_" : String.valueOf(a); }
		String errconvert(long a) { return isINF(a) ? "_" : String.valueOf(a); }
		void errprt(int a) { if(DEBUG) err.print(errconvert(a)); }
		void errprt(long a) { if(DEBUG) err.print(errconvert(a)); }
		void errprt() { if(DEBUG) err.print(""); }
		<T> void errprt(T a) { if(DEBUG) err.print(a); }
		void errprt(boolean a) { if(DEBUG) errprt(booleanToString(a)); }
		void errprtln() { if(DEBUG) err.println(""); }
		void errprtln(int a) { if(DEBUG) err.println(errconvert(a)); }
		void errprtln(long a) { if(DEBUG) err.println(errconvert(a)); }
		<T> void errprtln(T a) { if(DEBUG) err.println(a); }
		void errprtln(boolean a) { if(DEBUG) errprtln(booleanToString(a)); }
		void errprtln(int... a) { if(DEBUG) { sb4prtln.setLength(0); for(int ele : a) { sb4prtln.append(errconvert(ele)); sb4prtln.append(" "); } errprtln(sb4prtln.toString().trim()); } }
		void errprtln(long... a) { if(DEBUG) { sb4prtln.setLength(0); for(long ele : a) { sb4prtln.append(errconvert(ele)); sb4prtln.append(" "); } errprtln(sb4prtln.toString().trim()); } }
		void errprtln(double... a) { if(DEBUG) { sb4prtln.setLength(0); for(double ele : a) { sb4prtln.append(ele); sb4prtln.append(" "); } errprtln(sb4prtln.toString().trim()); } }
		void errprtln(String... a) { if(DEBUG) { sb4prtln.setLength(0); for(String ele : a) { sb4prtln.append(ele); sb4prtln.append(" "); } errprtln(sb4prtln.toString().trim()); } }
		void errprtln(char... a) { if(DEBUG) { sb4prtln.setLength(0); for(char ele : a) sb4prtln.append(ele); errprtln(sb4prtln.toString()); } }
		void errprtln(boolean... a) { if(DEBUG) { sb4prtln.setLength(0); for(boolean ele : a) sb4prtln.append(booleanToString(ele)); errprtln(sb4prtln.toString()); } }
		void errprtlns(int... a) { if(DEBUG) { sb4prtln.setLength(0); for(int ele : a) { sb4prtln.append(errconvert(ele)); sb4prtln.append("\n"); } errprt(sb4prtln.toString()); } }
		void errprtlns(long... a) { if(DEBUG) { sb4prtln.setLength(0); for(long ele : a) { sb4prtln.append(errconvert(ele)); sb4prtln.append("\n"); } errprt(sb4prtln.toString()); } }
		void errprtlns(double... a) { if(DEBUG) { sb4prtln.setLength(0); for(double ele : a) { sb4prtln.append(ele); sb4prtln.append("\n"); } errprt(sb4prtln.toString()); } }
		void errprtlns(String... a) { if(DEBUG) { sb4prtln.setLength(0); for(String ele : a) { sb4prtln.append(ele); sb4prtln.append("\n"); } errprt(sb4prtln.toString()); } }
		void errprtlns(char... a) { if(DEBUG) { sb4prtln.setLength(0); for(char ele : a) { sb4prtln.append(ele); sb4prtln.append("\n"); } errprt(sb4prtln.toString()); } }
		void errprtlns(boolean... a) { if(DEBUG) { sb4prtln.setLength(0); for(boolean ele : a) { sb4prtln.append(booleanToString(ele)); sb4prtln.append("\n"); } errprt(sb4prtln.toString()); } }
		void errprtln(Object[] a) { if(DEBUG) for(Object ele : a) errprtln(ele); }
		void errprtln(int[][] a) { if(DEBUG) for(int[] ele : a) errprtln(ele); }
		void errprtln(long[][] a) { if(DEBUG) for(long[] ele : a) errprtln(ele); }
		void errprtln(double[][] a) { if(DEBUG) for(double[] ele : a) errprtln(ele); }
		void errprtln(String[][] a) { if(DEBUG) for(String[] ele : a) errprtln(ele); }
		void errprtln(char[][] a) { if(DEBUG) for(char[] ele : a) errprtln(ele); }
		void errprtln(boolean[][] a) { if(DEBUG) for(boolean[] ele : a) errprtln(ele); }
		void errprtln(Object[][] a) { if(DEBUG) for(Object ele : a) { errprtln(ele); errprtln(); } }

		void reply(boolean b) { prtln(b ? "Yes" : "No"); }
		void REPLY(boolean b) { prtln(b ? "YES" : "NO"); }

		void flush() { out.flush(); if(DEBUG) err.flush(); }
		void assertion(boolean b) { if(!b) { flush(); throw new AssertionError(); } }
		<T> void assertion(boolean b, T a) { if(!b) { errprtln(a); flush(); throw new AssertionError(); } }
		void assertion(boolean b, int... a) { if(!b) { errprtln(a); flush(); throw new AssertionError(); } }
		void assertion(boolean b, long... a) { if(!b) { errprtln(a); flush(); throw new AssertionError(); } }
		void assertion(boolean b, double... a) { if(!b) { errprtln(a); flush(); throw new AssertionError(); } }
		void assertion(boolean b, String... a) { if(!b) { errprtln(a); flush(); throw new AssertionError(); } }
		void assertion(boolean b, char... a) { if(!b) { errprtln(a); flush(); throw new AssertionError(); } }
		void assertion(boolean b, boolean... a) { if(!b) { errprtln(a); flush(); throw new AssertionError(); } }
		void assertion(boolean b, int[][] a) { if(!b) { errprtln(a); flush(); throw new AssertionError(); } }
		void assertion(boolean b, long[][] a) { if(!b) { errprtln(a); flush(); throw new AssertionError(); } }
		void assertion(boolean b, double[][] a) { if(!b) { errprtln(a); flush(); throw new AssertionError(); } }
		void assertion(boolean b, String[][] a) { if(!b) { errprtln(a); flush(); throw new AssertionError(); } }
		void assertion(boolean b, char[][] a) { if(!b) { errprtln(a); flush(); throw new AssertionError(); } }
		void assertion(boolean b, boolean[][] a) { if(!b) { errprtln(a); flush(); throw new AssertionError(); } }
		void inclusiveRangeCheck(int i, int max) { inclusiveRangeCheck(i, 0, max); }
		void inclusiveRangeCheck(int i, int min, int max) { rangeCheck(i, min, max + 1); }
		void rangeCheck(int i, int max) { rangeCheck(i, 0, max); }
		void rangeCheck(int i, int min, int max) { if(i < min || i >= max) throw new IndexOutOfBoundsException(String.format("Index %d out of bounds for length %d", i, max)); }
		void nonNegativeCheck(long x) { nonNegativeCheck(x, "the argument"); }
		void nonNegativeCheck(long x, String attribute) { if(x < 0) throw new IllegalArgumentException(String.format("%s %d is negative", attribute, x)); }
		void positiveCheck(long x) { positiveCheck(x, "the argument"); }
		void positiveCheck(long x, String attribute) { if(x <= 0) throw new IllegalArgumentException(String.format("%s %d is negative", attribute, x)); }

		void exit() { flush(); System.exit(0); }
		<T> void exit(T a) { prtln(a); exit(); }
		void exit(int... a) { prtln(a); exit(); }
		void exit(long... a) { prtln(a); exit(); }
		void exit(double... a) { prtln(a); exit(); }
		void exit(String... a) { prtln(a); exit(); }
		void exit(char... a) { prtln(a); exit(); }
		void exit(boolean... a) { prtln(a); exit(); }
		void exit(int[][] a) { prtln(a); exit(); }
		void exit(long[][] a) { prtln(a); exit(); }
		void exit(double[][] a) { prtln(a); exit(); }
		void exit(String[][] a) { prtln(a); exit(); }
		void exit(char[][] a) { prtln(a); exit(); }
		void exit(boolean[][] a) { prtln(a); exit(); }


		final long INF = (long)1e18 + 7;
		boolean isPlusINF(long a) { return a > INF / 10; }
		boolean isMinusINF(long a) { return isPlusINF(- a); }
		boolean isINF(long a) { return isPlusINF(a) || isMinusINF(a); }
		final int I_INF = (int)1e9 + 7;
		boolean isPlusINF(int a) { return a > I_INF / 10; }
		boolean isMinusINF(int a) { return isPlusINF(- a); }
		boolean isINF(int a) { return isPlusINF(a) || isMinusINF(a); }


		int min(int a, int b) { return Math.min(a, b); }
		long min(long a, long b) { return Math.min(a, b); }
		double min(double a, double b) { return Math.min(a, b); }
		<T extends Comparable<T>> T min(T a, T b) { return a.compareTo(b) <= 0 ? a : b; }
		int min(int... x) { int min = x[0]; for(int val : x) min = min(min, val); return min; }
		long min(long... x) { long min = x[0]; for(long val : x) min = min(min, val); return min; }
		double min(double... x) { double min = x[0]; for(double val : x) min = min(min, val); return min; }
		int max(int a, int b) { return Math.max(a, b); }
		long max(long a, long b) { return Math.max(a, b); }
		double max(double a, double b) { return Math.max(a, b); }
		<T extends Comparable<T>> T max(T a, T b) { return a.compareTo(b) >= 0 ? a : b; }
		int max(int... x) { int max = x[0]; for(int val : x) max = max(max, val); return max; }
		long max(long... x) { long max = x[0]; for(long val : x) max = max(max, val); return max; }
		double max(double... x) { double max = x[0]; for(double val : x) max = max(max, val); return max; }
		<T extends Comparable<T>> T max(T[] x) { T max = x[0]; for(T val : x) max = max(max, val); return max; }
		int max(int[][] a) { int max = a[0][0]; for(int[] ele : a) max = max(max, max(ele)); return max; }
		long max(long[][] a) { long max = a[0][0]; for(long[] ele : a) max = max(max, max(ele)); return max; }
		double max(double[][] a) { double max = a[0][0]; for(double[] ele : a) max = max(max, max(ele)); return max; }
		<T extends Comparable<T>> T max(T[][] a) { T max = a[0][0]; for(T[] ele : a) max = max(max, max(ele)); return max; }
		long sum(int... a) { long sum = 0; for(int ele : a) sum += ele; return sum; }
		long sum(long... a) { long sum = 0; for(long ele : a) sum += ele; return sum; }
		double sum(double... a) { double sum = 0; for(double ele : a) sum += ele; return sum; }
		long sum(boolean... a) { long sum = 0; for(boolean ele : a) sum += ele ? 1 : 0; return sum; }
		long[] sums(int[] a) { long sum[] = new long[a.length + 1]; sum[0] = 0; for(int i = 0; i < a.length; i ++) sum[i + 1] = sum[i] + a[i]; return sum; }
		long[] sums(long[] a) { long sum[] = new long[a.length + 1]; sum[0] = 0; for(int i = 0; i < a.length; i ++) sum[i + 1] = sum[i] + a[i]; return sum; }
		double[] sums(double[] a) { double sum[] = new double[a.length + 1]; sum[0] = 0; for(int i = 0; i < a.length; i ++) sum[i + 1] = sum[i] + a[i]; return sum; }
		long[] sums(boolean[] a) { long sum[] = new long[a.length + 1]; sum[0] = 0; for(int i = 0; i < a.length; i ++) sum[i + 1] = sum[i] + (a[i] ? 1 : 0); return sum; }
		long[][] sums(int[][] a) {
			long sum[][] = new long[a.length + 1][];
			fill(sum, 0);
			for(int i = 0; i < a.length; i ++) {
				sum[i] = new long[a[i].length + 1];
				for(int j = 0; j < a[i].length; j ++) sum[i + 1][j + 1] = sum[i + 1][j] + sum[i][j + 1] - sum[i][j] + a[i][j];
			}
			return sum;
		}
		long[][] sums(long[][] a) {
			long sum[][] = new long[a.length + 1][];
			fill(sum, 0);
			for(int i = 0; i < a.length; i ++) {
				sum[i] = new long[a[i].length + 1];
				for(int j = 0; j < a[i].length; j ++) sum[i + 1][j + 1] = sum[i + 1][j] + sum[i][j + 1] - sum[i][j] + a[i][j];
			}
			return sum;
		}
		double[][] sums(double[][] a) {
			double sum[][] = new double[a.length + 1][];
			fill(sum, 0);
			for(int i = 0; i < a.length; i ++) {
				sum[i] = new double[a[i].length + 1];
				for(int j = 0; j < a[i].length; j ++) sum[i + 1][j + 1] = sum[i + 1][j] + sum[i][j + 1] - sum[i][j] + a[i][j];
			}
			return sum;
		}
		long[][] sums(boolean[][] a) {
			long sum[][] = new long[a.length + 1][];
			fill(sum, 0);
			for(int i = 0; i < a.length; i ++) {
				sum[i] = new long[a[i].length + 1];
				for(int j = 0; j < a[i].length; j ++) sum[i + 1][j + 1] = sum[i + 1][j] + sum[i][j + 1] - sum[i][j] + (a[i][j] ? 1 : 0);
			}
			return sum;
		}
		int constrain(int x, int l, int r) { return min(max(x, min(l, r)), max(l, r)); }
		long constrain(long x, long l, long r) { return min(max(x, min(l, r)), max(l, r)); }
		double constrain(double x, double l, double r) { return min(max(x, min(l, r)), max(l, r)); }
		int abs(int x) { return x >= 0 ? x : - x; }
		long abs(long x) { return x >= 0 ? x : - x; }
		double abs(double x) { return x >= 0 ? x : - x; }
		int signum(int x) { return x > 0 ? 1 : x < 0 ? -1 : 0; }
		int signum(long x) { return x > 0 ? 1 : x < 0 ? -1 : 0; }
		int signum(double x) { return x > 0 ? 1 : x < 0 ? -1 : 0; }
		long round(double x) { return Math.round(x); }
		long floor(double x) { return (long)Math.floor(x); }
		int divfloor(int a, int b) { return signum(a) == signum(b) ? a / b : - divceil(abs(a), abs(b)); }
		long divfloor(long a, long b) { return signum(a) == signum(b) ? a / b : - divceil(abs(a), abs(b)); }
		long ceil(double x) { return (long)Math.ceil(x); }
		int divceil(int a, int b) { return a >= 0 && b > 0 ? (a + b - 1) / b : a < 0 && b < 0 ? divceil(abs(a), abs(b)) : - divfloor(abs(a), abs(b)); }
		long divceil(long a, long b) { return a >= 0 && b > 0 ? (a + b - 1) / b : a < 0 && b < 0 ? divceil(abs(a), abs(b)) : - divfloor(abs(a), abs(b)); }
		double sqrt(int x) { return Math.sqrt((double)x); }
		double sqrt(long x) { return Math.sqrt((double)x); }
		double sqrt(double x) { return Math.sqrt(x); }
		long fact(int n) { long ans = 1; for(int i = 1; i <= n; i ++) ans = Math.multiplyExact(ans, i); return ans; }
		double pow(double x, double y) { return Math.pow(x, y); }
		long pow(long x, long y) {
			long ans = 1;
			while(true) {
				if(y % 2 != 0) ans = Math.multiplyExact(ans, x);
				y /= 2;
				if(y <= 0) return ans;
				x = Math.multiplyExact(x, x);
			}
		}
		int gcd(int a, int b) { while(true) { if(b == 0) return a; int tmp = a; a = b; b = tmp % b; } }
		long gcd(long a, long b) { while(true) { if(b == 0) return a; long tmp = a; a = b; b = tmp % b; } }
		long lcm(long a, long b) { return a / gcd(a, b) * b; }
		int gcd(int... a) { int gcd = 0; for(int i = 0; i < a.length; i ++) gcd = gcd(gcd, a[i]); return gcd; }
		long gcd(long... a) { long gcd = 0; for(int i = 0; i < a.length; i ++) gcd = gcd(gcd, a[i]); return gcd; }
		double random() { return Math.random(); }
		int random(int max) { return (int)floor(random() * max); }
		long random(long max) { return floor(random() * max); }
		double random(double max) { return random() * max; }
		int random(int min, int max) { return random(max - min) + min; }
		long random(long min, long max) { return random(max - min) + min; }
		double random(double min, double max) { return random(max - min) + min; }

		boolean isUpper(char a) { return a >= 'A' && a <= 'Z'; }
		boolean isLower(char a) { return a >= 'a' && a <= 'z'; }
		int upperToInt(char a) { return a - 'A'; }
		int lowerToInt(char a) { return a - 'a'; }
		int numToInt(char a) { return a - '0'; }
		int charToInt(char a) { return a >= 'a' ? lowerToInt(a) : a >= 'A' ? upperToInt(a) : numToInt(a); }
		char intToUpper(int a) { return (char)(a + 'A'); }
		char intToLower(int a) { return (char)(a + 'a'); }
		char intToNum(int a) { return (char)(a + '0'); }
		int[] charToInt(char[] a) { int array[] = new int[a.length]; for(int i = 0; i < a.length; i ++) array[i] = charToInt(a[i]); return array; }

		long[] div(long a) {
			nonNegativeCheck(a);
			List<Long> divList = new ArrayList<>();
			for(long i = 1; i * i <= a; i ++) if(a % i == 0) { divList.add(i); if(i * i != a) divList.add(a / i); }
			long div[] = new long[divList.size()];
			for(int i = 0; i < divList.size(); i ++) div[i] = divList.get(i);
			Arrays.sort(div);
			return div;
		}

		PairLL[] factor(long a) {
			nonNegativeCheck(a);
			List<PairLL> factorList = new ArrayList<>();
			for(long i = 2; i * i <= a; i ++) {
				if(a % i == 0) {
					long cnt = 0;
					while(a % i == 0) { a /= i; cnt ++; }
					factorList.add(new PairLL(i, cnt));
				}
			}
			if(a > 1) factorList.add(new PairLL(a, 1));
			PairLL factor[] = new PairLL[factorList.size()];
			for(int i = 0; i < factorList.size(); i ++) factor[i] = factorList.get(i);
			Arrays.sort(factor);
			return factor;
		}

		boolean isPrime(long x) { boolean ok = x > 1; for(long i = 2; i * i <= x; i ++) { ok &= x % i != 0; if(!ok) return ok; } return ok; }
		boolean[] prime(int num) {
			nonNegativeCheck(num);
			boolean prime[] = new boolean[num];
			fill(prime, true);
			if(num > 0) prime[0] = false;
			if(num > 1) prime[1] = false;
			for(int i = 2; i < num; i ++) if(prime[i]) for(int j = 2; i * j < num; j ++) prime[i * j] = false;
			return prime;
		}

		PairIL[] countElements(int[] a, boolean sort) {
			int len = a.length;
			int array[] = new int[len];
			for(int i = 0; i < len; i ++) array[i] = a[i];
			if(sort) Arrays.sort(array);
			List<PairIL> cntsList = new ArrayList<>();
			long tmp = 1;
			for(int i = 1; i <= len; i ++) {
				if(i == len || array[i] != array[i - 1]) {
					cntsList.add(new PairIL(array[i - 1], tmp));
					tmp = 1;
				}else tmp ++;
			}
			PairIL cnts[] = new PairIL[cntsList.size()];
			for(int i = 0; i < cntsList.size(); i ++) cnts[i] = cntsList.get(i);
			return cnts;
		}
		PairLL[] countElements(long[] a, boolean sort) {
			int len = a.length;
			long array[] = new long[len];
			for(int i = 0; i < len; i ++) array[i] = a[i];
			if(sort) Arrays.sort(array);
			List<PairLL> cntsList = new ArrayList<>();
			long tmp = 1;
			for(int i = 1; i <= len; i ++) {
				if(i == len || array[i] != array[i - 1]) {
					cntsList.add(new PairLL(array[i - 1], tmp));
					tmp = 1;
				}else tmp ++;
			}
			PairLL cnts[] = new PairLL[cntsList.size()];
			for(int i = 0; i < cntsList.size(); i ++) cnts[i] = cntsList.get(i);
			return cnts;
		}
		PairIL[] countElements(String s, boolean sort) {
			int len = s.length();
			char array[] = s.toCharArray();
			if(sort) Arrays.sort(array);
			List<PairIL> cntsList = new ArrayList<>();
			long tmp = 1;
			for(int i = 1; i <= len; i ++) {
				if(i == len || array[i] != array[i - 1]) {
					cntsList.add(new PairIL((int)array[i - 1], tmp));
					tmp = 1;
				}else tmp ++;
			}
			PairIL cnts[] = new PairIL[cntsList.size()];
			for(int i = 0; i < cntsList.size(); i ++) cnts[i] = cntsList.get(i);
			return cnts;
		}

		int[] baseConvert(long x, int n, int len) { nonNegativeCheck(x); nonNegativeCheck(n); nonNegativeCheck(len); int digit[] = new int[len]; int i = 0; long tmp = x; while(tmp > 0 && i < len) { digit[i ++] = (int)(tmp % n); tmp /= n; } return digit; }
		int[] baseConvert(long x, int n) { nonNegativeCheck(x); nonNegativeCheck(n); long tmp = x; int len = 0; while(tmp > 0) { tmp /= n; len ++; } return baseConvert(x, n, len); }
		int[] baseConvert(int x, int n, int len) { nonNegativeCheck(x); nonNegativeCheck(n); nonNegativeCheck(len); int digit[] = new int[len]; int i = 0; int tmp = x; while(tmp > 0 && i < len) { digit[i ++] = (int)(tmp % n); tmp /= n; } return digit; }
		int[] baseConvert(int x, int n) { nonNegativeCheck(x); nonNegativeCheck(n); int tmp = x; int len = 0; while(tmp > 0) { tmp /= n; len ++; } return baseConvert(x, n, len); }
		long[] baseConvert(long x, long n, int len) { nonNegativeCheck(x); nonNegativeCheck(n); nonNegativeCheck(len); long digit[] = new long[len]; int i = 0; long tmp = x; while(tmp > 0 && i < len) { digit[i ++] = tmp % n; tmp /= n; } return digit; }
		long[] baseConvert(long x, long n) { nonNegativeCheck(x); nonNegativeCheck(n); long tmp = x; int len = 0; while(tmp > 0) { tmp /= n; len ++; } return baseConvert(x, n, len); }

		int numDigits(long a) { nonNegativeCheck(a); return Long.toString(a).length(); }
		long bitFlag(int a) { nonNegativeCheck(a); return 1L << (long)a; }
		boolean isFlagged(long x, int a) { nonNegativeCheck(x); nonNegativeCheck(a); return (x & bitFlag(a)) != 0; }

		long countString(String s, String a) { return (s.length() - s.replace(a, "").length()) / a.length(); }
		long countStringAll(String s, String a) { return s.length() - s.replaceAll(a, "").length(); }


		String reverse(String s) { return (new StringBuilder(s)).reverse().toString(); }
		void reverse(String[] a) { for(int i = 0; i < a.length / 2; i ++) swap(a, i, a.length - i - 1); }
		void reverse(int[] a) { for(int i = 0; i < a.length / 2; i ++) swap(a, i, a.length - i - 1); }
		void reverse(long[] a) { for(int i = 0; i < a.length / 2; i ++) swap(a, i, a.length - i - 1); }
		void reverse(double[] a) { for(int i = 0; i < a.length / 2; i ++) swap(a, i, a.length - i - 1); }
		void reverse(char[] a) { for(int i = 0; i < a.length / 2; i ++) swap(a, i, a.length - i - 1); }
		void reverse(boolean[] a) { for(int i = 0; i < a.length / 2; i ++) swap(a, i, a.length - i - 1); }
		<T> void reverse(T[] a) { for(int i = 0; i < a.length / 2; i ++) swap(a, i, a.length - i - 1); }
		void fill(int[] a, int x) { Arrays.fill(a, x); }
		void fill(long[] a, long x) { Arrays.fill(a, x); }
		void fill(double[] a, double x) { Arrays.fill(a, x); }
		void fill(char[] a, char x) { Arrays.fill(a, x); }
		void fill(boolean[] a, boolean x) { Arrays.fill(a, x); }
		void fill(int[][] a, int x) { for(int[] ele : a) fill(ele, x); }
		void fill(long[][] a, long x) { for(long[] ele : a) fill(ele, x); }
		void fill(double[][] a, double x) { for(double[] ele : a) fill(ele, x); }
		void fill(char[][] a, char x) { for(char[] ele : a) fill(ele, x); }
		void fill(boolean[][] a, boolean x) { for(boolean[] ele : a) fill(ele, x); }
		void fill(int[][][] a, int x) { for(int[][] ele : a) fill(ele, x); }
		void fill(long[][][] a, long x) { for(long[][] ele : a) fill(ele, x); }
		void fill(double[][][] a, double x) { for(double[][] ele : a) fill(ele, x); }
		void fill(char[][][] a, char x) { for(char[][] ele : a) fill(ele, x); }
		void fill(boolean[][][] a, boolean x) { for(boolean[][] ele : a) fill(ele, x); }

		int[] resize(int[] a, int m, int x) { nonNegativeCheck(m); int resized[] = new int[m]; for(int i = max(0, - x); i < a.length && i + x < m; i ++) resized[i + x] = a[i]; return resized; }
		long[] resize(long[] a, int m, int x) { nonNegativeCheck(m); long resized[] = new long[m]; for(int i = max(0, - x); i < a.length && i + x < m; i ++) resized[i + x] = a[i]; return resized; }
		double[] resize(double[] a, int m, int x) { nonNegativeCheck(m); double resized[] = new double[m]; for(int i = max(0, - x); i < a.length && i + x < m; i ++) resized[i + x] = a[i]; return resized; }
		char[] resize(char[] a, int m, int x) { nonNegativeCheck(m); char resized[] = new char[m]; for(int i = max(0, - x); i < a.length && i + x < m; i ++) resized[i + x] = a[i]; return resized; }
		boolean[] resize(boolean[] a, int m, int x) { nonNegativeCheck(m); boolean resized[] = new boolean[m]; for(int i = max(0, - x); i < a.length && i + x < m; i ++) resized[i + x] = a[i]; return resized; }
		Object[] resize(Object[] a, int m, int x) { nonNegativeCheck(m); Object resized[] = new Object[m]; for(int i = max(0, - x); i < a.length && i + x < m; i ++) resized[i + x] = a[i]; return resized; }

		void shuffleArray(int[] a) { for(int i = 0; i < a.length; i ++){ int tmp = a[i]; int idx = random(i, a.length); a[i] = a[idx]; a[idx] = tmp; } }
		void shuffleArray(long[] a) { for(int i = 0; i < a.length; i ++){ long tmp = a[i]; int idx = random(i, a.length); a[i] = a[idx]; a[idx] = tmp; } }
		void shuffleArray(double[] a) { for(int i = 0; i < a.length; i ++){ double tmp = a[i]; int idx = random(i, a.length); a[i] = a[idx]; a[idx] = tmp; } }
		int[] randomi(int n, int max) { nonNegativeCheck(n); int a[] = new int[n]; for(int i = 0; i < n; i ++) a[i] = random(max); return a; }
		long[] randoml(int n, long max) { nonNegativeCheck(n); long a[] = new long[n]; for(int i = 0; i < n; i ++) a[i] = random(max); return a; }
		double[] randomd(int n, double max) { nonNegativeCheck(n); double a[] = new double[n]; for(int i = 0; i < n; i ++) a[i] = random(max); return a; }
		int[] randomi(int n, int min, int max) { nonNegativeCheck(n); int a[] = new int[n]; for(int i = 0; i < n; i ++) a[i] = random(min, max); return a; }
		long[] randoml(int n, long min, long max) { nonNegativeCheck(n); long a[] = new long[n]; for(int i = 0; i < n; i ++) a[i] = random(min, max); return a; }
		double[] randomd(int n, double min, double max) { nonNegativeCheck(n); double a[] = new double[n]; for(int i = 0; i < n; i ++) a[i] = random(min, max); return a; }

		void swap(String[] a, int i, int j) { rangeCheck(i, a.length); rangeCheck(j, a.length); String tmp = a[i]; a[i] = a[j]; a[j] = tmp; }
		void swap(int[] a, int i, int j) { rangeCheck(i, a.length); rangeCheck(j, a.length); int tmp = a[i]; a[i] = a[j]; a[j] = tmp; }
		void swap(long[] a, int i, int j) { rangeCheck(i, a.length); rangeCheck(j, a.length); long tmp = a[i]; a[i] = a[j]; a[j] = tmp; }
		void swap(double[] a, int i, int j) { rangeCheck(i, a.length); rangeCheck(j, a.length); double tmp = a[i]; a[i] = a[j]; a[j] = tmp; }
		void swap(char[] a, int i, int j) { rangeCheck(i, a.length); rangeCheck(j, a.length); char tmp = a[i]; a[i] = a[j]; a[j] = tmp; }
		void swap(boolean[] a, int i, int j) { rangeCheck(i, a.length); rangeCheck(j, a.length); boolean tmp = a[i]; a[i] = a[j]; a[j] = tmp; }
		<T> void swap(T[] a, int i, int j) { rangeCheck(i, a.length); rangeCheck(j, a.length); T tmp = a[i]; a[i] = a[j]; a[j] = tmp; }

		int[] compress(int[] a) {
			int n = a.length;
			Set<Integer> ts = new TreeSet<>();
			for(int i = 0; i < n; i ++) ts.add(a[i]);
			int compressed[] = new int[ts.size()];
			int j = 0;
			for(int x : ts) compressed[j ++] = x;
			for(int i = 0; i < n; i ++) a[i] = lowerBound(compressed, a[i]);
			return compressed;
		}
		long[] compress(long[] a) {
			int n = a.length;
			Set<Long> ts = new TreeSet<>();
			for(int i = 0; i < n; i ++) ts.add(a[i]);
			long compressed[] = new long[ts.size()];
			int j = 0;
			for(long x : ts) compressed[j ++] = x;
			for(int i = 0; i < n; i ++) a[i] = lowerBound(compressed, a[i]);
			return compressed;
		}
		double[] compress(double[] a) {
			int n = a.length;
			Set<Double> ts = new TreeSet<>();
			for(int i = 0; i < n; i ++) ts.add(a[i]);
			double compressed[] = new double[ts.size()];
			int j = 0;
			for(double x : ts) compressed[j ++] = x;
			for(int i = 0; i < n; i ++) a[i] = lowerBound(compressed, a[i]);
			return compressed;
		}


		int lowerBound(int[] a, int key) { return BS(a, key, true, true, true); }
		int lowerBound(int[] a, int key, int ng, int ok) { return BS(a, key, true, true, true, ng, ok); }
		int upperBound(int[] a, int key) { return BS(a, key, true, true, false); }
		int upperBound(int[] a, int key, int ng, int ok) { return BS(a, key, true, true, false, ng, ok); }
		int cntBS(int[] a, int key, boolean asc, boolean gt, boolean eq) { return BS(a, key, asc, gt, eq, true); }
		int cntBS(int[] a, int key, boolean asc, boolean gt, boolean eq, int ng, int ok) { return BS(a, key, asc, gt, eq, true, ng, ok); }
		int BS(int[] a, int key, boolean asc, boolean gt, boolean eq) { return BS(a, key, asc, gt, eq, false); }
		int BS(int[] a, int key, boolean asc, boolean gt, boolean eq, int ng, int ok) { return BS(a, key, asc, gt, eq, false, ng, ok); }
		int BS(int[] a, int key, boolean asc, boolean gt, boolean eq, boolean cnt) { return BS(a, key, asc, gt, eq, cnt, asc ^ gt ? a.length : -1, asc ^ gt ? -1 : a.length); }
		int BS(int[] a, int key, boolean asc, boolean gt, boolean eq, boolean cnt, int ng, int ok) { int index = binarySearch(a, key, gt, eq, ng, ok); return cnt ? (int)abs(ok - index) : index; }
		int binarySearch(int[] a, int key, boolean gt, boolean eq, int ng, int ok) { while (abs(ok - ng) > 1) { int mid = (ok + ng) / 2; if(isOKforBS(a, mid, key, gt, eq)) ok = mid; else ng = mid; } return ok; }
		boolean isOKforBS(int[] a, int index, int key, boolean gt, boolean eq) { return (a[index] > key && gt) || (a[index] < key && !gt) || (a[index] == key && eq); }
		int lowerBound(long[] a, long key) { return BS(a, key, true, true, true); }
		int lowerBound(long[] a, long key, int ng, int ok) { return BS(a, key, true, true, true, ng, ok); }
		int upperBound(long[] a, long key) { return BS(a, key, true, true, false); }
		int upperBound(long[] a, long key, int ng, int ok) { return BS(a, key, true, true, false, ng, ok); }
		int cntBS(long[] a, long key, boolean asc, boolean gt, boolean eq) { return BS(a, key, asc, gt, eq, true); }
		int cntBS(long[] a, long key, boolean asc, boolean gt, boolean eq, int ng, int ok) { return BS(a, key, asc, gt, eq, true, ng, ok); }
		int BS(long[] a, long key, boolean asc, boolean gt, boolean eq) { return BS(a, key, asc, gt, eq, false); }
		int BS(long[] a, long key, boolean asc, boolean gt, boolean eq, int ng, int ok) { return BS(a, key, asc, gt, eq, false, ng, ok); }
		int BS(long[] a, long key, boolean asc, boolean gt, boolean eq, boolean cnt) { return BS(a, key, asc, gt, eq, cnt, asc ^ gt ? a.length : -1, asc ^ gt ? -1 : a.length); }
		int BS(long[] a, long key, boolean asc, boolean gt, boolean eq, boolean cnt, int ng, int ok) { int index = binarySearch(a, key, gt, eq, ng, ok); return cnt ? (int)abs(ok - index) : index; }
		int binarySearch(long[] a, long key, boolean gt, boolean eq, int ng, int ok) { while (abs(ok - ng) > 1) { int mid = (ok + ng) / 2; if(isOKforBS(a, mid, key, gt, eq)) ok = mid; else ng = mid; } return ok; }
		boolean isOKforBS(long[] a, int index, long key, boolean gt, boolean eq) { return (a[index] > key && gt) || (a[index] < key && !gt) || (a[index] == key && eq); }
		int lowerBound(double[] a, double key) { return BS(a, key, true, true, true); }
		int lowerBound(double[] a, double key, int ng, int ok) { return BS(a, key, true, true, true, ng, ok); }
		int upperBound(double[] a, double key) { return BS(a, key, true, true, false); }
		int upperBound(double[] a, double key, int ng, int ok) { return BS(a, key, true, true, false, ng, ok); }
		int cntBS(double[] a, double key, boolean asc, boolean gt, boolean eq) { return BS(a, key, asc, gt, eq, true); }
		int cntBS(double[] a, double key, boolean asc, boolean gt, boolean eq, int ng, int ok) { return BS(a, key, asc, gt, eq, true, ng, ok); }
		int BS(double[] a, double key, boolean asc, boolean gt, boolean eq) { return BS(a, key, asc, gt, eq, false); }
		int BS(double[] a, double key, boolean asc, boolean gt, boolean eq, int ng, int ok) { return BS(a, key, asc, gt, eq, false, ng, ok); }
		int BS(double[] a, double key, boolean asc, boolean gt, boolean eq, boolean cnt) { return BS(a, key, asc, gt, eq, cnt, asc ^ gt ? a.length : -1, asc ^ gt ? -1 : a.length); }
		int BS(double[] a, double key, boolean asc, boolean gt, boolean eq, boolean cnt, int ng, int ok) { int index = binarySearch(a, key, gt, eq, ng, ok); return cnt ? (int)abs(ok - index) : index; }
		int binarySearch(double[] a, double key, boolean gt, boolean eq, int ng, int ok) { while (abs(ok - ng) > 1) { int mid = (ok + ng) / 2; if(isOKforBS(a, mid, key, gt, eq)) ok = mid; else ng = mid; } return ok; }
		boolean isOKforBS(double[] a, int index, double key, boolean gt, boolean eq) { return (a[index] > key && gt) || (a[index] < key && !gt) || (a[index] == key && eq); }
		<T extends Comparable<? super T>> int lowerBound(T[] a, T key) { return BS(a, key, true, true, true); }
		<T extends Comparable<? super T>> int lowerBound(T[] a, T key, int ng, int ok) { return BS(a, key, true, true, true, ng, ok); }
		<T extends Comparable<? super T>> int upperBound(T[] a, T key) { return BS(a, key, true, true, false); }
		<T extends Comparable<? super T>> int upperBound(T[] a, T key, int ng, int ok) { return BS(a, key, true, true, false, ng, ok); }
		<T extends Comparable<? super T>> int cntBS(T[] a, T key, boolean asc, boolean gt, boolean eq) { return BS(a, key, asc, gt, eq, true); }
		<T extends Comparable<? super T>> int cntBS(T[] a, T key, boolean asc, boolean gt, boolean eq, int ng, int ok) { return BS(a, key, asc, gt, eq, true, ng, ok); }
		<T extends Comparable<? super T>> int BS(T[] a, T key, boolean asc, boolean gt, boolean eq) { return BS(a, key, asc, gt, eq, false); }
		<T extends Comparable<? super T>> int BS(T[] a, T key, boolean asc, boolean gt, boolean eq, int ng, int ok) { return BS(a, key, asc, gt, eq, false, ng, ok); }
		<T extends Comparable<? super T>> int BS(T[] a, T key, boolean asc, boolean gt, boolean eq, boolean cnt) { return BS(a, key, asc, gt, eq, cnt, asc ^ gt ? a.length : -1, asc ^ gt ? -1 : a.length); }
		<T extends Comparable<? super T>> int BS(T[] a, T key, boolean asc, boolean gt, boolean eq, boolean cnt, int ng, int ok) { int index = binarySearch(a, key, gt, eq, ng, ok); return cnt ? (int)abs(ok - index) : index; }
		<T extends Comparable<? super T>> int binarySearch(T[] a, T key, boolean gt, boolean eq, int ng, int ok) { while (abs(ok - ng) > 1) { int mid = (ok + ng) / 2; if(isOKforBS(a, mid, key, gt, eq)) ok = mid; else ng = mid; } return ok; }
		<T extends Comparable<? super T>> boolean isOKforBS(T[] a, int index, T key, boolean gt, boolean eq) { int compare = a[index].compareTo(key); return (compare > 0 && gt) || (compare < 0 && !gt) || (compare == 0 && eq); }
		<T> int lowerBound(T[] a, T key, Comparator<? super T> c) { return BS(a, key, true, true, true, c); }
		<T> int lowerBound(T[] a, T key, int ng, int ok, Comparator<? super T> c) { return BS(a, key, true, true, true, ng, ok, c); }
		<T> int upperBound(T[] a, T key, Comparator<? super T> c) { return BS(a, key, true, true, false, c); }
		<T> int upperBound(T[] a, T key, int ng, int ok, Comparator<? super T> c) { return BS(a, key, true, true, false, ng, ok, c); }
		<T> int cntBS(T[] a, T key, boolean asc, boolean gt, boolean eq, Comparator<? super T> c) { return BS(a, key, asc, gt, eq, true, c); }
		<T> int cntBS(T[] a, T key, boolean asc, boolean gt, boolean eq, int ng, int ok, Comparator<? super T> c) { return BS(a, key, asc, gt, eq, true, ng, ok, c); }
		<T> int BS(T[] a, T key, boolean asc, boolean gt, boolean eq, Comparator<? super T> c) { return BS(a, key, asc, gt, eq, false, c); }
		<T> int BS(T[] a, T key, boolean asc, boolean gt, boolean eq, int ng, int ok, Comparator<? super T> c) { return BS(a, key, asc, gt, eq, false, ng, ok, c); }
		<T> int BS(T[] a, T key, boolean asc, boolean gt, boolean eq, boolean cnt, Comparator<? super T> c) { return BS(a, key, asc, gt, eq, cnt, asc ^ gt ? a.length : -1, asc ^ gt ? -1 : a.length, c); }
		<T> int BS(T[] a, T key, boolean asc, boolean gt, boolean eq, boolean cnt, int ng, int ok, Comparator<? super T> c) { int index = binarySearch(a, key, gt, eq, ng, ok, c); return cnt ? (int)abs(ok - index) : index; }
		<T> int binarySearch(T[] a, T key, boolean gt, boolean eq, int ng, int ok, Comparator<? super T> c) { while (abs(ok - ng) > 1) { int mid = (ok + ng) / 2; if(isOKforBS(a, mid, key, gt, eq, c)) ok = mid; else ng = mid; } return ok; }
		<T> boolean isOKforBS(T[] a, int index, T key, boolean gt, boolean eq, Comparator<? super T> c) { int compare = c.compare(a[index], key); return (compare > 0 && gt) || (compare < 0 && !gt) || (compare == 0 && eq); }
		<T extends Comparable<? super T>> int lowerBound(List<T> a, T key) { return BS(a, key, true, true, true); }
		<T extends Comparable<? super T>> int lowerBound(List<T> a, T key, int ng, int ok) { return BS(a, key, true, true, true, ng, ok); }
		<T extends Comparable<? super T>> int upperBound(List<T> a, T key) { return BS(a, key, true, true, false); }
		<T extends Comparable<? super T>> int upperBound(List<T> a, T key, int ng, int ok) { return BS(a, key, true, true, false, ng, ok); }
		<T extends Comparable<? super T>> int cntBS(List<T> a, T key, boolean asc, boolean gt, boolean eq) { return BS(a, key, asc, gt, eq, true); }
		<T extends Comparable<? super T>> int cntBS(List<T> a, T key, boolean asc, boolean gt, boolean eq, int ng, int ok) { return BS(a, key, asc, gt, eq, true, ng, ok); }
		<T extends Comparable<? super T>> int BS(List<T> a, T key, boolean asc, boolean gt, boolean eq) { return BS(a, key, asc, gt, eq, false); }
		<T extends Comparable<? super T>> int BS(List<T> a, T key, boolean asc, boolean gt, boolean eq, int ng, int ok) { return BS(a, key, asc, gt, eq, false, ng, ok); }
		<T extends Comparable<? super T>> int BS(List<T> a, T key, boolean asc, boolean gt, boolean eq, boolean cnt) { return BS(a, key, asc, gt, eq, cnt, asc ^ gt ? a.size() : -1, asc ^ gt ? -1 : a.size()); }
		<T extends Comparable<? super T>> int BS(List<T> a, T key, boolean asc, boolean gt, boolean eq, boolean cnt, int ng, int ok) { int index = binarySearch(a, key, gt, eq, ng, ok); return cnt ? (int)abs(ok - index) : index; }
		<T extends Comparable<? super T>> int binarySearch(List<T> a, T key, boolean gt, boolean eq, int ng, int ok) { while (abs(ok - ng) > 1) { int mid = (ok + ng) / 2; if(isOKforBS(a, mid, key, gt, eq)) ok = mid; else ng = mid; } return ok; }
		<T extends Comparable<? super T>> boolean isOKforBS(List<T> a, int index, T key, boolean gt, boolean eq) { int compare = a.get(index).compareTo(key); return (compare > 0 && gt) || (compare < 0 && !gt) || (compare == 0 && eq); }
		<T> int lowerBound(List<T> a, T key, Comparator<? super T> c) { return BS(a, key, true, true, true, c); }
		<T> int lowerBound(List<T> a, T key, int ng, int ok, Comparator<? super T> c) { return BS(a, key, true, true, true, ng, ok, c); }
		<T> int upperBound(List<T> a, T key, Comparator<? super T> c) { return BS(a, key, true, true, false, c); }
		<T> int upperBound(List<T> a, T key, int ng, int ok, Comparator<? super T> c) { return BS(a, key, true, true, false, ng, ok, c); }
		<T> int cntBS(List<T> a, T key, boolean asc, boolean gt, boolean eq, Comparator<? super T> c) { return BS(a, key, asc, gt, eq, true, c); }
		<T> int cntBS(List<T> a, T key, boolean asc, boolean gt, boolean eq, int ng, int ok, Comparator<? super T> c) { return BS(a, key, asc, gt, eq, true, ng, ok, c); }
		<T> int BS(List<T> a, T key, boolean asc, boolean gt, boolean eq, Comparator<? super T> c) { return BS(a, key, asc, gt, eq, false, c); }
		<T> int BS(List<T> a, T key, boolean asc, boolean gt, boolean eq, int ng, int ok, Comparator<? super T> c) { return BS(a, key, asc, gt, eq, false, ng, ok, c); }
		<T> int BS(List<T> a, T key, boolean asc, boolean gt, boolean eq, boolean cnt, Comparator<? super T> c) { return BS(a, key, asc, gt, eq, cnt, asc ^ gt ? a.size() : -1, asc ^ gt ? -1 : a.size(), c); }
		<T> int BS(List<T> a, T key, boolean asc, boolean gt, boolean eq, boolean cnt, int ng, int ok, Comparator<? super T> c) { int index = binarySearch(a, key, gt, eq, ng, ok, c); return cnt ? (int)abs(ok - index) : index; }
		<T> int binarySearch(List<T> a, T key, boolean gt, boolean eq, int ng, int ok, Comparator<? super T> c) { while (abs(ok - ng) > 1) { int mid = (ok + ng) / 2; if(isOKforBS(a, mid, key, gt, eq, c)) ok = mid; else ng = mid; } return ok; }
		<T> boolean isOKforBS(List<T> a, int index, T key, boolean gt, boolean eq, Comparator<? super T> c) { int compare = c.compare(a.get(index), key); return (compare > 0 && gt) || (compare < 0 && !gt) || (compare == 0 && eq); }

		PairLL binaryRangeSearch(long left, long right, UnaryOperator<Long> op, boolean minimize) {
			long ok1 = right, ng1 = left;
			while(abs(ok1 - ng1) > 1) {
				long mid = (ok1 + ng1) / 2;
				boolean isOK = (op.apply(mid + 1) - op.apply(mid)) * (minimize ? 1 : -1) >= 0;
				if(isOK) ok1 = mid; else ng1 = mid;
			}
			long ok2 = left, ng2 = right;
			while(abs(ok2 - ng2) > 1) {
				long mid = (ok2 + ng2) / 2;
				boolean isOK = (op.apply(mid - 1) - op.apply(mid)) * (minimize ? 1 : -1) >= 0;
				if(isOK) ok2 = mid; else ng2 = mid;
			}
			return new PairLL(ok1, ok2); //[l, r]
		}

		double ternarySearch(double left, double right, UnaryOperator<Double> op, boolean minimize, int loop) {
			for(int cnt = 0; cnt < loop; cnt ++) {
				double m1 = (left * 2 + right) / 3.0;
				double m2 = (left + right * 2) / 3.0;
				if(op.apply(m1) > op.apply(m2) ^ minimize) right = m2; else left = m1;
			}
			return (left + right) / 2.0;
		}


		// mods
		long mod(long x, long mod) { x %= mod; return x + (x < 0 ? mod : 0); }
		long pow_m(long x, long y, long mod) {
			nonNegativeCheck(y);
			x = mod(x, mod);
			long ans = 1;
			for(; y > 0; y /= 2) {
				if(y % 2 != 0) ans = mod(ans * x, mod);
				x = mod(x * x, mod);
			}
			return ans;
		}
		final long MAX_MUL = 1l << 31;
		long mul_m(long x, long y, long mod) {
			x = mod(x, mod);
			y = mod(y, mod);
			if(x <= MAX_MUL && y <= MAX_MUL) return mod(x * y, mod);
			if(x <= y) { long tmp = x; x = y; y = tmp; }
			long ans = 0;
			for(; y > 0; y /= 2) {
				if(y % 2 != 0) ans = mod(ans + x, mod);
				x = mod(x + x, mod);
			}
			return ans;
		}
		long inv(long x, long mod) { return pow_m(x, mod - 2, mod); } // O(logM)

		final long MOD = (long)1e9 + 7; // 998244353;
		long mod(long x) { return mod(x, MOD); }
		void mod(long[] a) { for(int i = 0; i < a.length; i ++) a[i] = mod(a[i]); }
		void mod(long[][] a) { for(int i = 0; i < a.length; i ++) mod(a[i]); }
		void mod(long[][][] a) { for(int i = 0; i < a.length; i ++) mod(a[i]); }

		long pow_m(long x, long y) { nonNegativeCheck(y); return pow_m(x, y, MOD); }
		long[] pows_m(long x, int max) {
			long pow[] = new long[max + 1];
			pow[0] = 1;
			for(int i = 0; i < max; i ++) pow[i + 1] = mod(pow[i] * x);
			return pow;
		}
		long fact_m(int n) { nonNegativeCheck(n); long ans = 1; for(int i = 1; i <= n; i ++) ans = mod(ans * i); return ans; }

		final int MAX_INV_SIZE = 100_100;
		Map<Long, Long> invMap = new HashMap<>();
		long inv(long x) {
			x = mod(x);
			if(invMap.containsKey(x)) return invMap.get(x);
			if(invMap.size() >= MAX_INV_SIZE) return calInv(x);
			invMap.put(x, calInv(x));
			return invMap.get(x);
		}
		long calInv(long x) { return inv(x, MOD); }

		final int MAX_FACT = 5_000_100;
		long fact[];
		long invFact[];
		boolean isFactPrepared = false;
		Map<Integer, long[]> factMap;
		void prepareFact() {
			fact = new long[MAX_FACT];
			fill(fact, 0);
			invFact = new long[MAX_FACT];
			fill(invFact, 0);
			fact[0] = 1;
			int maxIndex = min(MAX_FACT, (int)MOD);
			for(int i = 1; i < maxIndex; i ++) fact[i] = mod(fact[i - 1] * i);
			invFact[maxIndex - 1] = inv(fact[maxIndex - 1]);
			for(int i = maxIndex - 1; i > 0; i --) invFact[i - 1] = mod(invFact[i] * i);

			factMap = new HashMap<>();
			isFactPrepared = true;
		}

		long P(int n, int r) {
			if(!isFactPrepared) prepareFact();
			if(n < 0 || r < 0 || n < r) return 0;
			if(n < MAX_FACT) return mod(fact[n] * invFact[n - r]);
			if(!factMap.containsKey(n)) {
				long largeFact[] = new long[MAX_FACT];
				factMap.put(n, largeFact);
				fill(largeFact, -INF);
				largeFact[0] = 1;
			}
			long largeFact[] = factMap.get(n);
			int i = r;
			while(isINF(largeFact[i])) i --;
			for(; i < r; i ++) largeFact[i + 1] = mod(largeFact[i] * (n - i));
			return largeFact[r];
		}
		long C(int n, int r) { if(!isFactPrepared) prepareFact(); if(n < 0 || r < 0 || n < r) return 0; else return mod(P(n, r) * invFact[r]); }
		long H(int n, int r) { return C((n - 1) + r, r); }


		// grid
		class Grids {
			int h, w;
			Grid[][] gs;
			Grid[] gi;
			Grids(int h, int w) {
				nonNegativeCheck(h);
				nonNegativeCheck(w);
				this.h = h;
				this.w = w;
				gs = new Grid[h][w];
				gi = new Grid[h * w];
				for(int i = 0; i < h; i ++) {
					for(int j = 0; j < w; j ++) {
						gs[i][j] = new Grid(i, j, h, w);
						gi[gs[i][j].i] = gs[i][j];
					}
				}
			}

			void init(boolean[][] b) { for(int i = 0; i < h; i ++) for(int j = 0; j < w; j ++) gs[i][j].b = b[i][j]; }
			void init(long[][] val) { for(int i = 0; i < h; i ++) for(int j = 0; j < w; j ++) gs[i][j].val = val[i][j]; }

			Grid get(int x, int y) { return isValid(x, y, h, w) ? gs[x][y] : null; }
			Grid get(int i) { return get(i / w, i % w); }

			int dx[] = {0, -1, 1, 0, 0, -1, 1, -1, 1};
			int dy[] = {0, 0, 0, -1, 1, -1, -1, 1, 1};
			Grid next(int x, int y, int i) { return next(gs[x][y], i); }
			Grid next(Grid g, int i) { return isValid(g.x + dx[i], g.y + dy[i], g.h, g.w) ? gs[g.x + dx[i]][g.y + dy[i]] : null; }
		}
		class Grid implements Comparable<Grid> {
			int x, y, h, w, i; boolean b; long val;

			Grid() {  }
			Grid(int x, int y, int h, int w) { init(x, y, h, w, false, 0); }
			Grid(int x, int y, int h, int w, boolean b) { init(x, y, h, w, b, 0); }
			Grid(int x, int y, int h, int w, long val) { init(x, y, h, w, false, val); }
			Grid(int x, int y, int h, int w, boolean b, long val) { init(x, y, h, w, b, val); }

			void init(int x, int y, int h, int w, boolean b, long val) { this.x = x; this.y = y; this.h = h; this.w = w; this.b = b; this.val = val; this.i = x * w + y; }

			@Override public String toString() { return "("+x+", "+y+")"+" "+booleanToString(b)+" "+val; }
			@Override public int hashCode() { return Objects.hash(x, y, h, w, b, val); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null) return false;
				if(this.getClass() != obj.getClass()) return false;
				Grid that = (Grid) obj;
				if(this.x != that.x) return false;
				if(this.y != that.y) return false;
				if(this.h != that.h) return false;
				if(this.w != that.w) return false;
				if(this.b != that.b) return false;
				if(this.val != that.val) return false;
				return true;
			}
			@Override
			public int compareTo(Grid that) {
				int c = Long.compare(this.val, that.val);
				if(c == 0) c = Integer.compare(this.x, that.x);
				if(c == 0) c = Integer.compare(this.y, that.y);
				return c;
			}
		}

		boolean isValid(int x, int y, int h, int w) { return x >= 0 && x < h && y >= 0 && y < w; }
		boolean isValid(Grid g) { return isValid(g.x, g.y, g.h, g.w); }

		// graph
		class Graph {
			int numNode, numEdge;
			boolean directed;
			Set<Edge> edges = new HashSet<>();
			Node nodes[];
			Node reversedNodes[];

			Graph(int numNode, int numEdge, boolean directed) {
				nonNegativeCheck(numNode);
				this.numNode = numNode;
				this.numEdge = numEdge;
				this.directed = directed;
				nodes = new Node[numNode];
				reversedNodes = new Node[numNode];
				for(int i = 0; i < numNode; i ++) {
					nodes[i] = new Node(i);
					reversedNodes[i] = new Node(i);
				}
			}

			void init(Set<Edge> edges) {
				this.edges = edges;
				for(Edge e : edges) add(e);
			}

			void add(int source, int target, long cost) { add(new Edge(source, target, cost)); }
			void add(Edge e) {
				rangeCheck(e.source, numNode);
				rangeCheck(e.target, numNode);
				edges.add(e);
				nodes[e.source].add(e.target, e.cost);
				if(directed) reversedNodes[e.target].add(e.source, e.cost);
				else nodes[e.target].add(e.source, e.cost);
				numEdge = edges.size();
			}

			void remove(Edge e) {
				rangeCheck(e.source, numNode);
				rangeCheck(e.target, numNode);
				edges.remove(e);
				nodes[e.source].remove(e.target, e.cost);
				if(directed) reversedNodes[e.target].remove(e.source, e.cost);
				else nodes[e.target].remove(e.source, e.cost);
				numEdge = edges.size();
			}

			void update(int source, int target, long cost) { update(new Edge(source, target, cost), cost); }
			void update(Edge e, long cost) {
				rangeCheck(e.source, numNode);
				rangeCheck(e.target, numNode);
				nodes[e.source].update(e.target, cost);
				if(directed) reversedNodes[e.target].update(e.source, cost);
				else nodes[e.target].update(e.source, cost);
				e.cost = cost;
			}

			void clearNodes() { edges.clear(); numEdge = 0; for(Node n : nodes) n.clear(); for(Node n : reversedNodes) n.clear(); }
		}

		class Node extends HashSet<Edge> {
			int id;

			Node(int id) { this.id = id; }
			void add(int target, long cost) { add(new Edge(id, target, cost)); }
			void remove(int target, long cost) { remove(new Edge(id, target, cost)); }
			void update(int target, long cost) { remove(target, cost); add(target, cost); }
		}

		class Edge implements Comparable<Edge> {
			int source; int target; long cost;
			Edge(int source, int target, long cost) { this.source = source; this.target = target; this.cost = cost; }

			@Override public String toString() { return source+" - "+cost+" -> "+target; }
			@Override public int hashCode() { return Objects.hash(source, target); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null) return false;
				if(this.getClass() != obj.getClass()) return false;
				Edge that = (Edge) obj;
				if(this.source != that.source) return false;
				if(this.target != that.target) return false;
				return true;
			}
			@Override
			public int compareTo(Edge that) {
				int c = Long.compare(this.cost, that.cost);
				if(c == 0) c = Integer.compare(this.source, that.source);
				if(c == 0) c = Integer.compare(this.target, that.target);
				return c;
			}
		}

		// Pair, Tuple
		class Pair<T extends Comparable<? super T>, U extends Comparable<? super U>> implements Comparable<Pair<T, U>> {
			T a; U b;
			Pair() { }
			Pair(T a, U b) { this.a = a; this.b = b; }

			@Override public String toString() { return "("+a.toString()+", "+b.toString()+")"; }
			@Override public int hashCode() { return Objects.hash(a, b); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null) return false;
				if(this.getClass() != obj.getClass()) return false;
				Pair that = (Pair) obj;
				if(this.a.getClass() != that.a.getClass()) return false;
				if(this.b.getClass() != that.b.getClass()) return false;
				if(!this.a.equals(that.a)) return false;
				if(!this.b.equals(that.b)) return false;
				return true;
			}
			@Override public int compareTo(Pair<T, U> that) { int c = (this.a).compareTo(that.a); if(c == 0) c = (this.b).compareTo(that.b); return c; }
		}
		class PairII implements Comparable<PairII> {
			int a; int b;
			PairII() { }
			PairII(int a, int b) { this.a = a; this.b = b; }
			@Override public String toString() { return "("+a+", "+b+")"; }
			@Override public int hashCode() { return Objects.hash(a, b); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null) return false;
				if(this.getClass() != obj.getClass()) return false;
				PairII that = (PairII) obj;
				if(this.a != that.a || this.b != that.b) return false;
				return true;
			}
			@Override public int compareTo(PairII that) { int c = Integer.compare(this.a, that.a); if(c == 0) c = Integer.compare(this.b, that.b); return c; }
		}
		class PairIL implements Comparable<PairIL> {
			int a; long b;
			PairIL() { }
			PairIL(int a, long b) { this.a = a; this.b = b; }
			@Override public String toString() { return "("+a+", "+b+")"; }
			@Override public int hashCode() { return Objects.hash(a, b); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null) return false;
				if(this.getClass() != obj.getClass()) return false;
				PairIL that = (PairIL) obj;
				if(this.a != that.a || this.b != that.b) return false;
				return true;
			}
			@Override public int compareTo(PairIL that) { int c = Integer.compare(this.a, that.a); if(c == 0) c = Long.compare(this.b, that.b); return c; }
		}
		class PairID implements Comparable<PairID> {
			int a; double b;
			PairID() { }
			PairID(int a, double b) { this.a = a; this.b = b; }
			@Override public String toString() { return "("+a+", "+b+")"; }
			@Override public int hashCode() { return Objects.hash(a, b); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null) return false;
				if(this.getClass() != obj.getClass()) return false;
				PairID that = (PairID) obj;
				if(this.a != that.a || this.b != that.b) return false;
				return true;
			}
			@Override public int compareTo(PairID that) { int c = Integer.compare(this.a, that.a); if(c == 0) c = Double.compare(this.b, that.b); return c; }
		}
		class PairLI implements Comparable<PairLI> {
			long a; int b;
			PairLI() { }
			PairLI(long a, int b) { this.a = a; this.b = b; }
			@Override public String toString() { return "("+a+", "+b+")"; }
			@Override public int hashCode() { return Objects.hash(a, b); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null) return false;
				if(this.getClass() != obj.getClass()) return false;
				PairLI that = (PairLI) obj;
				if(this.a != that.a || this.b != that.b) return false;
				return true;
			}
			@Override public int compareTo(PairLI that) { int c = Long.compare(this.a, that.a); if(c == 0) c = Integer.compare(this.b, that.b); return c; }
		}
		class PairLL implements Comparable<PairLL> {
			long a; long b;
			PairLL() { }
			PairLL(long a, long b) { this.a = a; this.b = b; }
			@Override public String toString() { return "("+a+", "+b+")"; }
			@Override public int hashCode() { return Objects.hash(a, b); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null) return false;
				if(this.getClass() != obj.getClass()) return false;
				PairLL that = (PairLL) obj;
				if(this.a != that.a || this.b != that.b) return false;
				return true;
			}
			@Override public int compareTo(PairLL that) { int c = Long.compare(this.a, that.a); if(c == 0) c = Long.compare(this.b, that.b); return c; }
		}
		class PairLD implements Comparable<PairLD> {
			long a; double b;
			PairLD() { }
			PairLD(long a, double b) { this.a = a; this.b = b; }
			@Override public String toString() { return "("+a+", "+b+")"; }
			@Override public int hashCode() { return Objects.hash(a, b); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null) return false;
				if(this.getClass() != obj.getClass()) return false;
				PairLD that = (PairLD) obj;
				if(this.a != that.a || this.b != that.b) return false;
				return true;
			}
			@Override public int compareTo(PairLD that) { int c = Long.compare(this.a, that.a); if(c == 0) c = Double.compare(this.b, that.b); return c; }
		}
		class PairDI implements Comparable<PairDI> {
			double a; int b;
			PairDI() { }
			PairDI(double a, int b) { this.a = a; this.b = b; }
			@Override public String toString() { return "("+a+", "+b+")"; }
			@Override public int hashCode() { return Objects.hash(a, b); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null) return false;
				if(this.getClass() != obj.getClass()) return false;
				PairDI that = (PairDI) obj;
				if(this.a != that.a || this.b != that.b) return false;
				return true;
			}
			@Override public int compareTo(PairDI that) { int c = Double.compare(this.a, that.a); if(c == 0) c = Integer.compare(this.b, that.b); return c; }
		}
		class PairDL implements Comparable<PairDL> {
			double a; long b;
			PairDL() { }
			PairDL(double a, long b) { this.a = a; this.b = b; }
			@Override public String toString() { return "("+a+", "+b+")"; }
			@Override public int hashCode() { return Objects.hash(a, b); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null) return false;
				if(this.getClass() != obj.getClass()) return false;
				PairDL that = (PairDL) obj;
				if(this.a != that.a || this.b != that.b) return false;
				return true;
			}
			@Override public int compareTo(PairDL that) { int c = Double.compare(this.a, that.a); if(c == 0) c = Long.compare(this.b, that.b); return c; }
		}
		class PairDD implements Comparable<PairDD> {
			double a; double b;
			PairDD() { }
			PairDD(double a, double b) { this.a = a; this.b = b; }
			@Override public String toString() { return "("+a+", "+b+")"; }
			@Override public int hashCode() { return Objects.hash(a, b); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null) return false;
				if(this.getClass() != obj.getClass()) return false;
				PairDD that = (PairDD) obj;
				if(this.a != that.a || this.b != that.b) return false;
				return true;
			}
			@Override public int compareTo(PairDD that) { int c = Double.compare(this.a, that.a); if(c == 0) c = Double.compare(this.b, that.b); return c; }
		}

		interface ITuple {
			public StringBuilder toStringBuilder();
			@Override public String toString();
			@Override public int hashCode();
			@Override public boolean equals(Object obj);
		}
		class BasicTuple<T extends ITuple & Comparable<? super T>, V extends Comparable<? super V>> implements Comparable<BasicTuple> {
			T t; V a;
			BasicTuple() {  }

			StringBuilder sbTuple = new StringBuilder();
			public StringBuilder toStringBuilder() {
				sbTuple.setLength(0);
				return sbTuple.append(t.toStringBuilder()).append(", ").append(a);
			}
			@Override public String toString() { return "("+toStringBuilder().toString()+")"; }
			@Override public int hashCode() { return Objects.hash(t, a); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null) return false;
				if(this.getClass() != obj.getClass()) return false;
				BasicTuple that = (BasicTuple) obj;
				if(this.t.getClass() != that.t.getClass()) return false;
				if(this.a.getClass() != that.a.getClass()) return false;
				if(!this.t.equals(that.t)) return false;
				if(!this.a.equals(that.a)) return false;
				return true;
			}
			@Override @SuppressWarnings("unchecked") public int compareTo(BasicTuple that) { int c = (this.t).compareTo((T) (Object) that.t); if(c == 0) c = (this.a).compareTo((V) (Object) that.a); return c; }
		}
		class UniqueTuple<V extends Comparable<? super V>> implements ITuple, Comparable<UniqueTuple> {
			V a;
			UniqueTuple() {  }

			final StringBuilder sbTuple = new StringBuilder();
			public StringBuilder toStringBuilder() { sbTuple.setLength(0); return sbTuple.append(a); }
			@Override public String toString() { return "("+toStringBuilder().toString()+")"; }
			@Override public int hashCode() { return Objects.hash(a); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null) return false;
				if(this.getClass() != obj.getClass()) return false;
				UniqueTuple that = (UniqueTuple) obj;
				if(this.a.getClass() != that.a.getClass()) return false;
				if(!this.a.equals(that.a)) return false;
				return true;
			}
			@Override @SuppressWarnings("unchecked") public int compareTo(UniqueTuple that) { return (this.a).compareTo((V) (Object) that.a); }
		}

		class Tuple1<T0 extends Comparable<? super T0>> extends UniqueTuple<T0> implements ITuple {
			Tuple1() { super(); }
			Tuple1(T0 a0) { super(); this.a = a0; }
			T0 get0() { return a; }
			void set0(T0 x) { a = x; }
		}
		class Tuple2<
				T0 extends Comparable<? super T0>,
				T1 extends Comparable<? super T1>>
				extends BasicTuple<Tuple1<T0>, T1> implements ITuple {
			Tuple2() { super(); }
			@SuppressWarnings("unchecked") Tuple2(T0 a0, T1 a1) { super(); this.t = new Tuple1(a0); this.a = a1; }
			T0 get0() { return t.get0(); }
			T1 get1() { return a; }
			void set0(T0 x) { t.set0(x); }
			void set1(T1 x) { a = x; }
		}
		class Tuple3<
				T0 extends Comparable<? super T0>,
				T1 extends Comparable<? super T1>,
				T2 extends Comparable<? super T2>>
				extends BasicTuple<Tuple2<T0, T1>, T2> implements ITuple {
			Tuple3() { super(); }
			@SuppressWarnings("unchecked") Tuple3(T0 a0, T1 a1, T2 a2) { super(); this.t = new Tuple2(a0, a1); this.a = a2; }
			T0 get0() { return t.get0(); }
			T1 get1() { return t.get1(); }
			T2 get2() { return a; }
			void set0(T0 x) { t.set0(x); }
			void set1(T1 x) { t.set1(x); }
			void set2(T2 x) { a = x; }
		}
		class Tuple4<
				T0 extends Comparable<? super T0>,
				T1 extends Comparable<? super T1>,
				T2 extends Comparable<? super T2>,
				T3 extends Comparable<? super T3>>
				extends BasicTuple<Tuple3<T0, T1, T2>, T3> implements ITuple {
			Tuple4() { super(); }
			@SuppressWarnings("unchecked") Tuple4(T0 a0, T1 a1, T2 a2, T3 a3) { super(); this.t = new Tuple3(a0, a1, a2); this.a = a3; }
			T0 get0() { return t.get0(); }
			T1 get1() { return t.get1(); }
			T2 get2() { return t.get2(); }
			T3 get3() { return a; }
			void set0(T0 x) { t.set0(x); }
			void set1(T1 x) { t.set1(x); }
			void set2(T2 x) { t.set2(x); }
			void set3(T3 x) { a = x; }
		}
		class Tuple5<
				T0 extends Comparable<? super T0>,
				T1 extends Comparable<? super T1>,
				T2 extends Comparable<? super T2>,
				T3 extends Comparable<? super T3>,
				T4 extends Comparable<? super T4>>
				extends BasicTuple<Tuple4<T0, T1, T2, T3>, T4> implements ITuple {
			Tuple5() { super(); }
			@SuppressWarnings("unchecked") Tuple5(T0 a0, T1 a1, T2 a2, T3 a3, T4 a4) { super(); this.t = new Tuple4(a0, a1, a2, a3); this.a = a4; }
			T0 get0() { return t.get0(); }
			T1 get1() { return t.get1(); }
			T2 get2() { return t.get2(); }
			T3 get3() { return t.get3(); }
			T4 get4() { return a; }
			void set0(T0 x) { t.set0(x); }
			void set1(T1 x) { t.set1(x); }
			void set2(T2 x) { t.set2(x); }
			void set3(T3 x) { t.set3(x); }
			void set4(T4 x) { a = x; }
		}
		class Tuple6<
				T0 extends Comparable<? super T0>,
				T1 extends Comparable<? super T1>,
				T2 extends Comparable<? super T2>,
				T3 extends Comparable<? super T3>,
				T4 extends Comparable<? super T4>,
				T5 extends Comparable<? super T5>>
				extends BasicTuple<Tuple5<T0, T1, T2, T3, T4>, T5> implements ITuple {
			Tuple6() { super(); }
			@SuppressWarnings("unchecked")
			Tuple6(T0 a0, T1 a1, T2 a2, T3 a3, T4 a4, T5 a5) { super(); this.t = new Tuple5(a0, a1, a2, a3, a4); this.a = a5; }
			T0 get0() { return t.get0(); }
			T1 get1() { return t.get1(); }
			T2 get2() { return t.get2(); }
			T3 get3() { return t.get3(); }
			T4 get4() { return t.get4(); }
			T5 get5() { return a; }
			void set0(T0 x) { t.set0(x); }
			void set1(T1 x) { t.set1(x); }
			void set2(T2 x) { t.set2(x); }
			void set3(T3 x) { t.set3(x); }
			void set4(T4 x) { t.set4(x); }
			void set5(T5 x) { a = x; }
		}
		class Tuple7<
				T0 extends Comparable<? super T0>,
				T1 extends Comparable<? super T1>,
				T2 extends Comparable<? super T2>,
				T3 extends Comparable<? super T3>,
				T4 extends Comparable<? super T4>,
				T5 extends Comparable<? super T5>,
				T6 extends Comparable<? super T6>>
				extends BasicTuple<Tuple6<T0, T1, T2, T3, T4, T5>, T6> implements ITuple {
			Tuple7() { super(); }
			@SuppressWarnings("unchecked")
			Tuple7(T0 a0, T1 a1, T2 a2, T3 a3, T4 a4, T5 a5, T6 a6) { super(); this.t = new Tuple6(a0, a1, a2, a3, a4, a5); this.a = a6; }
			T0 get0() { return t.get0(); }
			T1 get1() { return t.get1(); }
			T2 get2() { return t.get2(); }
			T3 get3() { return t.get3(); }
			T4 get4() { return t.get4(); }
			T5 get5() { return t.get5(); }
			T6 get6() { return a; }
			void set0(T0 x) { t.set0(x); }
			void set1(T1 x) { t.set1(x); }
			void set2(T2 x) { t.set2(x); }
			void set3(T3 x) { t.set3(x); }
			void set4(T4 x) { t.set4(x); }
			void set5(T5 x) { t.set5(x); }
			void set6(T6 x) { a = x; }
		}
		class Tuple8<
				T0 extends Comparable<? super T0>,
				T1 extends Comparable<? super T1>,
				T2 extends Comparable<? super T2>,
				T3 extends Comparable<? super T3>,
				T4 extends Comparable<? super T4>,
				T5 extends Comparable<? super T5>,
				T6 extends Comparable<? super T6>,
				T7 extends Comparable<? super T7>>
				extends BasicTuple<Tuple7<T0, T1, T2, T3, T4, T5, T6>, T7> implements ITuple {
			Tuple8() { super(); }
			@SuppressWarnings("unchecked")
			Tuple8(T0 a0, T1 a1, T2 a2, T3 a3, T4 a4, T5 a5, T6 a6, T7 a7) { super(); this.t = new Tuple7(a0, a1, a2, a3, a4, a5, a6); this.a = a7; }
			T0 get0() { return t.get0(); }
			T1 get1() { return t.get1(); }
			T2 get2() { return t.get2(); }
			T3 get3() { return t.get3(); }
			T4 get4() { return t.get4(); }
			T5 get5() { return t.get5(); }
			T6 get6() { return t.get6(); }
			T7 get7() { return a; }
			void set0(T0 x) { t.set0(x); }
			void set1(T1 x) { t.set1(x); }
			void set2(T2 x) { t.set2(x); }
			void set3(T3 x) { t.set3(x); }
			void set4(T4 x) { t.set4(x); }
			void set5(T5 x) { t.set5(x); }
			void set6(T6 x) { t.set6(x); }
			void set7(T7 x) { a = x; }
		}

		class TupleIII implements Comparable<TupleIII> {
			int a; int b; int c;
			TupleIII() {  }
			TupleIII(int a, int b, int c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleIII that = (TupleIII) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleIII that) { int c = Integer.compare(this.a, that.a); if(c == 0) c = Integer.compare(this.b, that.b); if(c == 0) c = Integer.compare(this.c, that.c); return c; }
		}
		class TupleIIL implements Comparable<TupleIIL> {
			int a; int b; long c;
			TupleIIL() {  }
			TupleIIL(int a, int b, long c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleIIL that = (TupleIIL) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleIIL that) { int c = Integer.compare(this.a, that.a); if(c == 0) c = Integer.compare(this.b, that.b); if(c == 0) c = Long.compare(this.c, that.c); return c;
			}
		}
		class TupleIID implements Comparable<TupleIID> {
			int a; int b; double c;
			TupleIID() {  }
			TupleIID(int a, int b, double c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleIID that = (TupleIID) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleIID that) { int c = Integer.compare(this.a, that.a); if(c == 0) c = Integer.compare(this.b, that.b); if(c == 0) c = Double.compare(this.c, that.c); return c; }
		}
		class TupleILI implements Comparable<TupleILI> {
			int a; long b; int c;
			TupleILI() {  }
			TupleILI(int a, long b, int c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleILI that = (TupleILI) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleILI that) { int c = Integer.compare(this.a, that.a); if(c == 0) c = Long.compare(this.b, that.b); if(c == 0) c = Integer.compare(this.c, that.c); return c; }
		}
		class TupleILL implements Comparable<TupleILL> {
			int a; long b; long c;
			TupleILL() {  }
			TupleILL(int a, long b, long c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleILL that = (TupleILL) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleILL that) { int c = Integer.compare(this.a, that.a); if(c == 0) c = Long.compare(this.b, that.b); if(c == 0) c = Long.compare(this.c, that.c); return c; }
		}
		class TupleILD implements Comparable<TupleILD> {
			int a; long b; double c;
			TupleILD() {  }
			TupleILD(int a, long b, double c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleILD that = (TupleILD) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleILD that) { int c = Integer.compare(this.a, that.a); if(c == 0) c = Long.compare(this.b, that.b); if(c == 0) c = Double.compare(this.c, that.c); return c; }
		}
		class TupleIDI implements Comparable<TupleIDI> {
			int a; double b; int c;
			TupleIDI() {  }
			TupleIDI(int a, double b, int c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleIDI that = (TupleIDI) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override
			public int compareTo(TupleIDI that) { int c = Integer.compare(this.a, that.a); if(c == 0) c = Double.compare(this.b, that.b); if(c == 0) c = Integer.compare(this.c, that.c); return c; }
		}
		class TupleIDL implements Comparable<TupleIDL> {
			int a; double b; long c;
			TupleIDL() {  }
			TupleIDL(int a, double b, long c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleIDL that = (TupleIDL) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleIDL that) { int c = Integer.compare(this.a, that.a); if(c == 0) c = Double.compare(this.b, that.b); if(c == 0) c = Long.compare(this.c, that.c); return c; }
		}
		class TupleIDD implements Comparable<TupleIDD> {
			int a; double b; double c;
			TupleIDD() {  }
			TupleIDD(int a, double b, double c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleIDD that = (TupleIDD) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleIDD that) { int c = Integer.compare(this.a, that.a); if(c == 0) c = Double.compare(this.b, that.b); if(c == 0) c = Double.compare(this.c, that.c); return c; }
		}
		class TupleLII implements Comparable<TupleLII> {
			long a; int b; int c;
			TupleLII() {  }
			TupleLII(long a, int b, int c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleLII that = (TupleLII) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleLII that) { int c = Long.compare(this.a, that.a); if(c == 0) c = Integer.compare(this.b, that.b); if(c == 0) c = Integer.compare(this.c, that.c); return c; }
		}
		class TupleLIL implements Comparable<TupleLIL> {
			long a; int b; long c;
			TupleLIL() {  }
			TupleLIL(long a, int b, long c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleLIL that = (TupleLIL) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleLIL that) { int c = Long.compare(this.a, that.a); if(c == 0) c = Integer.compare(this.b, that.b); if(c == 0) c = Long.compare(this.c, that.c); return c; }
		}
		class TupleLID implements Comparable<TupleLID> {
			long a; int b; double c;
			TupleLID() {  }
			TupleLID(long a, int b, double c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleLID that = (TupleLID) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleLID that) { int c = Long.compare(this.a, that.a); if(c == 0) c = Integer.compare(this.b, that.b); if(c == 0) c = Double.compare(this.c, that.c); return c; }
		}
		class TupleLLI implements Comparable<TupleLLI> {
			long a; long b; int c;
			TupleLLI() {  }
			TupleLLI(long a, long b, int c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleLLI that = (TupleLLI) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleLLI that) { int c = Long.compare(this.a, that.a); if(c == 0) c = Long.compare(this.b, that.b); if(c == 0) c = Integer.compare(this.c, that.c); return c; }
		}
		class TupleLLL implements Comparable<TupleLLL> {
			long a; long b; long c;
			TupleLLL() {  }
			TupleLLL(long a, long b, long c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleLLL that = (TupleLLL) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleLLL that) { int c = Long.compare(this.a, that.a); if(c == 0) c = Long.compare(this.b, that.b); if(c == 0) c = Long.compare(this.c, that.c); return c; }
		}
		class TupleLLD implements Comparable<TupleLLD> {
			long a; long b; double c;
			TupleLLD() {  }
			TupleLLD(long a, long b, double c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleLLD that = (TupleLLD) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleLLD that) { int c = Long.compare(this.a, that.a); if(c == 0) c = Long.compare(this.b, that.b); if(c == 0) c = Double.compare(this.c, that.c); return c; }
		}
		class TupleLDI implements Comparable<TupleLDI> {
			long a; double b; int c;
			TupleLDI() {  }
			TupleLDI(long a, double b, int c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleLDI that = (TupleLDI) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleLDI that) { int c = Long.compare(this.a, that.a); if(c == 0) c = Double.compare(this.b, that.b); if(c == 0) c = Integer.compare(this.c, that.c); return c; }
		}
		class TupleLDL implements Comparable<TupleLDL> {
			long a; double b; long c;
			TupleLDL() {  }
			TupleLDL(long a, double b, long c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleLDL that = (TupleLDL) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleLDL that) { int c = Long.compare(this.a, that.a); if(c == 0) c = Double.compare(this.b, that.b); if(c == 0) c = Long.compare(this.c, that.c); return c; }
		}
		class TupleLDD implements Comparable<TupleLDD> {
			long a; double b; double c;
			TupleLDD() {  }
			TupleLDD(long a, double b, double c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleLDD that = (TupleLDD) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleLDD that) { int c = Long.compare(this.a, that.a); if(c == 0) c = Double.compare(this.b, that.b); if(c == 0) c = Double.compare(this.c, that.c); return c; }
		}
		class TupleDII implements Comparable<TupleDII> {
			double a; int b; int c;
			TupleDII() {  }
			TupleDII(double a, int b, int c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleDII that = (TupleDII) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleDII that) { int c = Double.compare(this.a, that.a); if(c == 0) c = Integer.compare(this.b, that.b); if(c == 0) c = Integer.compare(this.c, that.c); return c; }
		}
		class TupleDIL implements Comparable<TupleDIL> {
			double a; int b; long c;
			TupleDIL() {  }
			TupleDIL(double a, int b, long c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleDIL that = (TupleDIL) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleDIL that) { int c = Double.compare(this.a, that.a); if(c == 0) c = Integer.compare(this.b, that.b); if(c == 0) c = Long.compare(this.c, that.c); return c; }
		}
		class TupleDID implements Comparable<TupleDID> {
			double a; int b; double c;
			TupleDID() {  }
			TupleDID(double a, int b, double c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleDID that = (TupleDID) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleDID that) { int c = Double.compare(this.a, that.a); if(c == 0) c = Integer.compare(this.b, that.b); if(c == 0) c = Double.compare(this.c, that.c); return c; }
		}
		class TupleDLI implements Comparable<TupleDLI> {
			double a; long b; int c;
			TupleDLI() {  }
			TupleDLI(double a, long b, int c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleDLI that = (TupleDLI) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleDLI that) { int c = Double.compare(this.a, that.a); if(c == 0) c = Long.compare(this.b, that.b); if(c == 0) c = Integer.compare(this.c, that.c); return c; }
		}
		class TupleDLL implements Comparable<TupleDLL> {
			double a; long b; long c;
			TupleDLL() {  }
			TupleDLL(double a, long b, long c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleDLL that = (TupleDLL) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleDLL that) { int c = Double.compare(this.a, that.a); if(c == 0) c = Long.compare(this.b, that.b); if(c == 0) c = Long.compare(this.c, that.c); return c; }
		}
		class TupleDLD implements Comparable<TupleDLD> {
			double a; long b; double c;
			TupleDLD() {  }
			TupleDLD(double a, long b, double c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleDLD that = (TupleDLD) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleDLD that) { int c = Double.compare(this.a, that.a); if(c == 0) c = Long.compare(this.b, that.b); if(c == 0) c = Double.compare(this.c, that.c); return c; }
		}
		class TupleDDI implements Comparable<TupleDDI> {
			double a; double b; int c;
			TupleDDI() {  }
			TupleDDI(double a, double b, int c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleDDI that = (TupleDDI) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleDDI that) { int c = Double.compare(this.a, that.a); if(c == 0) c = Double.compare(this.b, that.b); if(c == 0) c = Integer.compare(this.c, that.c); return c; }
		}
		class TupleDDL implements Comparable<TupleDDL> {
			double a; double b; long c;
			TupleDDL() {  }
			TupleDDL(double a, double b, long c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleDDL that = (TupleDDL) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleDDL that) { int c = Double.compare(this.a, that.a); if(c == 0) c = Double.compare(this.b, that.b); if(c == 0) c = Long.compare(this.c, that.c); return c; }
		}
		class TupleDDD implements Comparable<TupleDDD> {
			double a; double b; double c;
			TupleDDD() {  }
			TupleDDD(double a, double b, double c) { this.a = a; this.b = b; this.c = c; }
			@Override public String toString() { return "("+a+", "+b+", "+c+")"; }
			@Override public int hashCode() { return Objects.hash(a, b, c); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null || this.getClass() != obj.getClass()) return false;
				TupleDDD that = (TupleDDD) obj;
				if(this.a != that.a || this.b != that.b || this.c != that.c) return false;
				return true;
			}
			@Override public int compareTo(TupleDDD that) { int c = Double.compare(this.a, that.a); if(c == 0) c = Double.compare(this.b, that.b); if(c == 0) c = Double.compare(this.c, that.c); return c; }
		}

public void solve() {
	int n = ni();
	int m = ni();
	long ans = 0;
	boolean[][] a = new boolean[n][n];
	for(int i = 0; i < m; i ++) {
		int x = ni() - 1;
		int y = ni() - 1;
		a[x][y] = a[y][x] = true;
	}
	Permutation perm = new Permutation(n);
	outer: for(int[] p : perm) {
		if(p[0] != 0) continue;
		for (int i = 1; i < n; i++) {
			if(!a[p[i - 1]][p[i]]) continue outer;
		}
		ans ++;
	}
	prtln(ans);
}

class Permutation implements Iterator<int[]>, Iterable<int[]> {
	int next[];

	Permutation(int n) { // O(N)
		nonNegativeCheck(n);
		next = new int[n];
		for(int i = 0; i < n; i ++) next[i] = i;
	}
	Permutation(int[] a) { // O(N)
		next = new int[a.length];
		for(int i = 0; i < a.length; i ++) next[i] = a[i];
	}

	@Override
	public boolean hasNext() { return next != null; } // O(1)

	@Override
	public int[] next() { // O(1)
		int[] r = next.clone();
		next = nextPermutation(next);
		return r;
	}

	@Override
	public Iterator<int[]> iterator() { return this; }

	int[] nextPermutation(int[] a) {
		if(a == null || a.length < 2) return null;
		int p = 0;
		for(int i = a.length - 2; i >= 0; i --) {
			if(a[i] >= a[i + 1]) continue;
			p = i;
			break;
		}
		int q = 0;
		for(int i = a.length - 1; i > p; i --) {
			if(a[i] <= a[p]) continue;
			q = i;
			break;
		}
		if(p == 0 && q == 0) return null;
		int tmp = a[p];
		a[p] = a[q];
		a[q] = tmp;
		int l = p, r = a.length;
		while(++ l < -- r) {
			tmp = a[l];
			a[l] = a[r];
			a[r] = tmp;
		}
		return a;
	}
}

	}
}
