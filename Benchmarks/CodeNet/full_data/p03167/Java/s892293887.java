import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputReader in = new InputReader(System.in);
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), true);
		TaskB solver = new TaskB();
		solver.solve(1, in, out);
		out.flush();
		out.close();
	}
}

class Pair<A, B> {
	A first;
	B second;

	Pair(A first, B second) {
		this.first = first;
		this.second = second;
	}

}

class TaskB {
	int INF = (int) 1e3 + 5;
	long mod = (long) 1e9 + 7;

	public void solve(int testNumber, InputReader in, PrintWriter pw) {
		int H = in.nextInt();
		int W = in.nextInt();
		long dp[][] = new long[H + 1][W + 1];
		for (int i = 0; i < W + 1; i++) {
			dp[0][i] = 0;
		}
		for (int j = 0; j < H + 1; j++) {
			dp[j][0] = 0;
		}
		dp[1][1] = 1;
		for (int i = 1; i <= H; i++) {
			String tc = in.next();
			char arr[] = tc.toCharArray();
			for (int j = 1; j <= W; j++) {
				if (arr[j - 1] != '#') {
					dp[i][j] += (dp[i][j - 1] + dp[i - 1][j]) % mod;
				}
			}
		}
//		for (int i = 0; i <= H; i++) {
//			for (int j = 0; j <= W; j++) {
//				pw.print(dp[i][j] + " ");
//			}
//			pw.println();
//		}
		pw.println(dp[H][W] % mod);
	}

	boolean FirstRow_Col(Pair<Integer, Integer> pair) {
		return pair.first == 0 || pair.second == 0;
	}

	int __gcd(int a, int b) {
		if (b == 0)
			return a;
		return __gcd(b, a % b);

	}

	public int getInt(int num) {
		int ret = -1;
		switch (num) {
		case 0:
			ret = 6;
			break;
		case 1:
			ret = 2;
			break;
		case 2:
			ret = 5;
			break;
		case 3:
			ret = 5;
			break;
		case 4:
			ret = 4;
			break;
		case 5:
			ret = 5;
			break;
		case 6:
			ret = 6;
			break;
		case 7:
			ret = 3;
			break;
		case 8:
			ret = 7;
			break;
		case 9:
			ret = 6;
			break;
		}
		return ret;
	}

	public int isPow(long num) {
		int count = 0;
		while (num > 0) {
			num /= 2;
			count++;
		}
		return count;
	}
}

class InputReader {
	BufferedReader br;
	StringTokenizer st;

	public InputReader(InputStream in) {
		br = new BufferedReader(new InputStreamReader(in));
		st = null;
	}

	public String next() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
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
}
