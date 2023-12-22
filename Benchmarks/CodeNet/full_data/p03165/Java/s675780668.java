
import java.io.*;
import java.util.*;

public class Main {
	static int[][] memo;
	static String s, t;
	static HashMap<String, String> hs = new HashMap<String, String>();
	static void trace(int i, int j){
		if(i > s.length() || j > t.length())
			return ;
		if(dp(i,j) == 1+dp(i+1,j+1))
		{
			System.out.print(s.charAt(i));
			trace(i+1,j+1);
		}
		else if(dp(i,j) == dp(i+1,j))
			trace(i+1,j);
		else if(dp(i,j) == dp(i,j+1))
			trace(i,j+1);
	}

	static int dp(int i, int j) {
		if (i >= s.length() || j >= t.length()) {
			return 0;
		}
		if ( memo[i][j] != -1)
			return memo[i][j];

		if (s.charAt(i) == t.charAt(j))
			return memo[i][j] = 1 + dp(i + 1, j + 1);

		int iPlus = 0, jPlus = 0;
		iPlus = dp(i + 1, j);
		jPlus = dp(i, j + 1);
		int ret = Math.max(iPlus, jPlus);
		return memo[i][j] = ret;

	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		t = sc.next();
		memo = new int[s.length() + 5][t.length() + 5];
		for (int[] a : memo)
			Arrays.fill(a, -1);
		trace(0,0);
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
