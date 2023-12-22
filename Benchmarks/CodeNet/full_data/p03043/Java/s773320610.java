import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();
			final int K = s.nextInt();

			final int BASE = (int) Math.ceil(Math.pow(K, 0.5));
			int coin = 0;
			for (int i = 1; i <= N && i < K; i++) {
				coin += Math.pow(2, BASE - Math.ceil(Math.pow(K / i, 0.5)));
			}
			if (N > K) {
				coin += (N - K + 1) * Math.pow(2, BASE);
			}
			System.out.println(coin / Math.pow(2, BASE) / N);
		}
	}
}
