
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());

		int[] A = new int[N + 1];
		int S = 0;
		for (int i = 1; i <= N; i++) {
			A[i] = Integer.parseInt(sc.next());
			S += A[i];
		}
		sc.close();
		S /= 2;

		for (int i = 1; i <= N; i++) {
			int x = S;
			if (i % 2 == 1) {
				for (int j = 1; j < i; j += 2) {
					x -= A[j];
				}
				for (int j = i + 1; j <= N - 1; j += 2) {
					x -= A[j];
				}
			} else {
				for (int j = 2; j < i; j += 2) {
					x -= A[j];
				}
				for(int j = i + 1;j <= N;j += 2) {
					x -= A[j];
				}
			}
			System.out.print(x * 2 + " ");
		}
		System.out.println();

	}
}
