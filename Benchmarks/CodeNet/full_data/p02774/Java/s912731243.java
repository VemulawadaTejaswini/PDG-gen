import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		long k = scanner.nextLong();
		a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			if (a[i] < 0)
				negative++;
			else if (a[i] > 0)
				positive++;
		}
		scanner.close();
		Arrays.parallelSort(a);

		long inf = a[0] * a[n - 1] - 1;
		long max = Math.max(a[0] * a[1], a[n - 2] * a[n - 1]);
		long mid;
		while (max - inf > 1) {
			mid = (max + inf) / 2;
			if (count(mid) >= k)
				max = mid;
			else
				inf = mid;
		}
		System.out.println(max);

	}

	static int n;
	static long[] a;
	static int positive = 0;
	static int negative = 0;

	static long comb(int x) {
		return (long) x * (x - 1) / 2;
	}

	static long count(long threshold) {
		long count = 0;
		int left, right;
		if (threshold < 0) {
			left = 0;
			right = n - positive;
			while (left < negative && right < n) {
				if (a[left] * a[right] <= threshold) {
					count += n - right;
					left++;
				} else {
					right++;
				}
			}

		} else {
			count = comb(n) - comb(negative) - comb(positive);
		}
		if (threshold > 0) {
			left = 0;
			right = negative - 1;
			while (left < right) {
				if (a[left] * a[right] <= threshold) {
					count += right - left;
					right--;
				} else {
					left++;
				}
			}
			left = n - positive;
			right = n - 1;
			while (left < right) {
				if (a[left] * a[right] <= threshold) {
					count += right - left;
					left++;
				} else {
					right--;
				}
			}
		}
		return count;
	}
}
