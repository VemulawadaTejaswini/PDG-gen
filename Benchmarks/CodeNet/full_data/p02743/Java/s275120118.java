import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal A = new BigDecimal(sc.nextLong());
		BigDecimal B = new BigDecimal(sc.nextLong());
		BigDecimal C = new BigDecimal(sc.nextLong());
		MathContext mc = new MathContext(10,RoundingMode.HALF_UP);
		if (A.sqrt(mc).add(B.sqrt(mc)).compareTo(C.sqrt(mc)) == -1 ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}