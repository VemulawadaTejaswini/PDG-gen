import java.io.*;
import java.util.*;
 
public class Main {
 
	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;
 
	void solve() throws IOException {
		int n = nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = nextInt() - 1;
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (i < a[i] && a[a[i]] == i) {
				ans++;
			}
		}
		out.println(ans);
	}
 
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