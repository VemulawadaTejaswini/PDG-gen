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
		Arrays.parallelSort(a);

		int k = p + 1, threshold, remain, canVote, result = p;
		while (k <= n) {
			threshold = a[n - k] + m;
			if (threshold < a[n - p]) {
				break;
			}
			remain = v - (n + p - k);
			if (remain <= 0) {
				result = k;
				k++;
				continue;
			}
			canVote = 0;
			for (int i = p; i < k; i++) {
				canVote += threshold - a[n - i];
			}
			if (canVote < remain * m) {
				break;
			} else {
				result = k;
				k++;
				continue;
			}

		}
		System.out.println(result);
	}

}
