import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	public void run() throws Exception {
		FastScanner sc = new FastScanner();
		String t = sc.next();
		String s = sc.next();
		System.out.println(s + t);
		
	}
	static class FastScanner {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public FastScanner() {
			reader = new BufferedReader(new InputStreamReader(System.in), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}

	}
//	public void run() throws Exception
//	{
//		System.out.println("Hi");
//	}
	public static void main (String[] args) throws Exception {
		new Main().run();
	}
}