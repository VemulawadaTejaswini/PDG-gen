import java.util.Arrays;
import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int[] S = new int[N];
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += (S[i] = sc.nextInt());
		}
		if (sum % 10 != 0){
			System.out.println(sum);
			return;
		}
		Arrays.sort(S);
		for (int s : S) {
			if (s % 10 != 0) {
				System.out.println(sum - s);
				return;
			}
		}
		System.out.println(0);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}