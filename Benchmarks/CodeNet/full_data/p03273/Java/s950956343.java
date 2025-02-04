import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;

	void solve() throws IOException {
		int n = nextInt();
		int m = nextInt();
		char a[][] = new char[n][];
		for (int i = 0; i < n; i++)
			a[i] = nextString().toCharArray();

		boolean rows[] = new boolean[n];
		for (int i = 0; i < n; i++) {
			int j = 0;
			for (; j < m && a[i][j] == '.'; j++)
				;
			if (j == m)
				rows[i] = true;
		}

		boolean cols[] = new boolean[m];
		for (int i = 0; i < m; i++) {
			int j = 0;
			for (; j < n && a[j][i] == '.'; j++)
				;
			if (j == n)
				cols[i] = true;
		}

//		Helper.tr(rows, cols);
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {

				if (rows[i] || cols[j])
					continue;
				out.print(a[i][j]);
			}
			if (!rows[i])
				out.println();
		}
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