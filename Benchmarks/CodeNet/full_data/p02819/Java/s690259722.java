import java.math.BigInteger;
import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int x = sc.nextInt();
		BigInteger v = BigInteger.valueOf(x);
		if (v.isProbablePrime(100)) {
			System.out.println(x);
		} else {
			System.out.println(v.nextProbablePrime());
		}
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}