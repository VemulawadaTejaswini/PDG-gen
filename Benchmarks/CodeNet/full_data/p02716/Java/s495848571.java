

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;

public class Main {
	private static int n;
	private static int[] a;
	private static long[][][] dp;

	public static void main(String[] args) {
		n = ini();
		a = ina(n);
		
		dp = new long[n+1][4][2];
		
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<4; j++) {
				Arrays.fill(dp[i][j], -1);
			}
		}

//		if (n%2==0) {
//			long sum = 0;
//			long sum1 = 0;
//			for(int x: a) sum+=x;
//			for(int i=0; i<n; i+=2) {
//				sum1+=a[i];
//			}
//			long sum2 = sum-sum1;
//			println(Math.max(sum1, sum2));
//			return;
//		} else {
//			println(Math.max(solve(0, 0, 0), solve(1, 1, 0)));
//		}
		
		println(solve(0, 0, 0));
		
		out.flush();
		out.close();

	}
	
	private static long solve(int i, int count, int flag) {
		if (count>3) return -(long)1e15;
		if (i>=n) {
			if (n%2==0) {
				if (flag==0) {
					if (count==0) return 0;
					else return -(long)1e15;
				} else {
//					println("HELLO");
					if (count<=1) return 0;
					else return -(long)1e15;
				}
			} else {
				if (flag==0) {
					if (count<=1) return 0;
					else return -(long)1e15;
				} else {
					if (count==2) return 0;
					else return -(long)1e15;
				}
			}
		}
		//1, 2, 3, 4, 5, 6
		
		if (dp[i][count][flag]!=-1) return dp[i][count][flag];
		
		return dp[i][count][flag]=Math.max(a[i]+solve(i+2, count, (i==0?1:flag)), solve(i+1, count+(i!=0?1:0), flag));
	}

	//NONPROBLEM CODE

	private static InputReader in = new InputReader(System.in);
	private static PrintWriter out = new PrintWriter(System.out);

	private static class InputReader {

		private final InputStream stream;
		private final byte[] buf = new byte[8192];
		private int curChar, snumChars;

		public InputReader(InputStream st) {
			this.stream = st;
		}

		public int read() {
			if (snumChars == -1)
				throw new InputMismatchException();
			if (curChar >= snumChars) {
				curChar = 0;
				try {
					snumChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (snumChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		public int nextInt() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public long nextLong() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;
			do {
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public int[] nextIntArray(int n) {
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = nextInt();
			}
			return a;
		}

		public String readString() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		public String nextLine() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndOfLine(c));
			return res.toString();
		}

		public boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		private boolean isEndOfLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

	}

	//INPUT SHORTCUTS

	private static int[] ina(int n) {
		int[] temp = new int[n];
		for (int i = 0; i < n; i++) {
			temp[i] = in.nextInt();
		}
		return temp;
	}

	private static int ini() {
		return in.nextInt();
	}

	//OTHER SHORTCUTS
	public static void sort(int[] a) {
		Arrays.sort(a);
	}

	//PRINT SHORTCUTS

	private static void println(Object... o) {
		for (Object x : o) {
			out.write(x + " ");
		}
		out.write("\n");
		out.flush();
	}

	private static void print(Object... o) {
		for (Object x : o) {
			out.write(x + " ");
		}
		out.flush();
	}

	private static void debug(Object... o) {
		for (Object x : o) {
			out.write(x + " ");
		}
		out.write("\n");
		out.flush();
	}

	private static HashMap<Integer, ArrayList<Integer>> intree(int n) {

		HashMap<Integer, ArrayList<Integer>> g = new HashMap<>();
		for (int i = 0; i < n; i++) {
			g.put(i, new ArrayList<>());
		}

		for (int i = 0; i < n - 1; i++) {
			int u = ini() - 1;
			int v = ini() - 1;
			g.get(u).add(v);
			g.get(v).add(u);
		}

		return g;
	}
}
