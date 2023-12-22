import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 2019/06/16
 * AtCoder Beginner Contest 130
 * 
 * C - Rectangle Cutting
 * 
 * @author rued97
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigDecimal W = new BigDecimal(sc.nextLong());
		BigDecimal H = new BigDecimal(sc.nextLong());
		BigDecimal x = new BigDecimal(sc.nextLong());
		BigDecimal y = new BigDecimal(sc.nextLong());

		// xを固定
		BigDecimal m1;
		{
			BigDecimal a = H.multiply(x);
			BigDecimal b = H.multiply(W.subtract(x));
			if(a.compareTo(b) < 0) {
				m1 = a;
			} else {
				m1 = b;
			}
		}
		// yを固定
		BigDecimal m2;
		{
			BigDecimal a = W.multiply(y);
			BigDecimal b = W.multiply(H.subtract(y));
			if(a.compareTo(b) < 0) {
				m2 = a;
			} else {
				m2 = b;
			}
		}
		
		BigDecimal result1;
		int result2;
		if(((m1.equals(BigDecimal.ZERO)) && (m2.equals(BigDecimal.ZERO)))) {
			result1 = H.multiply(W).divide(new BigDecimal(2));
			result2 = 0;
		} else {
			if(m1.compareTo(m2) > 0) {
				result1 = m1;
				result2 = 0;
				if(H.divide(new BigDecimal(2)) == y) {
					result2 = 1;
				}
			} else if(m1.compareTo(m2) < 0) {
				result1 = m2;
				result2 = 0;
				if(W.divide(new BigDecimal(2)) == x) {
					result2 = 1;
				}
			} else {
				result1 = m1;
				result2 = 1;
			}
		}
		
		
		System.out.println(result1.toString() + " " + result2);
	}
	
}