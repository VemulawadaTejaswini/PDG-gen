import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		BigDecimal a = new BigDecimal(sc.nextInt());

		BigDecimal x = a.subtract(BigDecimal.ONE).multiply(new BigDecimal("0.5"));
		BigDecimal result = x.multiply(a);

		result = result.setScale(0,BigDecimal.ROUND_DOWN);
		System.out.println(result.toPlainString());
	}
}