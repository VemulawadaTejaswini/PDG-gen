
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ABC117_A();
		ABC117_B();
	}

	private static void ABC117_A() {
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

	private static void ABC117_B() {
		Scanner scanner = null;
		int numN = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			int[] wkArray = new int[numN];
			for (int i = 0; i < numN; i++) {
				wkArray[i] = scanner.nextInt();
			}

			Arrays.sort(wkArray);

			int max = 0;
			int others = 0;
			for (int i = numN - 1; i >= 0; i--) {
				if (i == numN - 1) {
					max = wkArray[i];
				} else {
					others += wkArray[i];
				}

			}
			System.out.println(max < others ? "Yes" : "No");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}