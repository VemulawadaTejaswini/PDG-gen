import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		long[][] c = new long[51][51];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) c[i][j] = 1;
				else c[i][j] = c[i - 1][j - 1] + c[i - 1][j];
			}
		}

		Long[] v = new Long[n];
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextLong();
		}

		Arrays.sort(v, Comparator.reverseOrder());

		double ave = 0.0;
		int i;
		for (i = 0; i < n && i < a; i++) {
			ave += v[i];
		}

		ave /= a;
		System.out.println(ave);

		int t = 0;
		int u = 0;
		for (int j = 0; j < n; j++) {
			if (v[j] == v[i - 1]) {
				u++;
				if (j < a) t++;
			}
			if (v[j] < v[i]) break;
		}

		if (u == 1) {
			System.out.println(1);
			return;
		}

		if (ave != v[i - 1]) {
			System.out.println(c[u][t]);
			return;
		}
		long count = 0L;
		for (int j = t; j - t + a <= b && j <= u; j++) {
			count += c[u][j];
		}

		System.out.println(count);
	}
}
