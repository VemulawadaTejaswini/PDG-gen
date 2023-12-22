import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	static int H;
	static int W;
	static int[][]memo;
	static int dp(char[][] grid, int i, int j) {
		if(memo[i][j]!=-1)
			return memo[i][j];
		if (i == H - 1 && j == W - 1) {
			return 1;
		}
		if(grid[i][j]=='#')
			return 0;
		if (i == H - 1)
			if (grid[i][j + 1] == '#')
				return memo[i][j] = 0;
			else
				return memo[i][j] = dp(grid, i, j + 1);
		if (j == W - 1)
			if (grid[i + 1][j] == '#')
				return memo[i][j] = 0;
			else
				return memo[i][j] = dp(grid, i + 1, j);
		if (grid[i + 1][j] == '#' && grid[i][j + 1] == '#')
			return 0;
		return memo[i][j] = dp(grid, i + 1, j) + dp(grid, i, j + 1);

	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		char[][] grid = new char[H][W];
		memo = new int[H][W];
		for(int[]arr : memo)
			Arrays.fill(arr, -1);
		for (int i = 0; i < H; i++) {
			String str = sc.next();
			for (int j = 0; j < W; j++) {
				grid[i][j] = str.charAt(j);
			}
		}
		System.out.println((int)((dp(grid, 0, 0))%(Math.pow(10,9)+7)));
	}
}
class Scanner {
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
