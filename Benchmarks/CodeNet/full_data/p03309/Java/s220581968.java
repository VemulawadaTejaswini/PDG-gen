import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			a[i] -= i + 1;
		}

		Arrays.sort(a);
		long b = (n % 2 == 1) ? a[n / 2] : (a[n / 2] + a[n / 2 - 1]) / 2;
		long sadness = 0;
		for (int i = 0; i < n; i++) {
			sadness += Math.abs(a[i] - b);
		}

		System.out.println(sadness);
	}
}
