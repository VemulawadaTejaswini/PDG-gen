
import java.util.Scanner;
import java.math.*;

public class Main {

	/*
	 * 余りの最大値を求める。
	 */
	public static void main(String[] args) {

		/*
		 * Scannerで値取得。
		 */
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		s.close();

		int odd = number / 2;
		if(number % 2 == 1) {
			odd++;
		}
		
		BigDecimal bans = new BigDecimal(number);
		BigDecimal bodd = new BigDecimal(odd);
		BigDecimal divide = bodd.divide(bans,7,BigDecimal.ROUND_UP);
		
		System.out.println(divide);

	}

}
