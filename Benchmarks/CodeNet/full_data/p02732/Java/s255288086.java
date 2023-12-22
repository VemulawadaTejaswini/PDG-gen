

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map.Entry;

public class Main {

	private static int n;
	private static int[] a;
	
	public static void main(String[] args) {
		n = in.nextInt();
		a = new int[n];
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
		}
		
		long ans = 0;
		for(Entry<Integer, Integer> e: map.entrySet()) {
			int p = e.getValue();
			ans += p*1L*(p-1)/2;
		}
		
		for(int i=0; i<n; i++) {
//			if (map.get(a[i])==1) {
//				System.out.println(((map.size()-1)*(map.size()-2)/2));
//			} else {
//				System.out.println(((map.size())*(map.size()-1)/2));
//			}
			int z = map.get(a[i]);
			long sol = 0;
			if (z!=1) {
				sol = ans-z*(z-1)/2+(z-1)*(z-2)/2;
			} else {
				sol = ans-z*(z-1)/2;
			}
			System.out.println(sol);
		}
		
		out.flush();
		out.close();
		
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
	
	private static void debug(Object... o) {
		for(Object x: o) {
			out.write(x+" ");
		}
		out.write("\n");
		out.flush();
	}
	
}
