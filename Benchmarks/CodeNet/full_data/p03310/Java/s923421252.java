import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * AtCoder Beginner Contest 102 D "Equal Cut"
 */
public class Main {

	public static void main(String[] args) {

		InputScanner in = new InputScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int N = in.nextInt();
		int[] A = in.nextIntArray(N);

		long[] sumA = new long[N];
		sumA[0] = A[0];
		for (int i = 1; i < N; i++) {
			sumA[i] = sumA[i - 1] + A[i];
		}

		long ans = Long.MAX_VALUE;
		for (int Ci = 1; Ci < N - 2; Ci++) {
			for (int Di = Ci + 1; Di < N - 1; Di++) {
				for (int Ei = Di + 1; Ei < N; Ei++) {

					long sumB = sumA[Ci - 1];
					long sumC = sumA[Di - 1] - sumA[Ci - 1];
					long sumD = sumA[Ei - 1] - sumA[Di - 1];
					long sumE = sumA[N - 1] - sumA[Ei - 1];

					long max = max(sumB, sumC, sumD, sumE);
					long min = min(sumB, sumC, sumD, sumE);

					ans = Math.min(ans, max - min);
				}
			}
		}

		out.println(ans);

		in.close();
		out.close();

	}

	public static long max(long B, long C, long D, long E) {

		long ret = B;
		ret = Math.max(ret, C);
		ret = Math.max(ret, D);
		ret = Math.max(ret, E);
		return ret;
	}

	public static long min(long B, long C, long D, long E) {

		long ret = B;
		ret = Math.min(ret, C);
		ret = Math.min(ret, D);
		ret = Math.min(ret, E);
		return ret;
	}

	/*
	 * extends java.util.Scanner
	 */
	static class InputScanner{

		Scanner scanner;

		public InputScanner(InputStream inputStream) {
			this.scanner = new Scanner(inputStream);
		}

		public int nextInt() {
			return scanner.nextInt();
		}

		public long nextLong() {
			return scanner.nextLong();
		}

		public double nextDouble() {
			return scanner.nextDouble();
		}
		public String next() {
			return scanner.next();
		}

		public int[] nextIntArray(int n) {
			int[] ret = new int[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.nextInt();
			}
			return ret;
		}

		public long[] nextLongArray(int n) {
			long[] ret = new long[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.nextLong();
			}
			return ret;
		}

		public String[] nextStringArray(int n) {
			String[] ret = new String[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.next();
			}
			return ret;
		}

		public String[] nextStringArray(String splitStr) {
			String[] ret = scanner.next().split(splitStr);
			return ret;
		}

		public void close() {
			scanner.close();
		}
	}

}
