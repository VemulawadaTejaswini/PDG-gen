import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long times = N / (A + B);
		long m = N % (A + B);
		System.out.println(times * A + Math.min(m, A));
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}