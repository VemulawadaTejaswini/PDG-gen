import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double n = sc.nextDouble();
		Double m = sc.nextDouble();
		Double d = sc.nextDouble();
		
		Double ans = ((n * 2) - (d * 2)) / (n * n) * (m - 1);
		if (d == 0) {
			ans /= 2;
		}
		BigDecimal ans2 = new BigDecimal(ans);
		System.out.println(ans2.toPlainString());
	}
}