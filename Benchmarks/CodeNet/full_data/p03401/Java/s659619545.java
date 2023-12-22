import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);
		int N = sc.nextInt();
		int[] A = new int[N + 2];

		A[0] = 5000;
		A[N + 1] = 5000;
		int total = 0;
		for (int i = 1; i <= N; i++) {
			A[i] = sc.nextInt() + 5000;
			total += Math.abs(A[i] - A[i - 1]);
		}
		total += Math.abs(A[N + 1] - A[N]);

		sc.close();

		for (int i = 1; i <= N; i++) {
			int diff = 0;
			if (A[i - 1] <= A[i] && A[i] <= A[i + 1]) {

			} else if (A[i - 1] <= A[i + 1] && A[i + 1] <= A[i]) {
				diff = 2 * (A[i] - A[i + 1]);
			} else if (A[i] <= A[i - 1] && A[i - 1] <= A[i + 1]) {
				diff = 2 * (A[i - 1] - A[i]);
			} else if (A[i] <= A[i + 1] && A[i + 1] <= A[i - 1]) {
				diff = 2 * (A[i + 1] - A[i]);
			} else if (A[i + 1] <= A[i - 1] && A[i - 1] <= A[i]) {
				diff = 2 * (A[i] - A[i - 1]);
			}

			out.println(total - diff);
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
