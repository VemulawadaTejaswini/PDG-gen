import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		out = new PrintWriter(new BufferedOutputStream(System.out));

		int n = sc.nextInt();
		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}
		Arrays.sort(d);
		
		int ans = 1;
		int size = d[0];
		for (int i = 1; i < d.length; i++) {
			if (d[i]>size) {
				ans++;
				size = d[i];
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

