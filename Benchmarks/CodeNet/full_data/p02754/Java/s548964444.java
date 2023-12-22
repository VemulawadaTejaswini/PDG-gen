import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal N = new BigDecimal(sc.next());
		BigDecimal A = new BigDecimal(sc.next());
		BigDecimal B = new BigDecimal(sc.next());
		BigDecimal AB = A.add(B);

		BigDecimal remainder = N.remainder(AB);
		if(remainder.compareTo(A) == 1) {
			remainder = A;
		}
		System.out.println(N.divide(AB, RoundingMode.DOWN).multiply(A).add(remainder).toString());

	}
}