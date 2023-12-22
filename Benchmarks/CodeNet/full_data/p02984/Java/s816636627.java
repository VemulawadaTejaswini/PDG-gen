
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());

		long[] A = new long[N + 1];
		long S = 0;
		for (int i = 1; i <= N; i++) {
			A[i] = Long.parseLong(sc.next());
			S += A[i];
		}
		sc.close();
		S /= 2;

		long x1 = S;
		for (int j = 2; j <= N - 1; j += 2) {
			x1 -= A[j];
		}
		System.out.print(x1 * 2 + " ");

		long x = x1;
		for (int i = 2; i <= N; i++) {
			x = A[i - 1] - x;
			System.out.print(x * 2 + " ");
		}
		System.out.println();

	}
}
