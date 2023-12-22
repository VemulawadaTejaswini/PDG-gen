import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int x = sc.nextInt();

		BigDecimal bT = BigDecimal.valueOf(t);
		BigDecimal bX = BigDecimal.valueOf(x);

		BigDecimal b = bT.divide(bX, 10, BigDecimal.ROUND_HALF_UP);

		System.out.println(b);


	}

}
