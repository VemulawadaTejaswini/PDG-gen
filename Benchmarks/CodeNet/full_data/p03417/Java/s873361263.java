import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args) throws Exception {
		FastScanner sc = new FastScanner();
		long n = sc.nextLong(), m = sc.nextLong();
		if(n == 1 || m == 1) {
			System.out.println(Math.max(n, m) - 2);
		} else{
			System.out.println(n * m - (n+m-2)*2);
		}
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
}