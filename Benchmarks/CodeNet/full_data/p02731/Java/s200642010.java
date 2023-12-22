import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal l = sc.nextBigDecimal();
		 BigDecimal length = l.divide(BigDecimal.valueOf(3),4,RoundingMode.HALF_UP);
		 BigDecimal ans = length.multiply(length).multiply(length);
		System.out.println(ans);
		sc.close();
	}
}