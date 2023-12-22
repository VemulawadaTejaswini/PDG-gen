import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] s = new char[h][w];
		for(int i = 0; i < h; i++){
			s[i] = sc.next().toCharArray();
		}
		int[][] dp = new int[h][w];
		for(int i = 0; i < h; i++){
			Arrays.fill(dp[i], Integer.MAX_VALUE);
		}
		if(s[0][0] == '#') dp[0][0] = 1;
		else dp[0][0] = 0;
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++) {
				if(i == 0 && j == 0) continue;
				if(i > 0) {
					if(s[i][j] == '#' && s[i-1][j] == '.') {
						dp[i][j] = Math.min(dp[i][j], dp[i-1][j]+1);
					}
					else {
						dp[i][j] = Math.min(dp[i][j], dp[i-1][j]);
					}
				}
				if(j > 0) {
					if(s[i][j] == '#' && s[i][j-1] == '.') {
						dp[i][j] = Math.min(dp[i][j], dp[i][j-1]+1);
					}
					else {
						dp[i][j] = Math.min(dp[i][j], dp[i][j-1]);
					}
				}
			}
		}
		System.out.println(dp[h-1][w-1]);
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
