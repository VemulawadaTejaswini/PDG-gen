import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A > B) {
			System.out.println(0);
			return;
		}
		if (N == 1) {
			System.out.println(A == B ? 1 : 0);
			return;
		}
		long min = A * (N - 1) + B;
		long max = B * (N - 1) + A;
		System.out.println(max - min + 1);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}