import java.io.*;
import java.util.*;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		int[][] q = new int[2][60];
		for(int i = 0; i < n; i++) {
			long a = sc.nextLong();
			for(int j = 0; j < 60; j++) {
				int k = ((1L << j) & a) > 0? 1:0;
				q[k][j]++;
			}
		}
		long mod = 1000000007;
		BigInteger res = BigInteger.ZERO;
		for(int i = 0; i < 60; i++) {
			BigInteger curr = BigInteger.valueOf(q[0][i]).multiply(BigInteger.valueOf(q[1][i]));
			curr = curr.multiply(BigInteger.valueOf((1L << i)));
			res = res.add(curr).mod(BigInteger.valueOf(mod));
		}
		System.out.println(res);
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
