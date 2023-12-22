import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	public void run() throws Exception {
		FastScanner sc = new FastScanner();
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		
		long diff = a-k;
		if (diff>0) {
			a = diff;
			k = 0;
		}
		else {
			a = 0;
			k = Math.abs(diff);
		}
		if (k>0){
			long diff2 = b-k;
			if (diff2>0) {
				b = diff2;
				k = 0;
			}
			else {
				b = 0;
				k = Math.abs(diff2);
			}
		}
		System.out.println(a + " " + b);
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