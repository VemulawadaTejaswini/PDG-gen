import java.util.*;
import java.io.*;

public class Main {
	private static final boolean local = false;
	private static BufferedReader br;
	private static StringTokenizer st;
	private static PrintWriter output;
	//char c = line.nextToken().charAt(0);

	private static void openFile() throws IOException {
		if (local) {
			String inp = "C:/Users/ztrong/Desktop/AndroidStudioProjects/Java/src/main/java/input.txt";
			String out = "C:/Users/ztrong/Desktop/AndroidStudioProjects/Java/src/main/java/output.txt";
			br = new BufferedReader(new InputStreamReader(new FileInputStream(inp)));
			output = new PrintWriter(new FileOutputStream(out));
		}
		else {
			br = new BufferedReader(new InputStreamReader(System.in));
			output = new PrintWriter(System.out);
		}
	}

	private static String _next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	private static int nextInt() {
		return Integer.parseInt(_next());
	}

	private static long nextLong() {
		return Long.parseLong(_next());
	}

	private static double nextDouble() {
		return Double.parseDouble(_next());
	}

	private static String nextLine() {
		String str = "";
		try {
			str = br.readLine();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}

	private static final int maxN = (int) 1e5 + 5;
	private static final int maxM = (int) 1e6 + 5;
	private static final int INF = (int) 1e9 + 7;

	private static int N;
	private static String s1, s2;
	private static long[][][] dp = new long[maxN][3][3];

	private static void init() {

	}

	private static void enter() throws IOException {
		N = nextInt();
		s1 = nextLine();
		s2 = nextLine();
	}

	private static void solve() throws IOException {
		for (int i = 1; i <= N; ++i) {
			if (i < N && s1.charAt(i - 1) == s1.charAt(i)) continue;
			if (s1.charAt(i - 1) == s2.charAt(i - 1)) {
				if (i == 1) {
					for (int u = 0; u < 3; ++u) {
						for (int v = 0; v < 3; ++v) if (u == v) {
							dp[i][u][v] = 1;
						}
					}
				}
				else {
					for (int u = 0; u < 3; ++u)
						for (int v = 0; v < 3; ++v) if (u == v)
							for (int x = 0; x < 3; ++x) if (x != u)
								for (int y = 0; y < 3; ++y) if (y != v) {
									dp[i][u][v] = (dp[i][u][v] + dp[i - 1][x][y]) % INF;
								}
				}
			}
			else {
				if (i == 2) {
					for (int u = 0; u < 3; ++u)
						for (int v = 0; v < 3; ++v) if (u != v) {
							dp[i][u][v] = 1;
						}
				}
				else {
					for (int u = 0; u < 3; ++u) {
						for (int v = 0; v < 3; ++v) if (u != v)
							for (int x = 0; x < 3; ++x) if (x != u) {
								for (int y = 0; y < 3; ++y) if (y != v) {
									dp[i][u][v] = (dp[i][u][v] + dp[i - 2][x][y]) % INF;
								}
							}
					}
				}
			}
		}

		long res = 0;

		for (int u = 0; u < 3; ++u) {
			for (int v = 0; v < 3; ++v) {
				res = (res + dp[N][u][v]) % INF;
			}
		}

		output.println(res);
	}

	public static void main(String[] args) throws IOException {
		openFile();
		init();
		enter();
		solve();
		output.close();
	}
}