
import java.math.*;
import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int placeCount = sc.nextInt();
			int t = sc.nextInt();
			int target = sc.nextInt();

			int[] places = new int[placeCount];
			int i = 0;
			while (i < placeCount) {
				places[i] = sc.nextInt();
				i++;
			}

			BigDecimal abs = null;
			int j = 1;
			int result = 0;
			for (int p : places) {
				BigDecimal val = getValue(t, p);

				BigDecimal wk = val.subtract(BigDecimal.valueOf(target));
				if (abs == null || abs.compareTo(wk.abs()) >= 0) {
					abs = wk.abs();
					result = j;
				}
				j++;
			}
			System.out.println(result);
		}
	}

	public static BigDecimal getValue(int t, int x) {
		return BigDecimal.valueOf(t)
			.subtract(BigDecimal.valueOf(x).multiply(BigDecimal.valueOf(0.006)));
	}
}
