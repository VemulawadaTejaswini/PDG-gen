
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Knapsack1 {
	static FastReader input = new FastReader();
	static PrintWriter out = new PrintWriter(System.out);

	static int n, w;
	static int[][] wV;
	static long[][] memo;
	static final int  _INF = (int)-1e9;
	
	static long solve (int n, int w) {
		
		if (w<0) 
			return _INF;

		
		if (n<0) return 0;
		
		long x  = wV[n][1]+solve(n-1, w-wV[n][0]); 
		long y  = solve(n-1, w); 
		
		return memo[n][w] = Math.max(x, y);
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		n = input.nextInt();
		w = input.nextInt();

		wV = new int[n][2];

		for (int i = 0; i < n; i++) {
			wV[i][0] = input.nextInt();
			wV[i][1] = input.nextInt();
		}

		memo = new long[n + 5][(int) 1e5 + 100];

		for (int i = 0; i < memo.length; i++)
			Arrays.fill(memo[i], -1);
		
		
		System.out.println(solve (n-1,w));
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
