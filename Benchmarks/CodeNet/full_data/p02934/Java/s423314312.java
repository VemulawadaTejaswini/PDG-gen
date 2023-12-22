import java.util.Scanner;

public class Main {
	static int numerators[] = new int[100];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int lcm = getLcm(a);
		calcNumerators(a, n, lcm);
		int sum = java.util.Arrays.stream(numerators).sum();
		double ans = (double) lcm / sum;
		System.out.println(ans);
	}

	static void calcNumerators(int a[], int n, int lcm) {
		for (int i = 0; i < n; i++) {
			numerators[i] = lcm / a[i];
		}
	}

	static int getLcm(int m, int n) {
		return m * n / getGcd(m, n);
	}

	static int getLcm(int a[]) {
		final int len = a.length;
		if (len == 1)
			return a[0];

		int l = getLcm(a[0], a[1]);
		for (int i = 1; i < len - 1; i++) {
			l = getLcm(l, a[i + 1]);
		}
		return l;
	}

	static int getGcd(int a, int b) {
		int temp;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		return b;
	}

}
