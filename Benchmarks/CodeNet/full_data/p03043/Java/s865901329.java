import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final long N = s.nextLong();
			final long K = s.nextLong();

			final int BASE = (int) Math.ceil(Math.pow(K, 0.5));
			BigDecimal coin = BigDecimal.ZERO;
			for (long i = 1; i <= N && i < K; i++) {
				coin.add(BigDecimal.valueOf(Math.pow(2, BASE - Math.ceil(Math.pow(K / i, 0.5)))));
			}
			final BigDecimal W = BigDecimal.valueOf(2).pow(BASE);
			if (N >= K) {
				coin.add(BigDecimal.valueOf(N - K + 1).multiply(W));
			}
			System.out.println(
					coin.divide(W, 12, RoundingMode.HALF_UP)
							.divide(BigDecimal.valueOf(N), 12, RoundingMode.HALF_UP));
		}
	}
}
