import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	private void solve() throws IOException {
		int T = 1;
		for (int t = 0; t < T; t++) {
			int n = ni();
			char[] a = ns().toCharArray();
			int cntW[] = new int[a.length];
			int cntE[] = new int[a.length];
			for (int i = 1; i < a.length; i++)
				cntE[i] = a[i - 1] == 'E' ? cntE[i - 1] + 1 : cntE[i - 1];
			for (int i = a.length - 2; i >= 0; i--)
				cntW[i] = a[i + 1] == 'W' ? cntW[i + 1] + 1 : cntW[i + 1];

			int ans = 0;
			for (int i = 0; i < a.length; i++)
				ans = Math.max(ans, cntE[i] + cntW[i]);
			out.println(n - 1 - ans);
		}

	}

	String ns() throws IOException {
		while (!tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine(), " ");
		}
		return tok.nextToken();
	}

	int ni() throws IOException {
		return Integer.parseInt(ns());
	}

	long nl() throws IOException {
		return Long.parseLong(ns());
	}

	double nd() throws IOException {
		return Double.parseDouble(ns());
	}

	String[] nsa(int n) throws IOException {
		String[] res = new String[n];
		for (int i = 0; i < n; i++) {
			res[i] = ns();
		}
		return res;
	}

	int[] nia(int n) throws IOException {
		int[] res = new int[n];
		for (int i = 0; i < n; i++) {
			res[i] = ni();
		}
		return res;
	}

	long[] nla(int n) throws IOException {
		long[] res = new long[n];
		for (int i = 0; i < n; i++) {
			res[i] = nl();
		}
		return res;
	}

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		tok = new StringTokenizer("");
		Main main = new Main();
		main.solve();
		out.close();
	}
}