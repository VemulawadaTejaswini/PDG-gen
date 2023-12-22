import java.io.*;
import java.util.*;

public class Main {
	static int h;
	static int w;
	static char[][] map;
	static Long[][] memo;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		h = sc.nextInt();
		w = sc.nextInt();
		memo = new Long[h][w];
		map = new char[h][w];

		for (int i = 0; i < h; i++) {
			String x=sc.nextLine();
			for (int j = 0; j < w; j++) {
				map[i][j] = x.charAt(j);
				memo[i][j] = -1l;
				//System.out.println(x.charAt(j));
			}
		}

		out.println(dp(0, 0)%(1000000000+7));

		out.flush();
	}

	public static Long dp(int i, int j) {
		if (i >= h || j >= w) {
			return 0l;
		}
		if (memo[i][j] != -1l) {
			return memo[i][j];
		}
		if (i == h - 1 && j == w - 1) {
			return 1l;
		}
		if (map[i][j] == '#') {
			return 0l;
		}
		Long right = dp(i + 1, j);
		Long left = dp(i, j + 1);
		return memo[i][j] = right + left;
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}