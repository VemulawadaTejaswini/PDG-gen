import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = Integer.parseInt(sc.next());
		for (int i = 1; i <= N; i++) {
			long sum = (i * (i + 1L)) / 2;
			if (N <= sum) {
				System.out.println(IntStream.rangeClosed(1, i).filter(j -> j != (sum - N)).mapToObj(String::valueOf).collect(Collectors.joining("\n")));
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