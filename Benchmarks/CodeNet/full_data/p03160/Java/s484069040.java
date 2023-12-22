import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	int mod = 1000000007;

	static public int diff(int[] a, int i, int j) {
		return Math.abs(a[i] - a[j]);
	}

	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		out = new PrintWriter(new BufferedOutputStream(System.out));

		int n = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		//min cost to get here
		int prevPrev = 0;
		int prev = diff(a, 0, 1);

		for (int i = 2; i < n; i++) {
			int tmp = Math.min(prev + diff(a, i, i - 1), prevPrev + diff(a, i, i - 2));
			prevPrev = prev;
			prev = tmp;
		}
		
		out.println(prev);
		
		/*
		 * int n = sc.nextInt(); // read input as integer long k = sc.nextLong(); //
		 * read input as long double d = sc.nextDouble(); // read input as double String
		 * str = sc.next(); // read input as String String s = sc.nextLine(); // read
		 * whole line as String
		 * 
		 * int result = 3*n; out.println(result); // print via PrintWriter
		 */

		// Stop writing your solution here. -------------------------------------
		out.close();
	}

	// -----------PrintWriter for faster output---------------------------------
	public static PrintWriter out;

	// -----------MyScanner class for faster input----------
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
	// --------------------------------------------------------
}
