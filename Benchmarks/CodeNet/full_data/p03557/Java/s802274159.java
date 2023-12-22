import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		double[] b = new double[n];
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		double[] c = new double[n];
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		sc.close();

		Arrays.parallelSort(b);
		Arrays.parallelSort(c);

		long[] memoB = new long[n + 1];
		Arrays.fill(memoB, -1);

		long ans = 0L;
		for (int i = 0; i < n; i++) {
			int idxB = Arrays.binarySearch(b, a[i] + 0.1);
			idxB = ~idxB;

			if (memoB[idxB] == -1) {
				long sum = 0L;
				for (int j = idxB; j < n; j++) {
					int idxC = Arrays.binarySearch(c, b[j] + 0.1);
					idxC = ~idxC;
					sum += n - idxC;
				}
				memoB[idxB] = sum;
			}
			ans += memoB[idxB];
		}
		System.out.println(ans);
	}
}
