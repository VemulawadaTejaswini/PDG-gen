
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		long a[] = new long[n];
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			a[i] = in.nextLong();
			long l = (a[i] - (i + 1));
			min = Math.min(l, min);
			max = Math.max(l, max);
		}
		if (min == max) {
			return;
		}

		long summin = Long.MAX_VALUE;
		for (long b = min; b <= max; b++) {
			long sum = 0;
			for (int i = 0; i < n; i++) {
				long abs = Math.abs(a[i] - (b + (i + 1)));
				sum += abs;
			}
			if (sum < summin) {
				summin = sum;
			}
		}
		System.out.println(summin);
	}

}
