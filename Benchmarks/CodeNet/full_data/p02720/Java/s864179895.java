

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;

public class Main {
	private static int n, k;
	private static int[] a;

	public static void main(String[] args) {
		k = ini();
		String x = "1";
		next:
		for(int i=1; i<k; i++) {
//			println(x+" , "+x.length());
			char[] y = x.toCharArray();
			for(int j=x.length()-1; j>=0; j--) {
				if ((j-1>=0?x.charAt(j)<=x.charAt(j-1):false) && x.charAt(j)!='9') {
					y[j] = (char)(y[j]+1);
//					println(j+" "+y[j]);
					x = new String(y);
//					println("HE "+x);
					continue next;
				}
				if (j-1>=0 && x.charAt(j)>x.charAt(j-1) &&(j-2>=0?Math.abs(x.charAt(j)-x.charAt(j-2))<=1:true)) {
					char temp = y[j];
					y[j] = y[j-1];
					y[j-1] = temp;
//					println("THIS");
					for(int k=j+1; k<y.length; k++) {
						if (y[k-1]!='0') {
							y[k] = (char)(y[k-1]-1);
						} else {
							y[k] = '0';
						}
					}
					x = new String(y);
					continue next;
				}
			}
//			println("COME");
			if (x.charAt(0)=='9') {
				char[] xx = new char[y.length+1];
				xx[0]='1';
				for(int j=1; j<xx.length; j++) {
					xx[j] = '0';
				}
//				println("HI");
				x = new String(xx);
				continue;
			}
//			println("HERE");
			y[0] = (char)(y[0]+1);
//			print(y[0]);
			for(int j=1; j<x.length(); j++) {
				if (y[j-1]!='0') y[j]=(char)(y[j-1]-1);
			}
			x = new String(y);
		}
		println(x);
		
//		int count = 0;
//		for(int z=1; z<2000; z++) {
//			if (get(z)) {
//				count++;
//				println(count+" "+z);
//			}
//		}
		


		out.flush();
		out.close();

	}
	
//	private static int solve(int i, int last, int k) {
//		
//		int count = 0;
//	}
	
	private static boolean get(int n) {
		int last = -1;
		while(n>0) {
			int d = n%10;
			if (last!=-1 && Math.abs(d-last)>1) return false;
			last=d;
			n/=10;
		}
		return true;
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
