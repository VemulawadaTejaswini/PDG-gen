

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main{
	static String[][] memo;
	static String s, t;

	static String dp(String sub, int i, int j) {
		if (i == s.length() && j == t.length())
			return sub;
		if(i < s.length() && j < t.length()&& !memo[i][j].equals("#"))
			return memo[i][j];
		if (i < s.length() && j < t.length() && s.charAt(i) == t.charAt(j)) {
			sub = sub + s.charAt(i);
			return memo[i][j] = dp(sub, i + 1, j + 1);
		}
		String iPlus = "", jPlus = "", ijPlus = "";
		if(i<s.length()&& j<t.length())
			ijPlus = dp(sub,i+1,j+1);
		if (i < s.length())	
			iPlus = dp(sub, i + 1, j);
		if (j < t.length())
			jPlus = dp(sub, i, j + 1);
		String ret = (iPlus.length() > jPlus.length() && iPlus.length()>ijPlus.length()) ? iPlus : (jPlus.length() > iPlus.length() && jPlus.length()>ijPlus.length()) ? jPlus : ijPlus ;
		if(i==s.length()&&j==s.length())
			memo[i-1][j-1]=ret;
		else if(i==s.length())
			memo[i-1][j] = ret;
		else
			memo[i][j-1] = ret;
		return ret;

	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		t = sc.next();
		memo = new String[s.length()][t.length()];
		for(String[]a:memo)
			Arrays.fill(a, "#");
		System.out.println(dp("",0,0));
		for(String[] s:memo)
			System.out.println(Arrays.toString(s));
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
