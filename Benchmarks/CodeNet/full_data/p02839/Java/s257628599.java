import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] A = new int[h][w];
		int[][] B = new int[h][w];
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		boolean[][][] dp = new boolean[h][w][6400];
		dp[0][0][(int)Math.abs(A[0][0] - B[0][0])] = true;
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(i + j == 0) continue;
				for(int k = 0; k < 6400; k++) {
					if((i > 0 && dp[i-1][j][k]) || (j > 0 && dp[i][j-1][k])) {
						int k1 = (int)Math.abs(k + A[i][j] - B[i][j]);
						if(k1 < 6400) {
							dp[i][j][k1] = true;
						}
						int k2 = (int)Math.abs(k + B[i][j] - A[i][j]);
						if(k2 < 6400) {
							dp[i][j][k2] = true;
						}
					}
				}
			}
		}
		int min = 6400;
		for(int k = 0; k < 6400; k++) {
			if(dp[h-1][w-1][k])
				min = Integer.min(k, min);
		}
		System.out.println(min);
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
