import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private Set<Long> divisors(long x) {
		Set<Long> result = new HashSet<>();

		for (int i = 1; i <= Math.sqrt(x) + 1; i++) {
			if (x % i == 0) {
				result.add((long) i);
				result.add(x / i);
			}
		}

		return result;
	}

	// 最大公約数
	private static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	private int rec(ArrayList<Long> arr, int i, long x) { // arrについてi以降でxと選んだものがすべて互いに素のものを選べる和
		if (i == arr.size()) {
			return 0;
		}

		int b = rec(arr, i + 1, x);

		long l = arr.get(i);
		if (gcd(x, l) == 1) {
			int a = 1 + rec(arr, i + 1, x * arr.get(i));
			b = Math.max(a, b);
		}
		return b;
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long A = sc.nextLong();
		long B = sc.nextLong();

		sc.close();

		Set<Long> cd = divisors(A);
		cd.retainAll(divisors(B));

		ArrayList<Long> arr = new ArrayList<>(cd);

		int ans = rec(arr, 0, 1);

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
