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
		long A = sc.nextInt();
		long B = sc.nextInt();
		int[] p = new int[N];
		int[] pos = new int[N];
		for (int i = 0; i < p.length; i++) {
			p[i] = sc.nextInt() - 1;
			pos[p[i]] = i;
		}
		int[][] left = new int[N][N], right = new int[N][N];
		for (int i = 0; i < N; i++) {
			left[i][i] = right[i][i] = pos[i];
		}
		for (int largo = 2; largo <= N; largo++) {
			for (int from = 0; from + largo - 1 < N; from++) {
				int to = from + largo - 1;
				left[from][to] = Math.min(left[from][to -1], pos[to]);
				right[from][to] = Math.max(right[from][to -1], pos[to]);
			}
		}
		
		long[][] tabla = new long[N][N];
		for (int largo = 2; largo <= N; largo++) {
			for (int from = 0; from + largo - 1 < N; from++) {
				int to = from + largo - 1;
				if (p[right[from][to]] == to) tabla[from][to] = tabla[from][to-1];
				else if (p[left[from][to]] == from) tabla[from][to] = tabla[from+1][to];
				else {
					tabla[from][to] = Math.min(A + tabla[from][to - 1], B + tabla[from + 1][to]);
				}
			}
		}
		
		out.println(tabla[0][N-1]);
		
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
