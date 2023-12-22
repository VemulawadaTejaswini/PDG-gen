import java.io.*;
import java.util.*;

public class Main {

	static int LG = 20;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int L = sc.nextInt();
		int[][] nxt = new int[n][LG], back = new int[n][LG];
		for (int i = 0, j = 0; i < n; i++) {
			while (j < n && a[j] - a[i] <= L)
				j++;
			nxt[i][0] = j - 1;
		}
		for (int i = n - 1, j = n - 1; i >= 0; i--) {
			while (j >= 0 && a[i] - a[j] <= L)
				j--;
			back[i][0] = j + 1;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < LG; j++) {
				back[i][j] = back[back[i][j - 1]][j - 1];
			}
		}
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 1; j < LG; j++) {
				nxt[i][j] = nxt[nxt[i][j - 1]][j - 1];
			}
		}
		int q = sc.nextInt();
		while (q-- > 0) {
			int from = sc.nextInt() - 1, to = sc.nextInt() - 1;
			int ans = 0;
			if (from > to) {
				for (int j = LG - 1; j >= 0; j--) {

					if (back[from][j] > to) {
						from = back[from][j];
						ans += 1 << j;
					}
				}
			} else {

				for (int j = LG - 1; j >= 0; j--) {
					if (nxt[from][j] < to) {
						from = nxt[from][j];
						ans += 1 << j;
					}
				}
			}
			out.println(ans + 1);
		}
		out.close();

	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		Scanner(String fileName) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(fileName));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		String nextLine() throws IOException {
			return br.readLine();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		boolean ready() throws IOException {
			return br.ready();
		}

	}

	static void sort(int[] a) {
		shuffle(a);
		Arrays.sort(a);
	}

	static void shuffle(int[] a) {
		int n = a.length;
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			int tmpIdx = rand.nextInt(n);
			int tmp = a[i];
			a[i] = a[tmpIdx];
			a[tmpIdx] = tmp;
		}
	}

}