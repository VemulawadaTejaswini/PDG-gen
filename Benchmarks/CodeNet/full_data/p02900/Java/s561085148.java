import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		long a = in.nextLong();
		long b = in.nextLong();
		System.out.println(solve(a, b));
		in.close();
	}

	private static long solve(long a, long b) {
		long x = lcm(a, b);
		long r = 0;
		long m=(long) (Math.sqrt(x)+1);
		for (long i = 2; i <= m; i++)
			if (x % i == 0) {
//				System.out.println(i+" "+x);
				r++;
				while (x % i == 0)
					x /= i;
			}
		return r+1;
	}

	private static long lcm(long a, long b) {
		if (a > b) {
			long t = a;
			a = b;
			b = t;
		}
		if (b % a == 0)
			return a;
		return lcm(a, b % a);
	}
}