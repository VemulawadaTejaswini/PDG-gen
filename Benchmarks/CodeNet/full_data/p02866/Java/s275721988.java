import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int[] count = new int[N];
		for (int i = 0; i < N; i++) {
			count[sc.nextInt()]++;
		}
		if (count[0] > 1) {
			System.out.println(0);
			return;
		}
		long multiply = 1;
		for (int i = 1; i < count.length; i++) {
			if (count[i] < 1) break;
			long pow = modPow(count[i - 1], count[i], 998244353);
			multiply = (multiply * pow) % 998244353;
		}
		System.out.println(multiply);
	}

	long modPow(long base, long exponent, long mod) {
		long result = 1;
		while (exponent > 0) {
			if (exponent % 2 == 1) {
				result = result * base % mod;
				exponent -= 1;
			} else {
				base = base * base % mod;
				exponent = exponent >> 1;
			}
		}
		return result;
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}