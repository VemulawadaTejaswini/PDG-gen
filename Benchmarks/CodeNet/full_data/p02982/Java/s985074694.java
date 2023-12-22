import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();
			final int D = s.nextInt();
			final int X[][] = new int[N][D];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < D; j++) {
					X[i][j] = s.nextInt();
				}
			}

			int ret = 0;
			for (int i = 0; i < N; i++) {
				for (int j = i + 1; j < N; j++) {
					if (calc(X[i], X[j])) {
						ret++;
					}
				}
			}
			System.out.println(ret);
		}
	}

	static boolean calc(int[] x1, int[] x2) {
		int sum = 0;
		for (int i = 0; i < x1.length; i++) {
			sum += (x2[i] - x1[i]) * (x2[i] - x1[i]);
		}

		return Math.sqrt(sum) == (int) Math.sqrt(sum);
	}
}
