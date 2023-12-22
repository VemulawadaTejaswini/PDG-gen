import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] X = new int[N];
		int max = 0;

		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();

			if (X[i] > max) {
				max = X[i];
			}
		}

		int[] score = new int[max];
		int ans = 1000000000;

		for (int i = 0; i < max; i++) { // i + 1 = P
			for (int j = 0; j < N; j++) {
				int s = (int) Math.pow(X[j] - (i + 1), 2);
				score[i] += s;
			}

			if (score[i] < ans) {
				ans = score[i];
			}
		}

		System.out.println(ans);

		sc.close();
	}

}
