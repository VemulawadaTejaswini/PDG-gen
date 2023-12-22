import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] x = new int[n + 1];

		for (int i = 0; i < n + 1; i++) {
			x[i] = sc.nextInt();
		}
		Arrays.sort(x);

		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = x[i + 1] - x[i];
		}

		int ans = d[0];
		for (int i = 0; i < n; i++) {
			ans = gcd(d[i], ans);
		}

		System.out.println(ans);
		sc.close();
	}

	public static int gcd(int m, int n) {
		if (m < n)
			return gcd(n, m);
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}
}