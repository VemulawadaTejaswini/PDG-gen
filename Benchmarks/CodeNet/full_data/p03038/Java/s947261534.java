import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		class fill implements Comparable<fill> {
			final int count;
			final int value;

			fill(int count, int value) {
				this.count = count;
				this.value = value;
			}

			@Override
			public int compareTo(fill o) {
				return Comparator.<fill>comparingInt(f -> f.value).compare(this, o);
			}
		}
		fill[] fillers = new fill[M];
		for (int i = 0; i < M; i++) {
			fillers[i] = new fill(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(fillers, Comparator.reverseOrder());

		long sum = 0;
		int i = 0;
		f:
		for (fill filler : fillers) {
			for (int j = 0; j < filler.count; j++) {
				if (A[i] > filler.value) {
					break f;
				}
				sum += filler.value;
				i++;
			}
		}
		for (; i < A.length; i++) {
			sum += A[i];
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