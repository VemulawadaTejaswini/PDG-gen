import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
	static ArrayList<Integer>[] m1;
	static ArrayList<Integer>[] m2;
	public static void main(String[] args) {
		Reader r = new Reader();

		String s = r.next();
		String t = r.next();
		dp = new String[s.length()][t.length()];
		m1 = new ArrayList[26];
		m2 = new ArrayList[26];
		
		for (int i = 0; i < 26; i++) {
			m1[i] = new ArrayList<Integer>();
			m2[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < s.length(); i++) {
			Arrays.fill(dp[i], "");
			
			m1[s.charAt(i) - 'a'].add(i);
		}
		for (int i = 0; i < t.length(); i++) {
			m2[t.charAt(i) - 'a'].add(i);
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
				String s1 = recur(s, t, a, b + 1);
				String s2 = recur(s, t, a + 1, b);
				if (s1.length() > s2.length()) {
					max = s1;
				} else {
					max = s2;
				}
			}
			
			dp[a][b] = max;
			return max;
		}
	}

}
