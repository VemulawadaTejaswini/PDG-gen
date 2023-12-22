
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<BigDecimal> list = new ArrayList<BigDecimal>();
		for (int i = 0; i < n; i++) {
			list.add(new BigDecimal(sc.next()));
		}
		Collections.sort(list);
		Collections.reverse(list);

		BigDecimal totalAmount = BigDecimal.ZERO;
		int count = 0;
		for (final BigDecimal amount : list) {
			totalAmount = totalAmount.add(count == 0 ? amount.divide(BigDecimal.valueOf(2)) : amount);
			count++;
		}

		System.out.println(totalAmount.setScale(0, RoundingMode.DOWN));

	}

}
