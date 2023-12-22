import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		int max = 0;
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			if (K == a) {
				System.out.println("POSSIBLE");
				return;
			}
			A[i] = a;
			max = Math.max(a, max);
		}
		if (max < K) {
			System.out.println("IMPOSSIBLE");
			return;
		}

		int gcd = A[0];
		for (int i = 1; i < A.length; i++) {
			gcd = gcd(gcd, A[i]);
			if (gcd == 1) {
				System.out.println("POSSIBLE");
				return;
			}
		}
		System.out.println(K % gcd == 0 ? "POSSIBLE" : "IMPOSSIBLE");
	}

	int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}