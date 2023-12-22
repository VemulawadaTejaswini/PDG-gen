import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author wuyue
 *
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double m = sc.nextDouble();
		double k = sc.nextDouble();
		
//		int nn = (int) Math.sqrt(n);
//		int mm = (int) Math.sqrt(m);
//		int kk = (int) Math.sqrt(k);
//		if (nn + mm < kk) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}
		if (k - m- n>=0) {
			double dd = Math.pow(k-m-n, 2.0);
			if ((dd - 4.0*n*m) > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			if (Math.sqrt(n) + Math.sqrt(m) < Math.sqrt(k)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		
		
		
	}

}
