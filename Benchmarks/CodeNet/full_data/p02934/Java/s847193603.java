
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			BigDecimal result = BigDecimal.ZERO;
			for (int i = 0; i < n; i++) {
				result = result.add(BigDecimal.ONE.divide(sc.nextBigDecimal(), 10, BigDecimal.ROUND_HALF_UP));
			}
			System.out.println(BigDecimal.ONE.divide(result, 10, BigDecimal.ROUND_HALF_UP));
		}
	}
}
