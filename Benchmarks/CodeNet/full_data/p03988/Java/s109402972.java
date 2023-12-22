import java.io.*;
import java.util.*;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;

	void solve() throws IOException {
		int n = nextInt();
		int[] cnt = new int[n];
		for (int i = 0; i < n; i++) {
			int x = nextInt();
			cnt[x]++;
		}
		
		int diam = n - 1;
		while (cnt[diam] == 0) {
			diam--;
		}
		
		if (cnt[diam] == 1) {
			out.println("Impossible");
			return;
		}
		
		if (diam == 1) {
			out.println(n == 2 ? "Possible" : "Impossible");
			return;
		}
		
		int cant = (diam - 1) / 2;
		for (int i = 1; i <= cant; i++) {
			if (cnt[i] != 0) {
				out.println("Impossible");
				return;
			}
		}
		
		if (diam % 2 == 0) {
			if (cnt[diam / 2] != 1) {
				out.println("Impossible");
				return;
			}
			for (int i = diam / 2 + 1; i <= diam; i++) {
				if (cnt[i] < 2) {
					out.println("Impossible");
					return;
				}
			}
		} else {
			for (int i = diam / 2 + 1; i <= diam; i++) {
				if (cnt[i] < 2) {
					out.println("Impossible");
					return;
				}
			}
		}
		
		out.println("Possible");
		return;
		
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