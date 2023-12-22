import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static class Reader {
		BufferedReader br;
		StringTokenizer st;

		public Reader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	static String[][] dp;
	public static void main(String[] args) {
		Reader r = new Reader();

		String s = r.next();
		String t = r.next();
		dp = new String[s.length()][t.length()];
		
		for (int i = 0; i < s.length(); i++) {
			Arrays.fill(dp[i], "");
		}

		System.out.println(recur(s, t, 0, 0));
	}

	static String recur (String s, String t, int a, int b) {
		if (a > s.length() - 1 || b > t.length() - 1) {
			return "";
		} else if (dp[a][b].length() > 0) {
			return dp[a][b];
		} else {
			String max = "";

			char c1 = s.charAt(a);
			char c2 = t.charAt(b);

			if (c1 == c2) {
				max = c1 + recur(s, t, a + 1, b + 1);
			} else {
				for (int i = b; i < t.length(); i++) {
					if (t.charAt(i) == c1) {
						max = c1 + recur(s, t, a + 1, i + 1);
						break;
					}
				}
				for (int i = a; i < s.length(); i++) {
					if (s.charAt(i) == c2) {
						String l = c2 + recur(s, t, i + 1, b + 1);
						if (l.length() > max.length()) {
							max = l;
						}
						break;
					}
				}
				String l = recur(s, t, a + 1, b + 1);
				if (l.length() > max.length()) {
					max = l;
				}
			}
			
			dp[a][b] = max;
			return max;
		}
	}

}
