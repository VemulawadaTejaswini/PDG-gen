import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		long d = in.nextLong();
		System.out.println(solve(a, b, c, d));
		in.close();
	}

	private static long solve(long a, long b, long c, long d) {
		long r = 0;
		r += (b / c);
		r -= ((a - 1) / c);
		r += (b / d);
		r -= ((a - 1) / d);
		long x = gcm(c, d);
		x = c * d / x;
		r -= (b / x);
		r += ((a - 1) / x);
		return b - a + 1 - r;
	}

	private static long gcm(long c, long d) {
		if (c < d) {
			long x = c;
			c = d;
			d = x;
		}
		if (c % d == 0)
			return d;
		return gcm(d, c % d);
	}
}
