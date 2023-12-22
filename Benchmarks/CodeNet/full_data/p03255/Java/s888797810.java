import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt(), X = sc.nextInt();
		int[] a = new int[n + 1];
		long[] sum = new long[n + 1];
		for (int i = 1; i <= n; i++) {
			sum[i] = a[i] = sc.nextInt();
			sum[i] += sum[i - 1];
		}
		BigInteger ans = null;

		for (int k = 1; k <= n; k++) {
			BigInteger curr = BigInteger.ZERO;
			for (int i = n, c = 1; i > 0; i -= k, c++) {

				long rangeSum = sum[i];
				if (i >= k) {
					rangeSum -= sum[i - k];
				}

				int coeff = c == 1 ? 5 : (2 * c + 1);
				curr = curr.add(BigInteger.valueOf(coeff).multiply(BigInteger.valueOf(rangeSum)));
			}
			curr = curr.add(BigInteger.valueOf(k).multiply(BigInteger.valueOf(X)));
			if (ans == null || curr.compareTo(ans) < 0)
				ans = curr;
//			ans = Math.min(ans, curr + k * 1L * X);
		}
		out.println(ans.add(BigInteger.valueOf(n * 1L * X)));
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