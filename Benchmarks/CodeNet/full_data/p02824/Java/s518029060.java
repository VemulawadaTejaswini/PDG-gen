import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int v = scanner.nextInt();
		int p = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		Arrays.parallelSort(a);

		int result = p;

		for (int i = p + 1; i <= n; i++) {
			if (canBeChosen(i, n, m, v, p, a)) {
				result = i;
			} else {
				break;
			}
		}

		System.out.println(result);
	}

	static boolean naive(int k, int n, int m, int v, int p, int[] a) {
		int threshold = a[n - k] + m;
		if (threshold < a[n - p]) {
			return false;
		}
		long canVote = (long) (p - 1) * m;
		for (int i = 0; i <= n - p; i++) {
			canVote += Math.min(m, threshold - a[i]);
		}
		return canVote >= (long) m * v;
	}

	static boolean canBeChosen(int k, int n, int m, int v, int p, int[] a) {
		int threshold = a[n - k] + m;
		if (threshold < a[n - p]) {
			return false;
		}
		int remain = v - (n - k + p);
		if (remain <= 0) {
			return true;
		}
		long canVote = 0;
		for (int i = p; i < k; i++) {
			canVote += threshold - a[n - i];
		}
		return canVote >= (long) remain * m;

	}
}
