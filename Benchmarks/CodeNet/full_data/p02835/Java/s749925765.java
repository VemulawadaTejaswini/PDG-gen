import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		if (sc.nextInt() + sc.nextInt() + sc.nextInt() < 22) {
			System.out.println("win");
		} else {
			System.out.println("bust");
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