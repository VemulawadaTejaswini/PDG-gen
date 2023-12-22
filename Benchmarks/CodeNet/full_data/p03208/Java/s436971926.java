import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt(), k = sc.nextInt();
		Integer [] a = new Integer[n];
		for (int i = 0; i < a.length; ++i) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int min = a[k-1] - a[0];
		for (int i = 1; i+k-1 < n; ++i) {
			min = Math.min(min, a[i+k-1] - a[i]);
		}
		out.println(min);
		out.close();
	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		public Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens()) {
				st = new StringTokenizer(br.readLine());
			}
			return st.nextToken();
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}
		public long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}
	}

}
