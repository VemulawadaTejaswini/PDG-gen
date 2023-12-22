import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		if (A % 2 == 0 || B % 2 == 0 || C % 2 == 0) System.out.println(0);
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