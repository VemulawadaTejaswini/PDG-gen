package atcoder.ABC079;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class MainA {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		BigDecimal one = new BigDecimal("1");
		BigDecimal mone = new BigDecimal("-1");
		BigDecimal two = new BigDecimal("2");
		BigDecimal rfive = new BigDecimal(Math.sqrt(5));

		MathContext mc = new MathContext(100, RoundingMode.HALF_UP);

		BigDecimal lucas = ((one.add(rfive)).divide(two, 18, RoundingMode.HALF_UP)).pow(n, mc).add(one.divide(((one.add(rfive)).divide(two, 18, RoundingMode.HALF_UP).multiply(mone)).pow(n, mc), 18, RoundingMode.HALF_UP));

		long a = lucas.longValue();

		System.out.println(a);
	}
}
