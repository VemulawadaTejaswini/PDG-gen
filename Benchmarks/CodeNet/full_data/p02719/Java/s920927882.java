import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		long N = Long.parseLong(sc.next());
		long K = Long.parseLong(sc.next());
		if (N == 0) {
			System.out.println(N);
			return;
		}

		System.out.println(Math.min(N % K, Math.abs(K - (N % K))));
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}