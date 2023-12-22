import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int D = sc.nextInt();
		int N = sc.nextInt();
		if (D == 0){
			System.out.println(N == 100 ? 101 : N);
		} else if (D == 1){
			System.out.println(N == 100 ? 10100 : 100 * N);
		} else {
			System.out.println(N == 100 ? 1010000 : 10000 * N);
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