import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int[] C = new int[N];
		int[] S = new int[N];
		int[] F = new int[N];
		int[] x = new int[N];
		x[N - 1] = 0;
		int sumC = 0;
		int sumI = 0;
		for (int i = 0; i < N - 1; i++) {
			C[i] = s.nextInt();
			S[i] = s.nextInt();
			F[i] = s.nextInt();
		}
		C[N - 1] = 0;
		S[N - 1] = 0;
		F[N - 1] = 0;

		for (int i = 0; i < N - 1; i++) {
			sumI = C[i] + S[i];
			for (int j = i + 1; j < N - 1; j++) {
				if (sumI < S[j]) {
					sumI = S[j];
				} else if (sumI % F[j] != 0) {
					int update = 1;
					while (sumI > S[j] + F[j] * update) {
						++update;
					}
					sumI = S[j] + F[j] * update;
				}

				sumI += C[j];

			}
			x[i] = sumI;
		}

		for (int i = 0; i < N; i++) {
			System.out.println(x[i]);
		}

	}
}
