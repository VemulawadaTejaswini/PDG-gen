import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		int n = in.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}

		int result = solve(n, a);
		System.out.println(result);

		in.close();

	}

	public static int solve(int n, int[] a) {
		int result = 0;

		int len = a.length;
		int first = gcd(a[len - 1], a[len - 2]);

		for (int i = len - 3; i >= 0; i--) {
			result = gcd(first, a[i]);
		}

		return result;
	}

	public static int gcd(int m, int n) {
		if (m < n) {
			return gcd(n, m);
		}

		if (n == 0) {
			return m;
		}

		return gcd(n, m % n);
	}

}
