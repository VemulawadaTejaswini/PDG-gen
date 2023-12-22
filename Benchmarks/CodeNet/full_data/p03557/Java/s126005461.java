import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		out = new PrintWriter(new BufferedOutputStream(System.out));

		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for (int j = 0; j < n; j++) {
			a[j] = sc.nextInt();
		}
		for (int j = 0; j < n; j++) {
			b[j] = sc.nextInt();
		}
		for (int j = 0; j < n; j++) {
			c[j] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		
		int ans = 0;
		for (int i = 0; i < b.length; i++) {
			int key = b[i];
			int lowerCount = lower_bound(a, key);
			int upperCount = c.length - lower_bound(c, key+1);
			ans += lowerCount*upperCount;
		}
		out.println(ans);
		out.close();
	}

	public static int lower_bound(int[] l, int key) {
		int bound = Arrays.binarySearch(l, key);
		int res = bound;
		if (bound>0) {
			for (int i = 1; i <= bound; i++) {
				if (l[bound]!=l[bound-i]) {
					break;
				}
				res--;
			}
		}else if (bound<0) {
			res = (~bound);
		}
		return res;
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

