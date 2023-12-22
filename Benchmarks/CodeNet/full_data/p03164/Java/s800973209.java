
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	static FastReader input = new FastReader();
	static PrintWriter out = new PrintWriter(System.out);

	static int n, w;
	static int[][] wV;

	static long[][] memo;
	static final int _INF = (int) -1e9;
	static boolean[][] boolMemo;
	static boolean[][] visitiedBoolMemo;

	static boolean reachable(int sum, int w, int n) {

		if (w < 0 || sum < 0)
			return false;

		if (sum == 0)
			return true;

		if (n < 0)
			return false;

		if (visitiedBoolMemo[n][sum])
			return boolMemo[n][sum];

		visitiedBoolMemo[n][sum] = true;
		return boolMemo[n][sum] = reachable(sum - wV[n][1], w - wV[n][0], n - 1) || reachable(sum, w, n - 1);

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		n = input.nextInt();
		w = input.nextInt();

		wV = new int[n][2];

		for (int i = 0; i < n; i++) {
			wV[i][0] = input.nextInt();
			wV[i][1] = input.nextInt();
		}


		int i = (int) 1e3;
		for (; i >= 0; i--) {
			boolMemo = new boolean[n + 10][(int) 1e3 + 50];
			visitiedBoolMemo = new boolean[n + 10][(int) 1e3 + 50];
			if (reachable(i, w, n-1)) {
				break;
			}
		}
		
		System.out.println(i);
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreElements()) {
				st = new StringTokenizer(br.readLine());
			}
			return st.nextToken();
		}

		int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		String nextLine() throws IOException {
			String str = "";
			str = br.readLine();
			return str;
		}
	}
}
