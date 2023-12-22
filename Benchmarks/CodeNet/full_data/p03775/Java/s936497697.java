import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		long N = sc.nextLong();

		int result = String.valueOf(N).length();

		for (long f = 2; f * f <= N; f++) {
			if (N % f != 0) continue;
			result = Math.min(result, String.valueOf(N / f).length());
		}
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