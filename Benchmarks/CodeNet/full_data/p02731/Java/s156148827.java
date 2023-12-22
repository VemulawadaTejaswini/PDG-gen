import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong();
		BigDecimal x = new BigDecimal(l);
		BigDecimal y = x.divide(new BigDecimal(3),6);
		System.out.println(y.multiply(y).multiply(y));
		
		

	}

}