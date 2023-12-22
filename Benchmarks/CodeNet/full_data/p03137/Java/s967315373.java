import java.util.Arrays;
import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] X = new int[M];
		for (int i = 0; i < M; i++) {
			X[i] = sc.nextInt();
		}

		if (M <= N){
			System.out.println(0);
			return;
		}

		Arrays.sort(X);

		for (int i = 1; i < X[X.length - 1] - X[0]; i++) {
			int blocks = 1;
			int streak = 0;
			int count = 0;
			for (int j = 1; j < X.length; j++) {
				if (X[j] - X[j - 1] <= i){
					streak += X[j] - X[j - 1];
				}else {
					count += streak;
					blocks++;
					streak = 0;
				}
			}
			count += streak;
			if (blocks == N){
				System.out.println(count);
				return;
			}
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