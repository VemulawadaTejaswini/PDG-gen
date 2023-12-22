import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int f = sc.nextInt();
		int s = sc.nextInt();
		boolean[][] white = new boolean[f][s];
		for (int i = 0; i < f; i++) {
			 char[] tmp = sc.next().toCharArray();
			for (int j = 0; j < s; j++) {
				white[i][j] = tmp[j] == '.';
			}
		}
		int[][] best = new int[f][s];
		boolean[][] vis = new boolean[f][s];
		for (int i = 0; i < f; i++) {
			for (int j = 0; j < s; j++) {
				if (white[i][j]) {
					best[i][j] = i == 0 && j == 0 ? 0 : Integer.MAX_VALUE;
					if (i > 0) {
						best[i][j] = Math.min(best[i][j], best[i-1][j]);
					}
					if (j > 0) {
						best[i][j] = Math.min(best[i][j], best[i][j-1]);
					}
				} else {
					if ((i == 0 || white[i-1][j]) && (j == 0 || white[i][j-1])) {
						best[i][j] = i == 0 && j == 0 ? 1 : Integer.MAX_VALUE;
						if (i > 0) {
							best[i][j] = Math.min(best[i][j], best[i-1][j] + 1);
						}
						if (j > 0) {
							best[i][j] = Math.min(best[i][j], best[i][j-1] + 1);
						}
					} else {
						for (int k = 0; k <= i; k++) {
							for (int l = 0; l <= j; l++) {
								vis[k][l] = false;
							}
						}
						best[i][j] = Integer.MAX_VALUE;
						vis[i][j] = true;
						for (int k = i; k >= 0; k--) {
							for (int l = j; l >= 0; l--) {
								if (!white[k][l]) {
									if (k < i && !white[k+1][l] && vis[k+1][l]) {
										vis[k][l] = true;
									}
									if (l < j && !white[k][l] && vis[k][l+1]) {
										vis[k][l] = true;
									}
									if (vis[k][l]) {
										best[i][j] = Math.min(best[i][j], best[k][l]);
									}
								}
							}
						}
					}
				}
				//System.err.println(i + " " + j + " => " + best[i][j]);
			}
		}
		out.println(best[f-1][s-1]);
		
		out.flush();
	}
	
	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
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
	}
}
