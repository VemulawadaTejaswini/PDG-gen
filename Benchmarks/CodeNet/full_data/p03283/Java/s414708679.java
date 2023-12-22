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
		int M = sc.nextInt();
		int Q = sc.nextInt();
		int[][] range = new int[N][N];
		int tmp1, tmp2;
		for (int i = 0; i < M; i++) {
			tmp1 = sc.nextInt() - 1;
			tmp2 = sc.nextInt() - 1;
			range[tmp1][tmp2]++;
		}
		int[][] acum = new int[N][N];
		for (int i = 0; i < N; i++) {
			acum[i][i] = range[i][i];
		}
		int[] tmp = new int[N];
		for (int i = 0; i < N; i++) {
			tmp[i] = range[i][i];
		}
		for (int delta = 1; delta < N; delta++) {
			for (int i = 0; i + delta < N; i++) {
				tmp[i] += range[i][i+delta];
			}
			for (int i = 0; i + delta < N; i++) {
				acum[i][i+delta] = tmp[i] + acum[i + 1][i+delta];
			}
		}
		for (int i = 0; i < Q; i++) {
			tmp1 = sc.nextInt() - 1;
			tmp2 = sc.nextInt() - 1;
			out.println(acum[tmp1][tmp2]);
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
