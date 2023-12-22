import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

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

		ave /= (i);
		System.out.println(ave);
		int t = 0;
		int u = 0;
		for (int j = 0; j < n; j++) {
			if (v[j] == v[i - 1]) {
				u++;
				if (j < i) t++;
			}
			if (v[j] < v[i]) break;
		}

		if (u == 1) {
			System.out.println(1);
			return;
		}

		if (ave != v[i - 1]) {
			long x = 1;
			long y = 1;
			for (int j = 0; j < t; j++) {
				x *= (u - j);
				y *= (j + 1);
			}
			System.out.println(x / y);
			return;
		}

		BigInteger x = BigInteger.ONE;
		BigInteger y = BigInteger.ONE;
		long d = 0;
		for (int j = 0; j + 1 <= b - i + t && j < u; j++) {
			x = x.multiply(BigInteger.valueOf(u - j));
			y = y.multiply(BigInteger.valueOf(j + 1));

			if (j + 1 >= t) d += x.divide(y).longValue();
		}

		System.out.println(d);
	}
}
