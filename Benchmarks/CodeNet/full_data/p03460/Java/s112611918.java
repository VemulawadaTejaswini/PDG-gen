import java.io.*;
import java.util.*;

public class Main {

	int[][] a;
	int k;

	int[] make(int l, int r, int mod) {
		if (l <= r) {
			return new int[] { l, r };
		} else {
			return new int[] { l, mod - 1, 0, r };
		}
	}

	void add(int x1, int x2, int y1, int y2) {
//		System.err.println(x1 + " " + x2 + " " + y1 + " " + y2);
		x1 %= 2 * k;
		x2 %= 2 * k;
		y1 %= 2 * k;
		y2 %= 2 * k;

		int[] xs = make(x1, x2, 2 * k);
		int[] ys = make(y1, y2, 2 * k);

		for (int i = 0; i < xs.length; i += 2) {
			for (int j = 0; j < ys.length; j += 2) {
				int xl = xs[i];
				int xr = xs[i + 1] + 1;
				int yl = ys[j];
				int yr = ys[j + 1] + 1;
				
				a[xl][yl]++;
				a[xl][yr]--;
				a[xr][yl]--;
				a[xr][yr]++;
			}
		}
	}

	void submit() {
		int n = nextInt();
		k = nextInt();
		int[] xs = new int[n];
		int[] ys = new int[n];
		char[] cs = new char[n];

		a = new int[2 * k + 1][2 * k + 1];

		for (int i = 0; i < n; i++) {
			int x = nextInt();
			int y = nextInt();
			char c = nextToken().charAt(0);

			if (c == 'W') {
				x += k;
			}
			
//			System.err.println(x + " " + y);

			// (x, y) is black

			add(x + 1, x + k, y + 1, y + k);
			add(x + k + 1, x + 2 * k, y + k + 1, y + 2 * k);
		}
		
//		for (int[] row : a) {
//			System.err.println(Arrays.toString(row));
//		}
		
		int ans = 0;
		
		for (int i = 0; i < 2 * k; i++) {
			for (int j = 0; j < 2 * k; j++) {
				if (i > 0) {
					a[i][j] += a[i - 1][j];
				}
				if (j > 0) {
					a[i][j] += a[i][j - 1];
				}
				if (i > 0 && j > 0) {
					a[i][j] -= a[i - 1][j - 1];
				}
				ans = Math.max(ans, a[i][j]);
			}
//			System.err.println(Arrays.toString(a[i]));
		}
		
		out.println(ans);
	}

	void preCalc() {

	}

	void stress() {

	}

	void test() {

	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		submit();
		// stress();
		// test();
		out.close();
	}

	static final Random rng = new Random();

	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	int nextInt() {
		return Integer.parseInt(nextToken());
	}

	long nextLong() {
		return Long.parseLong(nextToken());
	}

	double nextDouble() {
		return Double.parseDouble(nextToken());
	}
}
