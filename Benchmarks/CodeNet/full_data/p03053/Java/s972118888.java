import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static int MAX = 10000;
	static int[] di = {0, 0, 1, -1};
	static int[] dj = {1, -1, 0, 0};
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] table = new char[H][];
		for (int i = 0; i < H; i++) {
			table[i] = sc.next().toCharArray();
		}
		int[][] dist = new int[H][W];
		for (int i = 0; i < dist.length; i++) {
			Arrays.fill(dist[i], -1);
		}
		int ans = 0;
		Deque<Integer> queue = new ArrayDeque<>();
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) if (table[i][j] == '#') {
				dist[i][j] = 0;
				queue.addLast(i * MAX + j);
			}
		}
		while (!queue.isEmpty()) {
			int cur = queue.removeFirst();
			int ii = cur / MAX;
			int jj = cur % MAX;
			for (int k = 0; k < 4; k++) {
				int ni = ii + di[k];
				int nj = jj + dj[k];
				if (0 <= ni && ni < H && 0 <= nj && nj < W && dist[ni][nj] == -1) {
					ans = dist[ni][nj] = 1 + dist[ii][jj];
					queue.addLast(ni * MAX + nj);
				}
			}
		}
		out.println(ans);
		
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
