import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			BigDecimal a1 = new BigDecimal(a);
			BigDecimal b1 = new BigDecimal(b);
			BigDecimal c1 = new BigDecimal(c);
			BigDecimal ar = a1.sqrt(new MathContext(100));
			BigDecimal br = b1.sqrt(new MathContext(100));
			BigDecimal cr = c1.sqrt(new MathContext(100));

			if(ar.add(br).compareTo(cr) < 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}
