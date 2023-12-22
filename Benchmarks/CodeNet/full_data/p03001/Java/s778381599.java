import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long W = sc.nextLong();
		long H = sc.nextLong();
		long x = sc.nextLong();
		long y = sc.nextLong();
		sc.close();
		int ans2 = 0;
		if (x * 2 == W && y * 2 == H) {
			ans2 = 1;
		}
		BigDecimal bg_W = new BigDecimal(W);
		BigDecimal bg_H = new BigDecimal(H);

		System.out.print(bg_W.multiply(bg_H).divide(new BigDecimal(2), BigDecimal.ROUND_DOWN));
		System.out.println(" " + ans2);
	}
}
