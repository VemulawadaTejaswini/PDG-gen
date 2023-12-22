import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		out = new PrintWriter(new BufferedOutputStream(System.out));

		int a = sc.nextInt(), b = sc.nextInt();
		char[] s = sc.next().toCharArray();
		String ans = "Yes";
		if (s.length != a+b+1) {
			ans = "No";
		}else{
			for (int i = 0; i < s.length; i++) {
				char l = s[i];
				if (i==a) {
					if (l!='-') {
						ans = "No";
						break;
					}
				}else{
					if (l < '0' || l > '9') {
						ans = "No";
						break;
					}
				}
			}
		}
		out.println(ans);
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

