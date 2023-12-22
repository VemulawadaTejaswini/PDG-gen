import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		long A = sc.nextLong();
		long B = sc.nextLong();
		long X = sc.nextLong();

		long result = (B / X) - ((A - 1) / X);
		System.out.println(result);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}