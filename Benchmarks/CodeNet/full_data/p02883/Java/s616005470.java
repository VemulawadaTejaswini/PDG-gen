import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		long k = stdIn.nextLong();

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}

		int[] f = new int[n];

		for (int i = 0; i < n; i++) {
			f[i] = stdIn.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(f);

		Outer:
		for (int i = 0; i < n; i++) {
			if (a[i] > 0) {
				if (a[i] < k) {
					k = k - a[i];
					a[i] = 0;
				} else {
					a[i] = a[i] - (int)k;
					break Outer;
				}
			}
		}

		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i] * f[n - i - 1];
		}

		System.out.println(sum);
	}
}