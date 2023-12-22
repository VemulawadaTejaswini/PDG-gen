import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = Integer.parseInt(sc.next());
		int[] odd = new int[100000];
		int[] even = new int[100000];
		for (int i = 0; i < N; i++) {
			if ((i & 1) == 1) {
				even[Integer.parseInt(sc.next()) - 1] += 1;
			} else {
				odd[Integer.parseInt(sc.next()) - 1] += 1;
			}
		}
		int oddMax = 0;
		int evenMax = 0;
		for (int i = 0; i < 100000; i++) {
			if (odd[oddMax] < odd[i]) {
				oddMax = i;
			}
			if (even[evenMax] < even[i]) {
				evenMax = i;
			}
		}
		if (oddMax != evenMax) {
			System.out.println(N - (odd[oddMax] + even[evenMax]));
			return;
		}
		int om = odd[oddMax];
		int em = even[evenMax];
		odd[oddMax] = 0;
		even[evenMax] = 0;
		for (int i = 0; i < 100000; i++) {
			if (odd[oddMax] < odd[i]) {
				oddMax = i;
			}
			if (even[evenMax] < even[i]) {
				evenMax = i;
			}
		}
		System.out.println(N - Math.max(om + even[evenMax], em + odd[oddMax]));
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}