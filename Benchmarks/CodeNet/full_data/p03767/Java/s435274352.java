import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int[] A = new int[3 * N];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		BigInteger sum = BigInteger.ZERO;
		for (int i = N; i < 2 * N; i++) {
			sum = sum.add(BigInteger.valueOf(A[i]));
		}
		System.out.println(sum);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}