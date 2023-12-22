import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		long x = Long.parseLong(str[1]);

		str = br.readLine().split(" ");

		long a[] = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(str[i]) - x;
		}

		long g = Math.abs(a[0]);

		for (int i = 0; i < n; i++) {
			g = gcd(g, Math.abs(a[i]));
		}

		System.out.println(g);
	}

	static long gcd(long m, long n) {
		if (m < n)
			return gcd(n, m);
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}
}
