import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
 
public class Main {
	static int[][] mat;
	public static void main(String[] args) throws Exception {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		int m = sc.nextInt();
		mat = new int[n+3][m+3];
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= m; j++) {
				flip(i,j);
			}
		}
		int cnt = 0;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= m; j++) {
				if(mat[i][j] == 1) cnt++;
			}
		}
		System.out.println(cnt);
	}
	static void flip(int r, int c) {
		for(int i = r-1; i <= r+1; i++) {
			for(int j = c-1; j <= c+1; j++) {
				mat[i][j] = 1-mat[i][j];
			}
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