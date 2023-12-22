import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int maxPar = N;
		if (maxPar % 2 == 1) maxPar--;
		boolean[][] adj = new boolean[N + 1][N + 1];
		for (int i = 1; i <= maxPar; i++) {
			adj[i][maxPar + 1 - i] = true;
		}
		int m = N * (N - 1) / 2 - maxPar / 2;
		out.println(m);
		for (int i = 1; i <= N; i++) {
			for (int j = i+1; j <= N; j++) {
				if (!adj[i][j]) {
					out.println(i + " " + j);
				}
			}
		}
		
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
