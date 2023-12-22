import java.io.*;
import java.util.*;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;

	void solve() throws IOException {
//		out.println(123);
		// 1 - always
		// 2 - 1 >= 1
		// 3 --> 1 >= 1, 2 >= 3
		// 4 --> 1 >= 1, 2 >= 3, 3 >= 5
		
		// second?
		// 1 - always
		// 2 - always
		// 3 - 2 >= 1
		// 4 - 2 >= 1, 3 >= 3
		// 5 - 2 >= 1, 3 >= 3, 4 >= 5
		
		int n = nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = nextInt();
		}
		
		int ret = 1;
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			while (cnt <= i) {
				cnt++;
			}
			while (cnt < n && a[cnt - 1] >= 2 * (cnt - i) - 1) {
				cnt++;
			}
			ret = (int)((long)ret * (cnt - i) % P);
		}
		
		out.println(ret);
	}
	
	static final int P = 1_000_000_007;

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (Exception e) {
				eof = true;
				return null;
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			eof = true;
			return null;
		}
	}

	int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}
}