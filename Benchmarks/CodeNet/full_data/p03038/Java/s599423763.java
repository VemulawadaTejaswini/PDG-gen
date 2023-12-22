import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) throws Exception {
		sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<Long> A = new ArrayList<Long>();
		for (int i = 0; i < N; i++) {
			A.add(sc.nextLong());
		}

		ArrayList<int[]> B = new ArrayList<int[]>();

		for (int i = 0; i < M; i++) {
			B.add(new int[] { sc.nextInt(), sc.nextInt() });
		}

		Collections.sort(A);

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < B.get(i)[0] && A.get(j) < B.get(i)[1]; j++) {
				A.set(j, (long) B.get(i)[1]);
			}
			Collections.sort(A);
		}

		System.out.println(A.parallelStream().reduce((base, value) -> base + value).get());

	}
}
