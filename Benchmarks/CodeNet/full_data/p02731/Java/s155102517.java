import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal a = sc.nextBigDecimal();
		BigDecimal c = new BigDecimal("3");
		BigDecimal b = a.divide(c);
		BigDecimal d = b.multiply(b);
		d = d.multiply(b);
		System.out.println(d);
		

	}

}
