import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		out = new PrintWriter(new BufferedOutputStream(System.out));

		int n = sc.nextInt();
		int[] c = new int[n];
		int[] s = new int[n];
		int[] f = new int[n];
		int[] ans = new int[n];
		Arrays.fill(c, 0);
		Arrays.fill(s, 0);
		Arrays.fill(f, 0);
		Arrays.fill(ans, 0);
		
		for (int i = 0; i < n-1; i++) {
			c[i] = sc.nextInt();
			s[i] = sc.nextInt();
			f[i] = sc.nextInt();
		}
		
		for (int i = 0; i < ans.length; i++) {
			int total = 0;
			for (int j = i; j < ans.length-1; j++) {
				if (total<s[j]) {
					total = s[j];
				}else if (total%f[j]==0) {
					// nothing to do
				}else{
					int sub = f[j] - (total%f[j]);
					total += sub;
				}
				total += c[j];
			}
			ans[i] = total;
		}
		
		for (int i = 0; i < ans.length; i++) {
			out.println(ans[i]);
		}
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

