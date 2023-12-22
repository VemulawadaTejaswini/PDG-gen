import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal n = sc.nextBigDecimal();
		BigDecimal m = sc.nextBigDecimal();
		BigDecimal d = sc.nextBigDecimal();
		BigDecimal b;
		BigDecimal one = new BigDecimal(1);
		BigDecimal two = new BigDecimal(2);

		if (d.equals(new BigDecimal(0))) {
			b = m.subtract(one).divide(n);
		} else {
			b =  two.multiply(n.subtract(d)).multiply(m.subtract(one)).divide(n.multiply(n));
		}

		System.out.printf("%.10f%n", b);

		return;
	}
}
