import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	String fileName = "prizes";

	public void solve() throws IOException {
		int n = nextInt();
		int ans[] = new int[n];
		int[][] a = new int[2][n];
		int[][] sum = new int[2][n];
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < n; j++) {
				a[i][j] = nextInt();
				if (j == 0)
					sum[i][j] = a[i][j];
				else
					sum[i][j] = sum[i][j - 1] + a[i][j];
			}
		for (int i = 0; i < n; i++)
			ans[i] = sum[0][i] + sum[1][n - 1] - sum[1][i] + a[1][i];
		int max = ans[0];
		for (int ktr = 0; ktr < ans.length; ktr++) {
			if (ans[ktr] > max) {
				max = ans[ktr];
			}
		}
		out.print(max);

	}

	public void run() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out, true);
			solve();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	BufferedReader br;
	StringTokenizer in;
	static PrintWriter out;

	public String nextToken() throws IOException {
		while (in == null || !in.hasMoreTokens()) {
			in = new StringTokenizer(br.readLine());
		}
		return in.nextToken();
	}

	public int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	public double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}

	public long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

}