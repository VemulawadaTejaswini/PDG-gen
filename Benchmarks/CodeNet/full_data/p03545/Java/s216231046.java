import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		out = new PrintWriter(new BufferedOutputStream(System.out));
		
		int number = sc.nextInt();
		int[] n = new int[]{
				number/1000,
				number%1000 / 100,
				number%100 / 10,
				number%10
		};
		String[][] dp = new String[n.length+1][81];
		for (int i = 0; i < dp.length; i++) {
			Arrays.fill(dp[i], "INF");
		}
		dp[1][40+n[0]] = "root";
		for (int i = 1; i < n.length; i++) {
			for (int j = 0; j < dp[i].length; j++) {
				if (dp[i][j] != "INF") {
					dp[i+1][j+n[i]] = "+";
					dp[i+1][j-n[i]] = "-";
				}
			}
		}
		int p = 47;
		String[] op = new String[3];
		for (int i = 4; i > 1; i--) {
			op[i-2] = dp[i][p];
			if (dp[i][p] == "+") {
				p = p - n[i-1];
			}else if (dp[i][p] == "-") {
				p = p + n[i-1];
			}	
		}
		out.print(n[0]);
		for (int i = 0; i < op.length; i++) {
			out.print(op[i]);
			out.print(n[i+1]);
		}
		out.println("=7");
		out.close();
	}
	
	

	//-----------http://codeforces.com/blog/entry/7018---------------------------------
	public static PrintWriter out;

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
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
	//--------------------------------------------------------

}

