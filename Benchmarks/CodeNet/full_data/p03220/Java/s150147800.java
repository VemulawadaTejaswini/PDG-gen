
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		Integer n = sc.nextInt();
		BigDecimal t = BigDecimal.valueOf(sc.nextInt());
		Integer a = sc.nextInt();

		int place = 0;
		int prevtemp = 0;
		for (int i = 0; i < n; i++) {
			final int temp = (t.subtract(BigDecimal.valueOf(sc.nextInt()).multiply(BigDecimal.valueOf(0.006))))
					.intValue();
			if (i == 0) {
				place = i + 1;
				continue;
			}
			if (Math.abs(prevtemp - a) > Math.abs(temp - a)) {
				place = i + 1;
			}
			prevtemp = temp;
		}

		System.out.println(place);

	}

}
