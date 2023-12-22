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
		int m = nextInt();
		int x[] = new int[n];
		boolean ans = true;
		for (int i = 0; i < m; i++) {
			int l = nextInt() - 1;
			int r = nextInt() - 1;

			int d = nextInt();
			// out.print(x[r] + " " + x[l] + " aft ");
			if (x[r] == 0 && x[l] == 0) {
				x[r] = d + 1;
				x[l] = 1;
				// out.println(" case1");
			} else {
				if (x[r] == 0) {
					x[r] = x[l] + d;
					// out.print(" fuck");

					// out.println(" case2");
				} else {
					if (x[l] == 0)
						x[l] = x[r] - d;

					if (x[r] - x[l] != d) {
						ans = false;
						// out.println(" case3");

					}

				}
			}
			// out.println(x[r] + " " + x[l] + " ");
		}
		if (ans)
			out.println("Yes");
		else
			out.println("No");

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