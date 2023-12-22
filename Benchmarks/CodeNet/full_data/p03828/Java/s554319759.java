import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	long test(long n) {
		long a = 1;
		for (long i = 1; i <= n; i++) {
			a *= i;
		}

		Set<Long> d = new HashSet<>();
		for (long x = 1; x <= Math.sqrt(a); x++) {
			if (a % x == 0) {
				d.add(x);
				d.add(a / x);
			}
		}

		return d.size();

	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		sc.close();

		int[] p = new int[N + 1];

		for (int n = 2; n <= N; n++) {

			int tmp = n;
			int m = 2;
			while (tmp != 1) {
				if (tmp % m == 0) {
					p[m]++;
					tmp /= m;
				} else {
					m++;
				}
			}
		}

		long ans = 1;
		long mod = 1000_000_007;

		for (int i = 2; i < p.length; i++) {
			ans *= (p[i] + 1);
			ans %= mod;
		}

		out.println(ans);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
