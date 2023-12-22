import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		strA = sc.next().toCharArray();
		strB = sc.next().toCharArray();
		int n = strA.length - 1;
		int m = strB.length - 1;
		memo = sc.nextInt2DArr(n + 1, m + 1, -1);
		dp(n, m);
		System.out.println(trace(n, m));

		pw.close();
	}

	static char[] strA, strB;
	static int[] memo[];

	static int dp(int x, int y) {
		if (x == -1 || y == -1)
			return 0;
		if (memo[x][y] != -1)
			return memo[x][y];
		if (strA[x] == strB[y])
			return memo[x][y] = 1 + dp(x - 1, y - 1);

		return memo[x][y] = max(dp(x - 1, y), dp(x, y - 1));

	}

	static String trace(int x, int y) {
		if (x == -1 || y == -1)
			return "";
		if (strA[x] == strB[y]) {

			return trace(x - 1, y - 1) + strA[x];
		} else if (dp(x - 1, y) >= dp(x, y - 1)) {

			return trace(x - 1, y);
		} else

			return trace(x, y - 1);

	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(String file) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public int[] nextIntArr(int n) throws IOException {
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = nextInt();
			}
			return arr;
		}

		public int[] nextIntArr(int n, int f) throws IOException {
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = f;
			}
			return arr;
		}

		public int[][] nextInt2DArr(int n, int m) throws IOException {
			int arr[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int k = 0; k < m; k++) {
					arr[i][k] = nextInt();
				}
			}
			return arr;
		}

		public int[][] nextInt2DArr(int n, int m, int f) throws IOException {
			int arr[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int k = 0; k < m; k++) {
					arr[i][k] = f;
				}
			}
			return arr;
		}

		public String[] nextStringArr(int n) throws IOException {
			String arr[] = new String[n];
			for (int i = 0; i < n; i++) {
				arr[i] = next();
			}
			return arr;
		}

		public char[] nextCharArr(int n) throws IOException {
			char arr[] = new char[n];
			for (int i = 0; i < n; i++) {
				arr[i] = next().charAt(0);
			}
			return arr;
		}

	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static int min(int a, int b) {
		return a < b ? a : b;
	}
}