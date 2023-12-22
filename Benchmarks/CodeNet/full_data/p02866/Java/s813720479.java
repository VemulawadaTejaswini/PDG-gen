import java.math.BigInteger;
import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int[] count = new int[N];
		for (int i = 0; i < N; i++) {
			count[sc.nextInt()]++;
		}
		if (count[0] != 1) {
			System.out.println(0);
			return;
		}
		BigInteger multiply = BigInteger.ONE;
		BigInteger prev = BigInteger.valueOf(count[0]);
		BigInteger mod = BigInteger.valueOf(998244353);
		for (int i = 1; i < count.length; i++) {
			if (count[i] < 1) break;
			BigInteger pow = prev.modPow(prev = BigInteger.valueOf(count[i]), mod);
			multiply = multiply.multiply(pow).mod(mod);
		}
		System.out.println(multiply);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}