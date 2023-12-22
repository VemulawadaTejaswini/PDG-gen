import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
/**
 * @author fangda.wang
 */
public class Reconciled {

	private final static int MOD = 1_000_000_000 +7;
	private final static BigDecimal B_MOD = BigDecimal.valueOf(MOD);

	public static void main (String... args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] vals = reader.readLine().split(" ");
		final int N = Integer.parseInt(vals[0]);
		final int M = Integer.parseInt(vals[1]);

		if (Math.abs(N-M) > 1) {
			System.out.print(0);
			return;
		}

		BigDecimal result;

		if (N == M) {
			result = BigDecimal.valueOf(2).multiply(getPermutation(N)).multiply(getPermutation(N));
		} else {
			result = getPermutation(N).multiply(getPermutation(M));
		}

		System.out.print(result.remainder(B_MOD));

	}

	private static BigDecimal getPermutation(final int n) {
		BigDecimal result = BigDecimal.ONE;
		for (int i = 1; i <= n; i++) {
			result = result.multiply(BigDecimal.valueOf(i));
			if (result.compareTo(B_MOD) == 1) result = result.remainder(B_MOD);
		}
		return result;
	}


}
