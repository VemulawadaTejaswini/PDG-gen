import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		if (A * B * C % 2 == 0) System.out.println(0);
		else System.out.println(Math.min(A * B, Math.min(B * C, C * A)));
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}