import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int h = sc.nextInt();
		int n = sc.nextInt();
		long[] arr = new long[n];
		long[] brr = new long[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			brr[i] = sc.nextInt();
		}
		long[] val = new long[h+1];
		Arrays.fill(val, Integer.MAX_VALUE);
		val[0] = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < arr[i]; j++) {
				val[j] = Math.min(val[j], brr[i]);
			}
			for(int j = 0; j+arr[i] <= h; j++) {
				val[j+(int)arr[i]] = Math.min(val[j+(int)arr[i]], val[j] + brr[i]);
			}
		}
		System.out.println(val[h]);
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
			} catch(IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

}
