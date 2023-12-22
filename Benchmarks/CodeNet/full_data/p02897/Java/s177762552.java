import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main{

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();
		int bunshi = N/2;

		if (N%2==1) {
			bunshi++;
		}

		BigDecimal b1 = new BigDecimal(String.valueOf(N));
		BigDecimal b2 = new BigDecimal(String.valueOf(bunshi));

		BigDecimal answer =(b2.divide(b1,10,RoundingMode.HALF_UP));

		System.out.println(answer);
	}
}