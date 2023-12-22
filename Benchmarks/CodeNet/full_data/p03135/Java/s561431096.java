
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = null;
		String numT = "";
		String numX = "";

		try {
			scanner = new Scanner(System.in);
			numT = scanner.next();
			numX = scanner.next();

			BigDecimal result = new BigDecimal(numT).divide(
					new BigDecimal(numX), 6, RoundingMode.HALF_UP);
			System.out.println(result.floatValue());

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}