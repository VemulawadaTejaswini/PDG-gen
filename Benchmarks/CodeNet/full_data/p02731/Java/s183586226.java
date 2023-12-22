import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		
		BigDecimal bd1 = new BigDecimal(L*L*L);
		BigDecimal bd2 = new BigDecimal(27);
		
		BigDecimal bd3 = bd1.divide(bd2);

		
		System.out.println(bd3);
	}
}