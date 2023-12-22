import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] count = new int[2 * 100000];
		for (int i = 0; i < N; i++) {
			count[(A[i] = sc.nextInt()) - 1] += 1;
		}
		int pattern = 0;
		for (int i : count) {
			pattern += i * (i - 1) / 2;
		}
		for (int a : A) {
			System.out.println(pattern - count[a - 1] + 1);
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