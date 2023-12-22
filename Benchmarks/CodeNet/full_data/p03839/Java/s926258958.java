import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] arr = new long[n + 1];
		long[] sums = new long[n + 1];
		for (int i = 1; i <= n; i++) {
			int x = sc.nextInt();
			arr[i] = arr[i - 1] + x;
			sums[i] = sums[i - 1] + Math.max(x, 0);
		}
		long max = Long.MIN_VALUE;
		for (int i = k; i <= n; i++) {
			long sum = arr[i] - arr[i - k];
			long maxSum = sums[n] - (sums[i] - sums[i - k]);
			max = Math.max(max, Math.max(maxSum, maxSum + sum));
		}
		System.out.println(max);
	}
}
