import java.util.*;
import java.math.BigDecimal;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		BigDecimal aa = new BigDecimal(Math.sqrt(a));
		BigDecimal bb = new BigDecimal(Math.sqrt(b));
		BigDecimal cc = new BigDecimal(Math.sqrt(c));
		BigDecimal r = aa.add(bb);
		//r = r.sub(cc);
		if (r.compareTo(cc) == -1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}