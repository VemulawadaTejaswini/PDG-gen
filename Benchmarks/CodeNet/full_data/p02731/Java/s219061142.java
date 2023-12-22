import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		
		BigDecimal bd1 = BigDecimal.valueOf(L*L*L);
		BigDecimal bd2 = new BigDecimal(27);
		
		BigDecimal bd3 = bd1.divide(bd2,10, RoundingMode.HALF_UP);

		
		System.out.println(bd3);
	}
}