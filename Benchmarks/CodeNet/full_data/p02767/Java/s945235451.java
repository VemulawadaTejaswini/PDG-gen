import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int[] X = new int[N];
		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
		}
		IntSummaryStatistics statistics = Arrays.stream(X).summaryStatistics();
		long ceil = (long) Math.ceil(statistics.getAverage());
		long floor = (long) Math.floor(statistics.getAverage());
		long ceilSum = 0;
		long floorSum = 0;
		for (int i = 0; i < N; i++) {
			long C = X[i] - ceil;
			ceilSum += C * C;
			long F = X[i] - floor;
			floorSum += F *F;
		}

		System.out.println(Math.min(ceilSum, floorSum));
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}