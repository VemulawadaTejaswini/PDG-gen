import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int H, W;
	static char arr[][];
	static long dp[][];

	public static long dp(int i, int j) {
		if (i == H - 1 && j == W - 1) {
			return 1;
		}
		if (arr[i][j] == '#' || i == H || j == W) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		long down = dp(i + 1, j);
		long right = dp(i, j + 1);
		return dp[i][j] = down + right;
	}

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		H = sc.nextInt();
		W = sc.nextInt();
		dp = new long[H + 1][W + 1];
		for (int f = 0; f < H + 1; f++) {
			Arrays.fill(dp[f], -1);
		}
		arr = new char[H + 1][W + 1];
		for (int i = 0; i < H; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < W; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		out.println(dp(0, 0) % 1000000007);
		out.flush();
		out.close();
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			String x = next();
			StringBuilder sb = new StringBuilder("0");
			double res = 0, f = 1;
			boolean dec = false, neg = false;
			int start = 0;
			if (x.charAt(0) == '-') {
				neg = true;
				start++;
			}
			for (int i = start; i < x.length(); i++)
				if (x.charAt(i) == '.') {
					res = Long.parseLong(sb.toString());
					sb = new StringBuilder("0");
					dec = true;
				} else {
					sb.append(x.charAt(i));
					if (dec)
						f *= 10;
				}
			res += Long.parseLong(sb.toString()) / f;
			return res * (neg ? -1 : 1);
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

	}
}