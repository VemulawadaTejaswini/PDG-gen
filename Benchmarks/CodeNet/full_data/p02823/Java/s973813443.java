import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		BigDecimal n_ = new BigDecimal(sc.next());
		BigDecimal a_ = new BigDecimal(sc.next());
		BigDecimal b_ = new BigDecimal(sc.next());
		
		BigDecimal n = n_.setScale(0, BigDecimal.ROUND_DOWN);
		BigDecimal a = a_.setScale(0, BigDecimal.ROUND_DOWN);
		BigDecimal b = b_.setScale(0, BigDecimal.ROUND_DOWN);
		
		if (a.subtract(BigDecimal.ONE).compareTo(n.subtract(b)) == -1) {
			exe(a, b, a.subtract(BigDecimal.ONE));
		} else {
			exe(b, a, (n.subtract(b)).negate());
		}
		
	}
	
	private static void exe(BigDecimal a, BigDecimal b, BigDecimal mg) {
		if ((b.subtract(a)).remainder(new BigDecimal(2)) != BigDecimal.ZERO) {
			System.out.println(b.subtract(a).add(mg).abs());
			return;
		}
		System.out.println(b.subtract(a).divide(new BigDecimal(2).abs()));
	}
}