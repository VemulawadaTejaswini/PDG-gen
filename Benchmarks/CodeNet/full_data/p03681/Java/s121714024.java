import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {

		final long MOD = 1000000007;

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int M = sc.nextInt();

		long answer = 0;

		if (Math.abs(N - M) > 1) {
			answer = 0;
		} else if (N == M) {
			long permutations = 1;
			for (int i = 0; i < N; i++) {
				permutations = (permutations * (i + 1)) % MOD;
			}
			answer = ((permutations * permutations) * 2) % MOD;

		} else {
			long dogPerm = 1;
			long monkeyPerm = 1;
			for (int i = 0; i < N; i++) {
				dogPerm = (dogPerm * (i + 1)) % MOD;
			}
			for (int i = 0; i < M; i++) {
				monkeyPerm = (monkeyPerm * (i + 1)) % MOD;
			}
			answer = (dogPerm * monkeyPerm) % MOD;
		}
		System.out.println(answer);
		sc.close();
	}
}