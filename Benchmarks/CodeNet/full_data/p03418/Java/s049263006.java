import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt(), k = sc.nextInt();

		long ans = 0;
		for (int b = 1; b <= n; b++) {
			// a<b
			ans += Math.min(k - 1, b - 1);
			// a>=b
			// 0,1,2,3,...,b-1,0,1,2,3,..
			int len = n - b + 1;
			int cycles = len / b;
			int last = n % b;
			ans += cycles * Math.min(b, k);
			if (last != b - 1) {
				ans += Math.min(k, last + 1);
			}
		}
		if (k == 0)
			ans = 0;
		out.println(n * 1L * n - ans);
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

}