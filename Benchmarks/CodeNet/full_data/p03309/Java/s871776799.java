import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/*
 * AtCoder Beginner Contest 102 C "Linear Approximation"
 */
public class Main {

	public static void main(String[] args) {

		InputScanner in = new InputScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int N = in.nextInt();
		int[] A = in.nextIntArray(N);

		int[] absA = new int[N];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			absA[i] = A[i] - (i + 1);
			max = Math.max(max, absA[i]);
			min = Math.min(min, absA[i]);
		}


		Arrays.parallelSort(absA);
		long[] sumA = new long[N + 1];
		sumA[0] = 0;
		for (int i = 1; i < N + 1; i++) {
			sumA[i] = sumA[i - 1] + absA[i - 1];
		}

		long ans = Long.MAX_VALUE;
		for (int b = min; b <= max; b++) {

			int index = Arrays.binarySearch(absA, b);
			if (index < 0) {
				index = - (index + 1);
			}

			long left = 0;
			if (index != 0) {
				left = b * index - sumA[index];
			}

			long right = 0;
			if (index != N) {
				right = (sumA[N] - sumA[index]) - b * (N - index);
			}

			ans = Math.min(ans, left + right);
		}

		out.println(ans);

		in.close();
		out.close();

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