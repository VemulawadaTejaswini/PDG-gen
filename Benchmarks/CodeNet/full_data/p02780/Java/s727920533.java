import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		float[] P = new float[N];

		for (int i = 0; i < N; i++) {
			P[i] = (float) ((0.5 * sc.nextFloat()) + 0.5);
		}

		float FIRST = 0;
		for (int i = 0; i < K; i++) {
			FIRST += P[i];
		}
		float BEFORE = FIRST;
		float MAX = FIRST;

		for (int i = 1; i <= N - K; i++) {
			float EXP = BEFORE - P[i - 1] + P[i + K - 1];

			BEFORE = EXP;

			if (EXP > MAX) {
				MAX = EXP;
			}

		}

		System.out.println(String.format("%.12f", MAX));

		sc.close();
	}

}
