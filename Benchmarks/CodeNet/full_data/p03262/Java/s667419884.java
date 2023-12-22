import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int max = a[1] - a[0];
		for (int i = 1; i < n; i++) {
			max = (int) gcd(max, a[2] - a[1]);
		}
		System.out.println(max);
	}

	private static long gcd(long m, long n) {
		if (m < n)
			return gcd(n, m);
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}
}
