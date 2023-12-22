import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
//		StringBuilder out = new StringBuilder();
		int n = sc.nextInt();
		long m = sc.nextInt();
		int[] arr = new int[n];
//		long g = 0;
		boolean valid = true;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] % 2 != 0) valid = false;
			arr[i] /= 2;
//			g = gcd(g, arr[i]);
		}
		if(!valid) {
			System.out.println(0); return;
		}
		long mcd = 1;
		for(int k: arr) {
			mcd = mcd(mcd, k);
			if(mcd > m) break;
		}
		if(mcd <= m) System.out.println((m-mcd)/(2*mcd) + 1);
		else System.out.println(0);
	}
	static long mcd(long a, long b) {
		return a * b / gcd(a, b);
	}
	static long gcd(long a, long b) {
		if(b > a) return gcd(b, a);
		else if(b == 0) return a;
		else return gcd(b, a % b);
	}
	static int calc(int[] arr, int n) {
		int res = 0;
		boolean[] seen = new boolean[n];
		for(int i = 0; i < n-1; i++) {
			int k = 0;
			for(int j = 0; j < n; j++) {
				if(!seen[j] && j < arr[i]) k++;
			}
			seen[arr[i]] = true;
			res += k;
			res *= (n-i-1);
		}
		return res;
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
