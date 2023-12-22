import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] A = new int[N];
		int[][] BC = new int[M][2];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < M; i++) {
			BC[i][0] = sc.nextInt();
			BC[i][1] = sc.nextInt();
		}

		Arrays.sort(A);
		Arrays.sort(BC, (a, b) -> Integer.compare(b[1], a[1])); //降順

		int bci = 0;
		for (int ai = 0; ai < A.length; ai++) {
			if (A[ai] >= BC[bci][1]) {
				break;
			}
			A[ai] = BC[bci][1];
			BC[bci][0]--;
			if (BC[bci][0] <= 0) {
				bci++;
			}
			if (bci >= BC.length) {
				break;
			}
		}

		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans += A[i];
		}

		out.println(ans);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
