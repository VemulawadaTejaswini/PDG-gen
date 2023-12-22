import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] C = new int[N - 1];
		int[] S = new int[N - 1];
		int[] F = new int[N - 1];
		for (int i = 0; i < N - 1; i++) {
			C[i] = in.nextInt();
			S[i] = in.nextInt();
			F[i] = in.nextInt();
		}
		for (int i = 0; i < N - 1; i++) {
			int t = S[i] + C[i];
			for (int j = i + 1; j < N - 1; j++) {
				if (t % F[j] == 0) {
					t += S[j] <= t ? C[j] : S[j] - t + C[j];
				} else {
					t += S[j] <= t ? F[j] - t % F[j] + C[j] : S[j] - t + C[j];
				}
			}
			System.out.println(t);
		}
		System.out.println(0);
		in.close();
	}
}